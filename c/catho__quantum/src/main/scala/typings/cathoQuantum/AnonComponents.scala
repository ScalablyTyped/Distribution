package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponents extends js.Object {
  var baseFontSize: js.UndefOr[Double] = js.undefined
  var components: js.UndefOr[AnonBadge] = js.undefined
  var spacing: js.UndefOr[js.Object] = js.undefined
}

object AnonComponents {
  @scala.inline
  def apply(baseFontSize: Int | Double = null, components: AnonBadge = null, spacing: js.Object = null): AnonComponents = {
    val __obj = js.Dynamic.literal()
    if (baseFontSize != null) __obj.updateDynamic("baseFontSize")(baseFontSize.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponents]
  }
}

