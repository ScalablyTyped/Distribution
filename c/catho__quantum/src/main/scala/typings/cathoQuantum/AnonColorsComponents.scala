package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorsComponents extends js.Object {
  var baseFontSize: js.UndefOr[Double] = js.undefined
  var colors: js.UndefOr[js.Object] = js.undefined
  var components: js.UndefOr[AnonButton] = js.undefined
  var spacing: js.UndefOr[js.Object] = js.undefined
}

object AnonColorsComponents {
  @scala.inline
  def apply(
    baseFontSize: Int | Double = null,
    colors: js.Object = null,
    components: AnonButton = null,
    spacing: js.Object = null
  ): AnonColorsComponents = {
    val __obj = js.Dynamic.literal()
    if (baseFontSize != null) __obj.updateDynamic("baseFontSize")(baseFontSize.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorsComponents]
  }
}

