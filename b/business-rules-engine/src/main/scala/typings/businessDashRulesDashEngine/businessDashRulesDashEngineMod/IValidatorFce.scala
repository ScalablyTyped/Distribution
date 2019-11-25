package typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod

import typings.q.qMod.Promise
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
  def apply(
    Name: String,
    AsyncValidationFce: /* args */ IError => Promise[js.Any] = null,
    ValidationFce: /* args */ IError => Unit = null
  ): IValidatorFce = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (AsyncValidationFce != null) __obj.updateDynamic("AsyncValidationFce")(js.Any.fromFunction1(AsyncValidationFce))
    if (ValidationFce != null) __obj.updateDynamic("ValidationFce")(js.Any.fromFunction1(ValidationFce))
    __obj.asInstanceOf[IValidatorFce]
  }
}

