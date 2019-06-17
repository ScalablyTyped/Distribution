package typings
package baseuiLib.sideDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavItemOverrides extends js.Object {
  var NavItem: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var NavLink: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object NavItemOverrides {
  @scala.inline
  def apply(NavItem: baseuiLib.Override[_] = null, NavLink: baseuiLib.Override[_] = null): NavItemOverrides = {
    val __obj = js.Dynamic.literal()
    if (NavItem != null) __obj.updateDynamic("NavItem")(NavItem.asInstanceOf[js.Any])
    if (NavLink != null) __obj.updateDynamic("NavLink")(NavLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavItemOverrides]
  }
}

