package typings.calidation.calidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlacklistValidatorConfig extends SimpleValidatorConfig {
  var blacklist: js.Array[String]
}

object BlacklistValidatorConfig {
  @scala.inline
  def apply(
    blacklist: js.Array[String],
    message: String,
    validateIf: (js.Function1[/* context */ ValidatorContext, Boolean]) | Boolean = null
  ): BlacklistValidatorConfig = {
    val __obj = js.Dynamic.literal(blacklist = blacklist.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    if (validateIf != null) __obj.updateDynamic("validateIf")(validateIf.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlacklistValidatorConfig]
  }
}

