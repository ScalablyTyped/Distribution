package typings
package calidationLib.calidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LengthValidatorConfig extends SimpleValidatorConfig {
  var length: scala.Double
}

object LengthValidatorConfig {
  @scala.inline
  def apply(
    length: scala.Double,
    message: java.lang.String,
    validateIf: (js.Function1[/* context */ ValidatorContext, scala.Boolean]) | scala.Boolean = null
  ): LengthValidatorConfig = {
    val __obj = js.Dynamic.literal(length = length, message = message)
    if (validateIf != null) __obj.updateDynamic("validateIf")(validateIf.asInstanceOf[js.Any])
    __obj.asInstanceOf[LengthValidatorConfig]
  }
}

