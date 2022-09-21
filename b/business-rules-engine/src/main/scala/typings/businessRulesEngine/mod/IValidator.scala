package typings.businessRulesEngine.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValidator extends StObject {
  
  var Error: IError
  
  def Validate(context: Any): IValidationFailure
  
  def ValidateAsync(context: Any): Promise[IValidationFailure]
}
object IValidator {
  
  inline def apply(
    Error: IError,
    Validate: Any => IValidationFailure,
    ValidateAsync: Any => Promise[IValidationFailure]
  ): IValidator = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], Validate = js.Any.fromFunction1(Validate), ValidateAsync = js.Any.fromFunction1(ValidateAsync))
    __obj.asInstanceOf[IValidator]
  }
  
  extension [Self <: IValidator](x: Self) {
    
    inline def setError(value: IError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: Any => IValidationFailure): Self = StObject.set(x, "Validate", js.Any.fromFunction1(value))
    
    inline def setValidateAsync(value: Any => Promise[IValidationFailure]): Self = StObject.set(x, "ValidateAsync", js.Any.fromFunction1(value))
  }
}
