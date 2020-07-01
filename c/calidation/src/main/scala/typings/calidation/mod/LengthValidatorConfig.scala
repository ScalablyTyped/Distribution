package typings.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LengthValidatorConfig[T /* <: js.Object */] extends SimpleValidatorConfig[T] {
  var length: Double
}

object LengthValidatorConfig {
  @scala.inline
  def apply[/* <: js.Object */ T](
    length: Double,
    message: String,
    validateIf: (js.Function1[/* context */ ValidatorContext[T], Boolean]) | Boolean = null
  ): LengthValidatorConfig[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    if (validateIf != null) __obj.updateDynamic("validateIf")(validateIf.asInstanceOf[js.Any])
    __obj.asInstanceOf[LengthValidatorConfig[T]]
  }
}

