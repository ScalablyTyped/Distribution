package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAbstractValidator[T] extends StObject {
  
  def CreateAbstractListRule(name: String): IAbstractValidationRule[js.Any]
  
  def CreateAbstractRule(name: String): IAbstractValidationRule[js.Any]
  
  def CreateRule(name: String): IAbstractValidationRule[js.Any]
  
  var ForList: Boolean
  
  def RuleFor(prop: String, validator: IPropertyValidator): js.Any
  
  def Validation(validatorFce: IValidatorFce): js.Any
  
  def ValidationFor(prop: String, validatorFce: IValidatorFce): js.Any
  
  def ValidatorFor[K](prop: String, validator: IAbstractValidator[K]): js.Any
}
object IAbstractValidator {
  
  @scala.inline
  def apply[T](
    CreateAbstractListRule: String => IAbstractValidationRule[js.Any],
    CreateAbstractRule: String => IAbstractValidationRule[js.Any],
    CreateRule: String => IAbstractValidationRule[js.Any],
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
  implicit class IAbstractValidatorMutableBuilder[Self <: IAbstractValidator[?], T] (val x: Self & IAbstractValidator[T]) extends AnyVal {
    
    @scala.inline
    def setCreateAbstractListRule(value: String => IAbstractValidationRule[js.Any]): Self = StObject.set(x, "CreateAbstractListRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateAbstractRule(value: String => IAbstractValidationRule[js.Any]): Self = StObject.set(x, "CreateAbstractRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateRule(value: String => IAbstractValidationRule[js.Any]): Self = StObject.set(x, "CreateRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForList(value: Boolean): Self = StObject.set(x, "ForList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleFor(value: (String, IPropertyValidator) => js.Any): Self = StObject.set(x, "RuleFor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidation(value: IValidatorFce => js.Any): Self = StObject.set(x, "Validation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidationFor(value: (String, IValidatorFce) => js.Any): Self = StObject.set(x, "ValidationFor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidatorFor(value: (String, IAbstractValidator[js.Any]) => js.Any): Self = StObject.set(x, "ValidatorFor", js.Any.fromFunction2(value))
  }
}
