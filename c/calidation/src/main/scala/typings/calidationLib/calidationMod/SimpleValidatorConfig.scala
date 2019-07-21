package typings
package calidationLib.calidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleValidatorConfig extends js.Object {
  var message: java.lang.String
  var validateIf: js.UndefOr[(js.Function1[/* context */ ValidatorContext, scala.Boolean]) | scala.Boolean] = js.undefined
}

object SimpleValidatorConfig {
  @scala.inline
  def apply(
    message: java.lang.String,
    validateIf: (js.Function1[/* context */ ValidatorContext, scala.Boolean]) | scala.Boolean = null
  ): SimpleValidatorConfig = {
    val __obj = js.Dynamic.literal(message = message)
    if (validateIf != null) __obj.updateDynamic("validateIf")(validateIf.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleValidatorConfig]
  }
}

