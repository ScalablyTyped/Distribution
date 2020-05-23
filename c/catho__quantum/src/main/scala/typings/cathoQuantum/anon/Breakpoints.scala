package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breakpoints extends js.Object {
  var baseFontSize: js.UndefOr[Double] = js.undefined
  var breakpoints: js.UndefOr[js.Object] = js.undefined
  var colors: js.UndefOr[js.Object] = js.undefined
  var components: js.UndefOr[ButtonObject] = js.undefined
  var spacing: js.UndefOr[js.Object] = js.undefined
}

object Breakpoints {
  @scala.inline
  def apply(
    baseFontSize: js.UndefOr[Double] = js.undefined,
    breakpoints: js.Object = null,
    colors: js.Object = null,
    components: ButtonObject = null,
    spacing: js.Object = null
  ): Breakpoints = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(baseFontSize)) __obj.updateDynamic("baseFontSize")(baseFontSize.get.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breakpoints]
  }
}

