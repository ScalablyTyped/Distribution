package typings.calidation.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexValidatorConfig[T /* <: js.Object */] extends SimpleValidatorConfig[T] {
  var regex: RegExp
}

object RegexValidatorConfig {
  @scala.inline
  def apply[/* <: js.Object */ T](
    message: String,
    regex: RegExp,
    validateIf: (js.Function1[/* context */ ValidatorContext[T], Boolean]) | Boolean = null
  ): RegexValidatorConfig[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    if (validateIf != null) __obj.updateDynamic("validateIf")(validateIf.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexValidatorConfig[T]]
  }
}

