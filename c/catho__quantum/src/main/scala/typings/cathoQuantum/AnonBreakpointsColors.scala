package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBreakpointsColors extends js.Object {
  var breakpoints: js.UndefOr[js.Object] = js.undefined
  var colors: js.UndefOr[js.Object] = js.undefined
  var components: js.UndefOr[AnonButton] = js.undefined
  var spacing: js.UndefOr[js.Object] = js.undefined
}

object AnonBreakpointsColors {
  @scala.inline
  def apply(
    breakpoints: js.Object = null,
    colors: js.Object = null,
    components: AnonButton = null,
    spacing: js.Object = null
  ): AnonBreakpointsColors = {
    val __obj = js.Dynamic.literal()
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBreakpointsColors]
  }
}

