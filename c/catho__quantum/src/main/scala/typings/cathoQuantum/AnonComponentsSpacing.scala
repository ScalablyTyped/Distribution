package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponentsSpacing extends js.Object {
  var baseFontSize: js.UndefOr[Double] = js.undefined
  var breakpoints: js.UndefOr[js.Object] = js.undefined
  var components: js.UndefOr[AnonTabbedView] = js.undefined
  var spacing: js.UndefOr[js.Object] = js.undefined
}

object AnonComponentsSpacing {
  @scala.inline
  def apply(
    baseFontSize: Int | Double = null,
    breakpoints: js.Object = null,
    components: AnonTabbedView = null,
    spacing: js.Object = null
  ): AnonComponentsSpacing = {
    val __obj = js.Dynamic.literal()
    if (baseFontSize != null) __obj.updateDynamic("baseFontSize")(baseFontSize.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentsSpacing]
  }
}

