package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAbstractValidator[T] extends StObject {
  
  def CreateAbstractListRule(name: String): IAbstractValidationRule[Any]
  
  def CreateAbstractRule(name: String): IAbstractValidationRule[Any]
  
  def CreateRule(name: String): IAbstractValidationRule[Any]
  
  var ForList: Boolean
  
  def RuleFor(prop: String, validator: IPropertyValidator): Any
  
  def Validation(validatorFce: IValidatorFce): Any
  
  def ValidationFor(prop: String, validatorFce: IValidatorFce): Any
  
  def ValidatorFor[K](prop: String, validator: IAbstractValidator[K]): Any
}
object IAbstractValidator {
  
  inline def apply[T](
    CreateAbstractListRule: String => IAbstractValidationRule[Any],
    CreateAbstractRule: String => IAbstractValidationRule[Any],
    CreateRule: String => IAbstractValidationRule[Any],
    ForList: Boolean,
    RuleFor: (String, IPropertyValidator) => Any,
    Validation: IValidatorFce => Any,
    ValidationFor: (String, IValidatorFce) => Any,
    ValidatorFor: (String, IAbstractValidator[Any]) => Any
  ): IAbstractValidator[T] = {
    val __obj = js.Dynamic.literal(CreateAbstractListRule = js.Any.fromFunction1(CreateAbstractListRule), CreateAbstractRule = js.Any.fromFunction1(CreateAbstractRule), CreateRule = js.Any.fromFunction1(CreateRule), ForList = ForList.asInstanceOf[js.Any], RuleFor = js.Any.fromFunction2(RuleFor), Validation = js.Any.fromFunction1(Validation), ValidationFor = js.Any.fromFunction2(ValidationFor), ValidatorFor = js.Any.fromFunction2(ValidatorFor))
    __obj.asInstanceOf[IAbstractValidator[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAbstractValidator[?], T] (val x: Self & IAbstractValidator[T]) extends AnyVal {
    
    inline def setCreateAbstractListRule(value: String => IAbstractValidationRule[Any]): Self = StObject.set(x, "CreateAbstractListRule", js.Any.fromFunction1(value))
    
    inline def setCreateAbstractRule(value: String => IAbstractValidationRule[Any]): Self = StObject.set(x, "CreateAbstractRule", js.Any.fromFunction1(value))
    
    inline def setCreateRule(value: String => IAbstractValidationRule[Any]): Self = StObject.set(x, "CreateRule", js.Any.fromFunction1(value))
    
    inline def setForList(value: Boolean): Self = StObject.set(x, "ForList", value.asInstanceOf[js.Any])
    
    inline def setRuleFor(value: (String, IPropertyValidator) => Any): Self = StObject.set(x, "RuleFor", js.Any.fromFunction2(value))
    
    inline def setValidation(value: IValidatorFce => Any): Self = StObject.set(x, "Validation", js.Any.fromFunction1(value))
    
    inline def setValidationFor(value: (String, IValidatorFce) => Any): Self = StObject.set(x, "ValidationFor", js.Any.fromFunction2(value))
    
    inline def setValidatorFor(value: (String, IAbstractValidator[Any]) => Any): Self = StObject.set(x, "ValidatorFor", js.Any.fromFunction2(value))
  }
}
