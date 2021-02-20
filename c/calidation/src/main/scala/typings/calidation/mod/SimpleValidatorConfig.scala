package typings.calidation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleValidatorConfig[T /* <: js.Object */] extends StObject {
  
  var message: String = js.native
  
  var validateIf: js.UndefOr[(js.Function1[/* context */ ValidatorContext[T], Boolean]) | Boolean] = js.native
}
object SimpleValidatorConfig {
  
  @scala.inline
  def apply[T /* <: js.Object */](message: String): SimpleValidatorConfig[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleValidatorConfig[T]]
  }
  
  @scala.inline
  implicit class SimpleValidatorConfigMutableBuilder[Self <: SimpleValidatorConfig[_], T /* <: js.Object */] (val x: Self with SimpleValidatorConfig[T]) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateIf(value: (js.Function1[/* context */ ValidatorContext[T], Boolean]) | Boolean): Self = StObject.set(x, "validateIf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateIfFunction1(value: /* context */ ValidatorContext[T] => Boolean): Self = StObject.set(x, "validateIf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateIfUndefined: Self = StObject.set(x, "validateIf", js.undefined)
  }
}
