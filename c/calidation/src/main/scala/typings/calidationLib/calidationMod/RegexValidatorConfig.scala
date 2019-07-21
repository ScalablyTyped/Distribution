package typings
package calidationLib.calidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexValidatorConfig extends SimpleValidatorConfig {
  var regex: stdLib.RegExp
}

object RegexValidatorConfig {
  @scala.inline
  def apply(
    message: java.lang.String,
    regex: stdLib.RegExp,
    validateIf: (js.Function1[/* context */ ValidatorContext, scala.Boolean]) | scala.Boolean = null
  ): RegexValidatorConfig = {
    val __obj = js.Dynamic.literal(message = message, regex = regex)
    if (validateIf != null) __obj.updateDynamic("validateIf")(validateIf.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexValidatorConfig]
  }
}

