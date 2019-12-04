package typings.baseui.headerDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderNavigationProps extends js.Object {
  var overrides: js.UndefOr[HeaderNavigationOverrides] = js.undefined
}

object HeaderNavigationProps {
  @scala.inline
  def apply(overrides: HeaderNavigationOverrides = null): HeaderNavigationProps = {
    val __obj = js.Dynamic.literal()
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderNavigationProps]
  }
}

