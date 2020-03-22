package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorsSpacing extends js.Object {
  var colors: js.UndefOr[js.Object] = js.undefined
  var spacing: js.UndefOr[js.Object] = js.undefined
}

object AnonColorsSpacing {
  @scala.inline
  def apply(colors: js.Object = null, spacing: js.Object = null): AnonColorsSpacing = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorsSpacing]
  }
}

