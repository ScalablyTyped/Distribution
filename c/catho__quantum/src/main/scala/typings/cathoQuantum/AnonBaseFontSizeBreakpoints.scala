package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseFontSizeBreakpoints extends js.Object {
  var baseFontSize: js.UndefOr[Double] = js.undefined
  var breakpoints: js.UndefOr[js.Object] = js.undefined
  var colors: js.UndefOr[js.Object] = js.undefined
  var components: js.UndefOr[AnonButtonObject] = js.undefined
  var spacing: js.UndefOr[js.Object] = js.undefined
}

object AnonBaseFontSizeBreakpoints {
  @scala.inline
  def apply(
    baseFontSize: Int | Double = null,
    breakpoints: js.Object = null,
    colors: js.Object = null,
    components: AnonButtonObject = null,
    spacing: js.Object = null
  ): AnonBaseFontSizeBreakpoints = {
    val __obj = js.Dynamic.literal()
    if (baseFontSize != null) __obj.updateDynamic("baseFontSize")(baseFontSize.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseFontSizeBreakpoints]
  }
}

