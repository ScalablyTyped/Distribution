package typings.chrome.anon

import typings.chrome.chrome.serial.onReceiveError.OnReceiveErrorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofonReceiveError extends StObject {
  
  val OnReceiveErrorEnum: Break
  
  def addListener(callback: js.Function1[/* info */ OnReceiveErrorInfo, Unit]): Unit
}
object TypeofonReceiveError {
  
  inline def apply(OnReceiveErrorEnum: Break, addListener: js.Function1[/* info */ OnReceiveErrorInfo, Unit] => Unit): TypeofonReceiveError = {
    val __obj = js.Dynamic.literal(OnReceiveErrorEnum = OnReceiveErrorEnum.asInstanceOf[js.Any], addListener = js.Any.fromFunction1(addListener))
    __obj.asInstanceOf[TypeofonReceiveError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofonReceiveError] (val x: Self) extends AnyVal {
    
    inline def setAddListener(value: js.Function1[/* info */ OnReceiveErrorInfo, Unit] => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
    
    inline def setOnReceiveErrorEnum(value: Break): Self = StObject.set(x, "OnReceiveErrorEnum", value.asInstanceOf[js.Any])
  }
}
