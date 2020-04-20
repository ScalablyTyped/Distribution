package typings.businessRulesEngine.mod

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidator extends js.Object {
  var Error: IError
  def Validate(context: js.Any): IValidationFailure
  def ValidateAsync(context: js.Any): Promise[IValidationFailure]
}

object IValidator {
  @scala.inline
  def apply(
    Error: IError,
    Validate: js.Any => IValidationFailure,
    ValidateAsync: js.Any => Promise[IValidationFailure]
  ): IValidator = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], Validate = js.Any.fromFunction1(Validate), ValidateAsync = js.Any.fromFunction1(ValidateAsync))
    __obj.asInstanceOf[IValidator]
  }
}

