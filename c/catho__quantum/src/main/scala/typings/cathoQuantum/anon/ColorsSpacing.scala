package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorsSpacing extends js.Object {
  var colors: js.UndefOr[js.Object] = js.undefined
  var spacing: js.UndefOr[js.Object] = js.undefined
}

object ColorsSpacing {
  @scala.inline
  def apply(colors: js.Object = null, spacing: js.Object = null): ColorsSpacing = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorsSpacing]
  }
}

