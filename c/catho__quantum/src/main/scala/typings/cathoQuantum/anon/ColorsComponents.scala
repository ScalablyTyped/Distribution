package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorsComponents extends js.Object {
  var baseFontSize: js.UndefOr[Double] = js.undefined
  var colors: js.UndefOr[js.Object] = js.undefined
  var components: js.UndefOr[Button] = js.undefined
  var spacing: js.UndefOr[js.Object] = js.undefined
}

object ColorsComponents {
  @scala.inline
  def apply(
    baseFontSize: js.UndefOr[Double] = js.undefined,
    colors: js.Object = null,
    components: Button = null,
    spacing: js.Object = null
  ): ColorsComponents = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(baseFontSize)) __obj.updateDynamic("baseFontSize")(baseFontSize.get.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorsComponents]
  }
}

