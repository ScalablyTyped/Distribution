package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * 蓝牙设备信息
	 */
trait BluetoothDevice extends js.Object {
  /**
  		 * int 当前蓝牙设备的信号强度
  		 */
  var RSSI: scala.Double
  /**
  		 * 当前蓝牙设备的广播内容
  		 */
  var advertisData: stdLib.ArrayBuffer
  /**
  		 * 用于区分设备的 id
  		 */
  var deviceId: java.lang.String
  /**
  		 * 蓝牙设备名称，某些设备可能没有
  		 */
  var name: java.lang.String
}

object BluetoothDevice {
  @scala.inline
  def apply(
    RSSI: scala.Double,
    advertisData: stdLib.ArrayBuffer,
    deviceId: java.lang.String,
    name: java.lang.String
  ): BluetoothDevice = {
    val __obj = js.Dynamic.literal(RSSI = RSSI, advertisData = advertisData, deviceId = deviceId, name = name)
  
    __obj.asInstanceOf[BluetoothDevice]
  }
}

