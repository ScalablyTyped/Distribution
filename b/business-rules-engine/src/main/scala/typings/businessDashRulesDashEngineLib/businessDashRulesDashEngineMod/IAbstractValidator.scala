package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractValidator[T] extends js.Object {
  var ForList: scala.Boolean
  def CreateAbstractListRule(name: java.lang.String): IAbstractValidationRule[_]
  def CreateAbstractRule(name: java.lang.String): IAbstractValidationRule[_]
  def CreateRule(name: java.lang.String): IAbstractValidationRule[_]
  def RuleFor(prop: java.lang.String, validator: IPropertyValidator): js.Any
  def Validation(validatorFce: IValidatorFce): js.Any
  def ValidationFor(prop: java.lang.String, validatorFce: IValidatorFce): js.Any
  def ValidatorFor[K](prop: java.lang.String, validator: IAbstractValidator[K]): js.Any
}

object IAbstractValidator {
  @scala.inline
  def apply[T](
    CreateAbstractListRule: js.Function1[java.lang.String, IAbstractValidationRule[_]],
    CreateAbstractRule: js.Function1[java.lang.String, IAbstractValidationRule[_]],
    CreateRule: js.Function1[java.lang.String, IAbstractValidationRule[_]],
    ForList: scala.Boolean,
    RuleFor: js.Function2[java.lang.String, IPropertyValidator, js.Any],
    Validation: js.Function1[IValidatorFce, js.Any],
    ValidationFor: js.Function2[java.lang.String, IValidatorFce, js.Any],
    ValidatorFor: js.Function2[java.lang.String, IAbstractValidator[js.Any], js.Any]
  ): IAbstractValidator[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CreateAbstractListRule")(CreateAbstractListRule)
    __obj.updateDynamic("CreateAbstractRule")(CreateAbstractRule)
    __obj.updateDynamic("CreateRule")(CreateRule)
    __obj.updateDynamic("ForList")(ForList)
    __obj.updateDynamic("RuleFor")(RuleFor)
    __obj.updateDynamic("Validation")(Validation)
    __obj.updateDynamic("ValidationFor")(ValidationFor)
    __obj.updateDynamic("ValidatorFor")(ValidatorFor)
    __obj.asInstanceOf[IAbstractValidator[T]]
  }
}

