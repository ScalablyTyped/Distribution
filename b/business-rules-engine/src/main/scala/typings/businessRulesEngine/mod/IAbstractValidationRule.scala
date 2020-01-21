package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StringDictionary
import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractValidationRule[T] extends js.Object {
  var Children: StringDictionary[IAbstractValidationRule[_]]
  var Rules: StringDictionary[IPropertyValidationRule[T]]
  var ValidationResult: IValidationResult
  var Validators: StringDictionary[IValidator]
  def Validate(context: T): IValidationResult
  def ValidateAll(context: T): Promise[IValidationResult]
  def ValidateAsync(context: T): Promise[IValidationResult]
  def ValidateProperty(context: T, propName: String): Unit
}

object IAbstractValidationRule {
  @scala.inline
  def apply[T](
    Children: StringDictionary[IAbstractValidationRule[_]],
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
}

