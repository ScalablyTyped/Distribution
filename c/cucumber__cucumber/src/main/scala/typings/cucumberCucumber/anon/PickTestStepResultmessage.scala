package typings.cucumberCucumber.anon

import typings.cucumberMessages.distCjsSrcMessagesMod.Exception
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@cucumber/messages.@cucumber/messages.TestStepResult, 'message' | 'exception'> */
trait PickTestStepResultmessage extends StObject {
  
  var exception: js.UndefOr[Exception] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object PickTestStepResultmessage {
  
  inline def apply(): PickTestStepResultmessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickTestStepResultmessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickTestStepResultmessage] (val x: Self) extends AnyVal {
    
    inline def setException(value: Exception): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
