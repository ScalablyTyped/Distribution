package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorsComponents extends js.Object {
  var colors: js.UndefOr[js.Object] = js.undefined
  var components: js.UndefOr[AnonTag] = js.undefined
  var spacing: js.UndefOr[js.Object] = js.undefined
}

object AnonColorsComponents {
  @scala.inline
  def apply(colors: js.Object = null, components: AnonTag = null, spacing: js.Object = null): AnonColorsComponents = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorsComponents]
  }
}

