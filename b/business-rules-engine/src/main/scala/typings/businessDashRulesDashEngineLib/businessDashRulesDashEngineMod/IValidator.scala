package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidator extends js.Object {
  var Error: IError
  def Validate(context: js.Any): IValidationFailure
  def ValidateAsync(context: js.Any): qLib.qMod.QNs.Promise[IValidationFailure]
}

object IValidator {
  @scala.inline
  def apply(
    Error: IError,
    Validate: js.Function1[js.Any, IValidationFailure],
    ValidateAsync: js.Function1[js.Any, qLib.qMod.QNs.Promise[IValidationFailure]]
  ): IValidator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Error")(Error)
    __obj.updateDynamic("Validate")(Validate)
    __obj.updateDynamic("ValidateAsync")(ValidateAsync)
    __obj.asInstanceOf[IValidator]
  }
}

