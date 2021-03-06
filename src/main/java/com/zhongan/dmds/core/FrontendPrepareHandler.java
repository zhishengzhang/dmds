/*
 * Copyright (C) 2016-2020 zhongan.com
 * based on code by MyCATCopyrightHolder Copyright (c) 2013, OpenCloudDB/MyCAT.
 * License: http://www.gnu.org/licenses/gpl.html GPL version 2 or higher.
 */
package com.zhongan.dmds.core;

/**
 * SQL预处理处理器
 */
public interface FrontendPrepareHandler {

  void prepare(String sql);

  void execute(byte[] data);

  void close();

}