package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 设备-----蓝牙
trait OpenBluetoothAdapterOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MOpenBluetoothAdapterOptions(res: js.Any): Unit
}
object OpenBluetoothAdapterOptions {
  
  @scala.inline
  def apply(success: js.Any => Unit): OpenBluetoothAdapterOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenBluetoothAdapterOptions]
  }
  
  @scala.inline
  implicit class OpenBluetoothAdapterOptionsMutableBuilder[Self <: OpenBluetoothAdapterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: js.Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
