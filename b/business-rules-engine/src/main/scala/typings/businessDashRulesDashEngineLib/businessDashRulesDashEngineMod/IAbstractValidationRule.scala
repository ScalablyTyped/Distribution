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
  def ValidateAll(context: T): qLib.qMod.QNs.Promise[IValidationResult]
  def ValidateAsync(context: T): qLib.qMod.QNs.Promise[IValidationResult]
  def ValidateProperty(context: T, propName: java.lang.String): scala.Unit
}

object IAbstractValidationRule {
  @scala.inline
  def apply[T](
    Children: org.scalablytyped.runtime.StringDictionary[IAbstractValidationRule[_]],
    Rules: org.scalablytyped.runtime.StringDictionary[IPropertyValidationRule[T]],
    Validate: js.Function1[T, IValidationResult],
    ValidateAll: js.Function1[T, qLib.qMod.QNs.Promise[IValidationResult]],
    ValidateAsync: js.Function1[T, qLib.qMod.QNs.Promise[IValidationResult]],
    ValidateProperty: js.Function2[T, java.lang.String, scala.Unit],
    ValidationResult: IValidationResult,
    Validators: org.scalablytyped.runtime.StringDictionary[IValidator]
  ): IAbstractValidationRule[T] = {
    val __obj = js.Dynamic.literal(Children = Children, Rules = Rules, Validate = Validate, ValidateAll = ValidateAll, ValidateAsync = ValidateAsync, ValidateProperty = ValidateProperty, ValidationResult = ValidationResult, Validators = Validators)
  
    __obj.asInstanceOf[IAbstractValidationRule[T]]
  }
}

