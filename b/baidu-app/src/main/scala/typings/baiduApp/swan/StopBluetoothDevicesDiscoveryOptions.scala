package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopBluetoothDevicesDiscoveryOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  def success_MStopBluetoothDevicesDiscoveryOptions(res: ErrMsgResponse): Unit
}
object StopBluetoothDevicesDiscoveryOptions {
  
  inline def apply(success: ErrMsgResponse => Unit): StopBluetoothDevicesDiscoveryOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[StopBluetoothDevicesDiscoveryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopBluetoothDevicesDiscoveryOptions] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: ErrMsgResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
