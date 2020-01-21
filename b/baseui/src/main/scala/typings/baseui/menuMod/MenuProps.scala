package typings.baseui.menuMod

import typings.baseui.AnonEmptyState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  var overrides: js.UndefOr[AnonEmptyState] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(overrides: AnonEmptyState = null, size: String = null): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
}

