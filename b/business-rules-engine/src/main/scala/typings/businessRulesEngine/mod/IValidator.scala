package typings.businessRulesEngine.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValidator extends StObject {
  
  var Error: IError = js.native
  
  def Validate(context: js.Any): IValidationFailure = js.native
  
  def ValidateAsync(context: js.Any): Promise[IValidationFailure] = js.native
}
object IValidator {
  
  @scala.inline
  def apply(
    Error: IError,
    Validate: js.Any => IValidationFailure,
    ValidateAsync: js.Any => Promise[IValidationFailure]
  ): IValidator = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], Validate = js.Any.fromFunction1(Validate), ValidateAsync = js.Any.fromFunction1(ValidateAsync))
    __obj.asInstanceOf[IValidator]
  }
  
  @scala.inline
  implicit class IValidatorMutableBuilder[Self <: IValidator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: IError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: js.Any => IValidationFailure): Self = StObject.set(x, "Validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateAsync(value: js.Any => Promise[IValidationFailure]): Self = StObject.set(x, "ValidateAsync", js.Any.fromFunction1(value))
  }
}
