package typings.catalog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HintSpecimenProps extends js.Object {
  var directive: js.UndefOr[Boolean] = js.undefined
  var important: js.UndefOr[Boolean] = js.undefined
  var neutral: js.UndefOr[Boolean] = js.undefined
  var warning: js.UndefOr[Boolean] = js.undefined
}

object HintSpecimenProps {
  @scala.inline
  def apply(
    directive: js.UndefOr[Boolean] = js.undefined,
    important: js.UndefOr[Boolean] = js.undefined,
    neutral: js.UndefOr[Boolean] = js.undefined,
    warning: js.UndefOr[Boolean] = js.undefined
  ): HintSpecimenProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(directive)) __obj.updateDynamic("directive")(directive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(important)) __obj.updateDynamic("important")(important.get.asInstanceOf[js.Any])
    if (!js.isUndefined(neutral)) __obj.updateDynamic("neutral")(neutral.get.asInstanceOf[js.Any])
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HintSpecimenProps]
  }
}

