package typings.baiduApp.swan

import typings.baiduApp.baiduAppStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothAdapterStateData extends ErrMsgResponse {
  
  /**
    * 蓝牙适配器信息
    */
  var adapterState: BluetoothAdapterState = js.native
}
object BluetoothAdapterStateData {
  
  @scala.inline
  def apply(adapterState: BluetoothAdapterState, errMsg: ok | String): BluetoothAdapterStateData = {
    val __obj = js.Dynamic.literal(adapterState = adapterState.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothAdapterStateData]
  }
  
  @scala.inline
  implicit class BluetoothAdapterStateDataOps[Self <: BluetoothAdapterStateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdapterState(value: BluetoothAdapterState): Self = this.set("adapterState", value.asInstanceOf[js.Any])
  }
}
