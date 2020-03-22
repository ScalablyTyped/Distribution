package typings.baiduApp

import typings.baiduApp.baiduAppStrings.ok
import typings.baiduApp.swan.BluetoothDevice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  devices  :std.Array<baidu-app.swan.BluetoothDevice>} & baidu-app.swan.ErrMsgResponse */
trait devicesArrayBluetoothDevi extends js.Object {
  var devices: js.Array[BluetoothDevice]
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String
}

object devicesArrayBluetoothDevi {
  @scala.inline
  def apply(devices: js.Array[BluetoothDevice], errMsg: ok | String): devicesArrayBluetoothDevi = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[devicesArrayBluetoothDevi]
  }
}

