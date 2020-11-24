package typings.businessRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAbstractValidator[T] extends js.Object {
  
  def CreateAbstractListRule(name: String): IAbstractValidationRule[_] = js.native
  
  def CreateAbstractRule(name: String): IAbstractValidationRule[_] = js.native
  
  def CreateRule(name: String): IAbstractValidationRule[_] = js.native
  
  var ForList: Boolean = js.native
  
  def RuleFor(prop: String, validator: IPropertyValidator): js.Any = js.native
  
  def Validation(validatorFce: IValidatorFce): js.Any = js.native
  
  def ValidationFor(prop: String, validatorFce: IValidatorFce): js.Any = js.native
  
  def ValidatorFor[K](prop: String, validator: IAbstractValidator[K]): js.Any = js.native
}
object IAbstractValidator {
  
  @scala.inline
  def apply[T](
    CreateAbstractListRule: String => IAbstractValidationRule[_],
    CreateAbstractRule: String => IAbstractValidationRule[_],
    CreateRule: String => IAbstractValidationRule[_],
    ForList: Boolean,
    RuleFor: (String, IPropertyValidator) => js.Any,
    Validation: IValidatorFce => js.Any,
    ValidationFor: (String, IValidatorFce) => js.Any,
    ValidatorFor: (String, IAbstractValidator[js.Any]) => js.Any
  ): IAbstractValidator[T] = {
    val __obj = js.Dynamic.literal(CreateAbstractListRule = js.Any.fromFunction1(CreateAbstractListRule), CreateAbstractRule = js.Any.fromFunction1(CreateAbstractRule), CreateRule = js.Any.fromFunction1(CreateRule), ForList = ForList.asInstanceOf[js.Any], RuleFor = js.Any.fromFunction2(RuleFor), Validation = js.Any.fromFunction1(Validation), ValidationFor = js.Any.fromFunction2(ValidationFor), ValidatorFor = js.Any.fromFunction2(ValidatorFor))
    __obj.asInstanceOf[IAbstractValidator[T]]
  }
  
  @scala.inline
  implicit class IAbstractValidatorOps[Self <: IAbstractValidator[_], T] (val x: Self with IAbstractValidator[T]) extends AnyVal {
    
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
    def setCreateAbstractListRule(value: String => IAbstractValidationRule[_]): Self = this.set("CreateAbstractListRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateAbstractRule(value: String => IAbstractValidationRule[_]): Self = this.set("CreateAbstractRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateRule(value: String => IAbstractValidationRule[_]): Self = this.set("CreateRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForList(value: Boolean): Self = this.set("ForList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleFor(value: (String, IPropertyValidator) => js.Any): Self = this.set("RuleFor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidation(value: IValidatorFce => js.Any): Self = this.set("Validation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidationFor(value: (String, IValidatorFce) => js.Any): Self = this.set("ValidationFor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidatorFor(value: (String, IAbstractValidator[js.Any]) => js.Any): Self = this.set("ValidatorFor", js.Any.fromFunction2(value))
  }
}
