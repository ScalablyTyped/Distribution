package typings.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleValidatorConfig[T /* <: js.Object */] extends js.Object {
  var message: String
  var validateIf: js.UndefOr[(js.Function1[/* context */ ValidatorContext[T], Boolean]) | Boolean] = js.undefined
}

object SimpleValidatorConfig {
  @scala.inline
  def apply[/* <: js.Object */ T](
    message: String,
    validateIf: (js.Function1[/* context */ ValidatorContext[T], Boolean]) | Boolean = null
  ): SimpleValidatorConfig[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (validateIf != null) __obj.updateDynamic("validateIf")(validateIf.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleValidatorConfig[T]]
  }
}

