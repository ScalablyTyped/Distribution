package typings.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueValidatorConfig[P, T /* <: js.Object */] extends SimpleValidatorConfig[T] {
  var value: P
}

object ValueValidatorConfig {
  @scala.inline
  def apply[P, /* <: js.Object */ T](
    message: String,
    value: P,
    validateIf: (js.Function1[/* context */ ValidatorContext[T], Boolean]) | Boolean = null
  ): ValueValidatorConfig[P, T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (validateIf != null) __obj.updateDynamic("validateIf")(validateIf.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueValidatorConfig[P, T]]
  }
}

