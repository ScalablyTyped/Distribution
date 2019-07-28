package typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidatorFce extends js.Object {
  var AsyncValidationFce: js.UndefOr[IAsyncValidate] = js.undefined
  var Name: String
  var ValidationFce: js.UndefOr[IValidate] = js.undefined
}

object IValidatorFce {
  @scala.inline
  def apply(Name: String, AsyncValidationFce: IAsyncValidate = null, ValidationFce: IValidate = null): IValidatorFce = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (AsyncValidationFce != null) __obj.updateDynamic("AsyncValidationFce")(AsyncValidationFce)
    if (ValidationFce != null) __obj.updateDynamic("ValidationFce")(ValidationFce)
    __obj.asInstanceOf[IValidatorFce]
  }
}

