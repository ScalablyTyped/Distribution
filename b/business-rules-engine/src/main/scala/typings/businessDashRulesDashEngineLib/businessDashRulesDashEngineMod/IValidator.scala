package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidator extends js.Object {
  var Error: IError
  def Validate(context: js.Any): IValidationFailure
  def ValidateAsync(context: js.Any): qLib.qMod.Promise[IValidationFailure]
}

object IValidator {
  @scala.inline
  def apply(
    Error: IError,
    Validate: js.Any => IValidationFailure,
    ValidateAsync: js.Any => qLib.qMod.Promise[IValidationFailure]
  ): IValidator = {
    val __obj = js.Dynamic.literal(Error = Error, Validate = js.Any.fromFunction1(Validate), ValidateAsync = js.Any.fromFunction1(ValidateAsync))
  
    __obj.asInstanceOf[IValidator]
  }
}

