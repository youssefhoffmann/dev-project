package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Window;

import java.util.List;

public interface WindowDaoCustom {

    // Find all Open Windows in a Room
    List<Window> findRoomOpenWindows(Long id);

    // Delete all Windows That existe in a Room.
    int deleteByRoom(Long IdRoom);
}
