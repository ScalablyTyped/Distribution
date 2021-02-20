package typings.baiduApp.anon

import typings.baiduApp.baiduAppStrings.ok
import typings.baiduApp.swan.BluetoothDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  devices :std.Array<baidu-app.swan.BluetoothDevice>} & baidu-app.swan.ErrMsgResponse */
@js.native
trait devicesArrayBluetoothDevi extends StObject {
  
  var devices: js.Array[BluetoothDevice] = js.native
  
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String = js.native
}
object devicesArrayBluetoothDevi {
  
  @scala.inline
  def apply(devices: js.Array[BluetoothDevice], errMsg: ok | String): devicesArrayBluetoothDevi = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[devicesArrayBluetoothDevi]
  }
  
  @scala.inline
  implicit class devicesArrayBluetoothDeviMutableBuilder[Self <: devicesArrayBluetoothDevi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: js.Array[BluetoothDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesVarargs(value: BluetoothDevice*): Self = StObject.set(x, "devices", js.Array(value :_*))
    
    @scala.inline
    def setErrMsg(value: ok | String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
