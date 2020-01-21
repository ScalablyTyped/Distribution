package typings.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhitelistValidatorConfig extends SimpleValidatorConfig {
  var whitelist: js.Array[String]
}

object WhitelistValidatorConfig {
  @scala.inline
  def apply(
    message: String,
    whitelist: js.Array[String],
    validateIf: (js.Function1[/* context */ ValidatorContext, Boolean]) | Boolean = null
  ): WhitelistValidatorConfig = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], whitelist = whitelist.asInstanceOf[js.Any])
    if (validateIf != null) __obj.updateDynamic("validateIf")(validateIf.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhitelistValidatorConfig]
  }
}

