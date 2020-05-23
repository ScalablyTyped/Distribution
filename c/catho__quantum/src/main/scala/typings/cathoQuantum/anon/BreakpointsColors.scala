package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakpointsColors extends js.Object {
  var breakpoints: js.UndefOr[js.Object] = js.undefined
  var colors: js.UndefOr[js.Object] = js.undefined
  var components: js.UndefOr[Button] = js.undefined
  var spacing: js.UndefOr[js.Object] = js.undefined
}

object BreakpointsColors {
  @scala.inline
  def apply(
    breakpoints: js.Object = null,
    colors: js.Object = null,
    components: Button = null,
    spacing: js.Object = null
  ): BreakpointsColors = {
    val __obj = js.Dynamic.literal()
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointsColors]
  }
}

