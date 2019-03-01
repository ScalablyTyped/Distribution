package typings
package catalogLib.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HintSpecimenProps extends js.Object {
  var directive: js.UndefOr[scala.Boolean] = js.undefined
  var important: js.UndefOr[scala.Boolean] = js.undefined
  var neutral: js.UndefOr[scala.Boolean] = js.undefined
  var warning: js.UndefOr[scala.Boolean] = js.undefined
}

object HintSpecimenProps {
  @scala.inline
  def apply(
    directive: js.UndefOr[scala.Boolean] = js.undefined,
    important: js.UndefOr[scala.Boolean] = js.undefined,
    neutral: js.UndefOr[scala.Boolean] = js.undefined,
    warning: js.UndefOr[scala.Boolean] = js.undefined
  ): HintSpecimenProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(directive)) __obj.updateDynamic("directive")(directive)
    if (!js.isUndefined(important)) __obj.updateDynamic("important")(important)
    if (!js.isUndefined(neutral)) __obj.updateDynamic("neutral")(neutral)
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[HintSpecimenProps]
  }
}

