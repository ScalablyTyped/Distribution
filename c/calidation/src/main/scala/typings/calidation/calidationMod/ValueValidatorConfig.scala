package typings.calidation.calidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueValidatorConfig[T] extends SimpleValidatorConfig {
  var value: T
}

object ValueValidatorConfig {
  @scala.inline
  def apply[T](
    message: String,
    value: T,
    validateIf: (js.Function1[/* context */ ValidatorContext, Boolean]) | Boolean = null
  ): ValueValidatorConfig[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (validateIf != null) __obj.updateDynamic("validateIf")(validateIf.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueValidatorConfig[T]]
  }
}

