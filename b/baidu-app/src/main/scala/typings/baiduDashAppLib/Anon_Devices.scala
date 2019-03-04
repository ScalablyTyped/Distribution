package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Devices extends js.Object {
  var devices: js.Array[baiduDashAppLib.swanNs.BluetoothDevice]
}

object Anon_Devices {
  @scala.inline
  def apply(devices: js.Array[baiduDashAppLib.swanNs.BluetoothDevice]): Anon_Devices = {
    val __obj = js.Dynamic.literal(devices = devices)
  
    __obj.asInstanceOf[Anon_Devices]
  }
}

