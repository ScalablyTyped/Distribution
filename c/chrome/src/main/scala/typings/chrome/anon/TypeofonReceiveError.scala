package typings.chrome.anon

import typings.chrome.chrome.serial.onReceiveError.OnReceiveErrorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofonReceiveError extends StObject {
  
  val OnReceiveErrorEnum: Break = js.native
  
  def addListener(callback: js.Function1[/* info */ OnReceiveErrorInfo, Unit]): Unit = js.native
}
object TypeofonReceiveError {
  
  @scala.inline
  def apply(OnReceiveErrorEnum: Break, addListener: js.Function1[/* info */ OnReceiveErrorInfo, Unit] => Unit): TypeofonReceiveError = {
    val __obj = js.Dynamic.literal(OnReceiveErrorEnum = OnReceiveErrorEnum.asInstanceOf[js.Any], addListener = js.Any.fromFunction1(addListener))
    __obj.asInstanceOf[TypeofonReceiveError]
  }
  
  @scala.inline
  implicit class TypeofonReceiveErrorMutableBuilder[Self <: TypeofonReceiveError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddListener(value: js.Function1[/* info */ OnReceiveErrorInfo, Unit] => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnReceiveErrorEnum(value: Break): Self = StObject.set(x, "OnReceiveErrorEnum", value.asInstanceOf[js.Any])
  }
}
