package typings.baseui.menuMod

import typings.baseui.Anon_EmptyState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  var overrides: js.UndefOr[Anon_EmptyState] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(overrides: Anon_EmptyState = null, size: String = null): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
}

