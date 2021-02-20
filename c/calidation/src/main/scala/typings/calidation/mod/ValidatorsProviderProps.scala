package typings.calidation.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatorsProviderProps[T /* <: js.Object */] extends StObject {
  
  var validators: Record[String, CustomValidatorFunction[T]] = js.native
}
object ValidatorsProviderProps {
  
  @scala.inline
  def apply[T /* <: js.Object */](validators: Record[String, CustomValidatorFunction[T]]): ValidatorsProviderProps[T] = {
    val __obj = js.Dynamic.literal(validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorsProviderProps[T]]
  }
  
  @scala.inline
  implicit class ValidatorsProviderPropsMutableBuilder[Self <: ValidatorsProviderProps[_], T /* <: js.Object */] (val x: Self with ValidatorsProviderProps[T]) extends AnyVal {
    
    @scala.inline
    def setValidators(value: Record[String, CustomValidatorFunction[T]]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
  }
}
