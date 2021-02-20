package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StringDictionary
import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyValidationRule[T] extends StObject {
  
  def Validate(context: IValidationContext[T]): js.Array[IValidationFailure] = js.native
  
  def ValidateAsync(context: IValidationContext[T]): Promise[js.Array[IValidationFailure]] = js.native
  
  var Validators: StringDictionary[js.Any] = js.native
}
object IPropertyValidationRule {
  
  @scala.inline
  def apply[T](
    Validate: IValidationContext[T] => js.Array[IValidationFailure],
    ValidateAsync: IValidationContext[T] => Promise[js.Array[IValidationFailure]],
    Validators: StringDictionary[js.Any]
  ): IPropertyValidationRule[T] = {
    val __obj = js.Dynamic.literal(Validate = js.Any.fromFunction1(Validate), ValidateAsync = js.Any.fromFunction1(ValidateAsync), Validators = Validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValidationRule[T]]
  }
  
  @scala.inline
  implicit class IPropertyValidationRuleMutableBuilder[Self <: IPropertyValidationRule[_], T] (val x: Self with IPropertyValidationRule[T]) extends AnyVal {
    
    @scala.inline
    def setValidate(value: IValidationContext[T] => js.Array[IValidationFailure]): Self = StObject.set(x, "Validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateAsync(value: IValidationContext[T] => Promise[js.Array[IValidationFailure]]): Self = StObject.set(x, "ValidateAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidators(value: StringDictionary[js.Any]): Self = StObject.set(x, "Validators", value.asInstanceOf[js.Any])
  }
}
