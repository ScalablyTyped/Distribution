package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepDefinitionOptions extends js.Object {
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object StepDefinitionOptions {
  @scala.inline
  def apply(timeout: scala.Int | scala.Double = null): StepDefinitionOptions = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepDefinitionOptions]
  }
}

