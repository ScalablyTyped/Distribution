package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exception extends StObject {
  
  var exception: js.UndefOr[js.Any] = js.native
  
  var message: js.UndefOr[String] = js.native
}
object Exception {
  
  @scala.inline
  def apply(): Exception = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exception]
  }
  
  @scala.inline
  implicit class ExceptionMutableBuilder[Self <: Exception] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setException(value: js.Any): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
