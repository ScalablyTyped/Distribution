package typings.calidation.calidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleValidatorConfig extends js.Object {
  var message: String
  var validateIf: js.UndefOr[(js.Function1[/* context */ ValidatorContext, Boolean]) | Boolean] = js.undefined
}

object SimpleValidatorConfig {
  @scala.inline
  def apply(
    message: String,
    validateIf: (js.Function1[/* context */ ValidatorContext, Boolean]) | Boolean = null
  ): SimpleValidatorConfig = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (validateIf != null) __obj.updateDynamic("validateIf")(validateIf.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleValidatorConfig]
  }
}

