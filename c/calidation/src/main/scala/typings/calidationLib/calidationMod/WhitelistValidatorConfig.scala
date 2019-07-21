package typings
package calidationLib.calidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhitelistValidatorConfig extends SimpleValidatorConfig {
  var whitelist: js.Array[java.lang.String]
}

object WhitelistValidatorConfig {
  @scala.inline
  def apply(
    message: java.lang.String,
    whitelist: js.Array[java.lang.String],
    validateIf: (js.Function1[/* context */ ValidatorContext, scala.Boolean]) | scala.Boolean = null
  ): WhitelistValidatorConfig = {
    val __obj = js.Dynamic.literal(message = message, whitelist = whitelist)
    if (validateIf != null) __obj.updateDynamic("validateIf")(validateIf.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhitelistValidatorConfig]
  }
}

