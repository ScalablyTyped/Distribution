package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Components extends js.Object {
  var baseFontSize: js.UndefOr[Double] = js.undefined
  var components: js.UndefOr[Badge] = js.undefined
  var spacing: js.UndefOr[js.Object] = js.undefined
}

object Components {
  @scala.inline
  def apply(
    baseFontSize: js.UndefOr[Double] = js.undefined,
    components: Badge = null,
    spacing: js.Object = null
  ): Components = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(baseFontSize)) __obj.updateDynamic("baseFontSize")(baseFontSize.get.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Components]
  }
}

