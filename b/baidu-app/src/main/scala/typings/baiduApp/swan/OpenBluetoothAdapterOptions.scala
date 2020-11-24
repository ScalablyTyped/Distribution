package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 设备-----蓝牙
@js.native
trait OpenBluetoothAdapterOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MOpenBluetoothAdapterOptions(res: js.Any): Unit = js.native
}
object OpenBluetoothAdapterOptions {
  
  @scala.inline
  def apply(success: js.Any => Unit): OpenBluetoothAdapterOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenBluetoothAdapterOptions]
  }
  
  @scala.inline
  implicit class OpenBluetoothAdapterOptionsOps[Self <: OpenBluetoothAdapterOptions] (val x: Self) extends AnyVal {
    
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
    def setSuccess(value: js.Any => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
}
