package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectedWifiOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  def success_MGetConnectedWifiOptions(wifi: WiFi): Unit
}
object GetConnectedWifiOptions {
  
  inline def apply(success: WiFi => Unit): GetConnectedWifiOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetConnectedWifiOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConnectedWifiOptions] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: WiFi => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
