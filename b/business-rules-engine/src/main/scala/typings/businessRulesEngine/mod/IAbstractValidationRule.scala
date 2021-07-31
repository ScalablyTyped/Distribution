package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StringDictionary
import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAbstractValidationRule[T] extends StObject {
  
  var Children: StringDictionary[IAbstractValidationRule[js.Any]]
  
  var Rules: StringDictionary[IPropertyValidationRule[T]]
  
  def Validate(context: T): IValidationResult
  
  def ValidateAll(context: T): Promise[IValidationResult]
  
  def ValidateAsync(context: T): Promise[IValidationResult]
  
  def ValidateProperty(context: T, propName: String): Unit
  
  var ValidationResult: IValidationResult
  
  var Validators: StringDictionary[IValidator]
}
object IAbstractValidationRule {
  
  @scala.inline
  def apply[T](
    Children: StringDictionary[IAbstractValidationRule[js.Any]],
    Rules: StringDictionary[IPropertyValidationRule[T]],
    Validate: T => IValidationResult,
    ValidateAll: T => Promise[IValidationResult],
    ValidateAsync: T => Promise[IValidationResult],
    ValidateProperty: (T, String) => Unit,
    ValidationResult: IValidationResult,
    Validators: StringDictionary[IValidator]
  ): IAbstractValidationRule[T] = {
    val __obj = js.Dynamic.literal(Children = Children.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any], Validate = js.Any.fromFunction1(Validate), ValidateAll = js.Any.fromFunction1(ValidateAll), ValidateAsync = js.Any.fromFunction1(ValidateAsync), ValidateProperty = js.Any.fromFunction2(ValidateProperty), ValidationResult = ValidationResult.asInstanceOf[js.Any], Validators = Validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbstractValidationRule[T]]
  }
  
  @scala.inline
  implicit class IAbstractValidationRuleMutableBuilder[Self <: IAbstractValidationRule[?], T] (val x: Self & IAbstractValidationRule[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: StringDictionary[IAbstractValidationRule[js.Any]]): Self = StObject.set(x, "Children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(value: StringDictionary[IPropertyValidationRule[T]]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: T => IValidationResult): Self = StObject.set(x, "Validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateAll(value: T => Promise[IValidationResult]): Self = StObject.set(x, "ValidateAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateAsync(value: T => Promise[IValidationResult]): Self = StObject.set(x, "ValidateAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateProperty(value: (T, String) => Unit): Self = StObject.set(x, "ValidateProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidationResult(value: IValidationResult): Self = StObject.set(x, "ValidationResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidators(value: StringDictionary[IValidator]): Self = StObject.set(x, "Validators", value.asInstanceOf[js.Any])
  }
}
