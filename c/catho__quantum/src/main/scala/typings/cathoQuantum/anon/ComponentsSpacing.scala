package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentsSpacing extends js.Object {
  var baseFontSize: js.UndefOr[Double] = js.undefined
  var breakpoints: js.UndefOr[js.Object] = js.undefined
  var components: js.UndefOr[TabbedView] = js.undefined
  var spacing: js.UndefOr[js.Object] = js.undefined
}

object ComponentsSpacing {
  @scala.inline
  def apply(
    baseFontSize: js.UndefOr[Double] = js.undefined,
    breakpoints: js.Object = null,
    components: TabbedView = null,
    spacing: js.Object = null
  ): ComponentsSpacing = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(baseFontSize)) __obj.updateDynamic("baseFontSize")(baseFontSize.get.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentsSpacing]
  }
}

