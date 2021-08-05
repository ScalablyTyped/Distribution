package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StringDictionary
import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyValidationRule[T] extends StObject {
  
  def Validate(context: IValidationContext[T]): js.Array[IValidationFailure]
  
  def ValidateAsync(context: IValidationContext[T]): Promise[js.Array[IValidationFailure]]
  
  var Validators: StringDictionary[js.Any]
}
object IPropertyValidationRule {
  
  inline def apply[T](
    Validate: IValidationContext[T] => js.Array[IValidationFailure],
    ValidateAsync: IValidationContext[T] => Promise[js.Array[IValidationFailure]],
    Validators: StringDictionary[js.Any]
  ): IPropertyValidationRule[T] = {
    val __obj = js.Dynamic.literal(Validate = js.Any.fromFunction1(Validate), ValidateAsync = js.Any.fromFunction1(ValidateAsync), Validators = Validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValidationRule[T]]
  }
  
  extension [Self <: IPropertyValidationRule[?], T](x: Self & IPropertyValidationRule[T]) {
    
    inline def setValidate(value: IValidationContext[T] => js.Array[IValidationFailure]): Self = StObject.set(x, "Validate", js.Any.fromFunction1(value))
    
    inline def setValidateAsync(value: IValidationContext[T] => Promise[js.Array[IValidationFailure]]): Self = StObject.set(x, "ValidateAsync", js.Any.fromFunction1(value))
    
    inline def setValidators(value: StringDictionary[js.Any]): Self = StObject.set(x, "Validators", value.asInstanceOf[js.Any])
  }
}
