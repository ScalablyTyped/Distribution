package typings.calidation.calidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LengthValidatorConfig extends SimpleValidatorConfig {
  var length: Double
}

object LengthValidatorConfig {
  @scala.inline
  def apply(
    length: Double,
    message: String,
    validateIf: (js.Function1[/* context */ ValidatorContext, Boolean]) | Boolean = null
  ): LengthValidatorConfig = {
    val __obj = js.Dynamic.literal(length = length, message = message)
    if (validateIf != null) __obj.updateDynamic("validateIf")(validateIf.asInstanceOf[js.Any])
    __obj.asInstanceOf[LengthValidatorConfig]
  }
}

