package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractValidationRule[T] extends js.Object {
  var Children: org.scalablytyped.runtime.StringDictionary[IAbstractValidationRule[_]]
  var Rules: org.scalablytyped.runtime.StringDictionary[IPropertyValidationRule[T]]
  var ValidationResult: IValidationResult
  var Validators: org.scalablytyped.runtime.StringDictionary[IValidator]
  def Validate(context: T): IValidationResult
  def ValidateAll(context: T): qLib.qMod.Promise[IValidationResult]
  def ValidateAsync(context: T): qLib.qMod.Promise[IValidationResult]
  def ValidateProperty(context: T, propName: java.lang.String): scala.Unit
}

object IAbstractValidationRule {
  @scala.inline
  def apply[T](
    Children: org.scalablytyped.runtime.StringDictionary[IAbstractValidationRule[_]],
    Rules: org.scalablytyped.runtime.StringDictionary[IPropertyValidationRule[T]],
    Validate: T => IValidationResult,
    ValidateAll: T => qLib.qMod.Promise[IValidationResult],
    ValidateAsync: T => qLib.qMod.Promise[IValidationResult],
    ValidateProperty: (T, java.lang.String) => scala.Unit,
    ValidationResult: IValidationResult,
    Validators: org.scalablytyped.runtime.StringDictionary[IValidator]
  ): IAbstractValidationRule[T] = {
    val __obj = js.Dynamic.literal(Children = Children, Rules = Rules, Validate = js.Any.fromFunction1(Validate), ValidateAll = js.Any.fromFunction1(ValidateAll), ValidateAsync = js.Any.fromFunction1(ValidateAsync), ValidateProperty = js.Any.fromFunction2(ValidateProperty), ValidationResult = ValidationResult, Validators = Validators)
  
    __obj.asInstanceOf[IAbstractValidationRule[T]]
  }
}

