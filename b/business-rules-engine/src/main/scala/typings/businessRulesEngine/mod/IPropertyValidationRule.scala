package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StringDictionary
import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyValidationRule[T] extends js.Object {
  
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
  implicit class IPropertyValidationRuleOps[Self <: IPropertyValidationRule[_], T] (val x: Self with IPropertyValidationRule[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setValidate(value: IValidationContext[T] => js.Array[IValidationFailure]): Self = this.set("Validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateAsync(value: IValidationContext[T] => Promise[js.Array[IValidationFailure]]): Self = this.set("ValidateAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidators(value: StringDictionary[js.Any]): Self = this.set("Validators", value.asInstanceOf[js.Any])
  }
}
