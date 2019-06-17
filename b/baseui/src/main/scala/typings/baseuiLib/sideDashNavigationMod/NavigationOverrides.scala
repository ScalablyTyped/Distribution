package typings
package baseuiLib.sideDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationOverrides extends js.Object {
  var NavItem: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var NavItemContainer: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var NavLink: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Root: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var SubNavContainer: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object NavigationOverrides {
  @scala.inline
  def apply(
    NavItem: baseuiLib.Override[_] = null,
    NavItemContainer: baseuiLib.Override[_] = null,
    NavLink: baseuiLib.Override[_] = null,
    Root: baseuiLib.Override[_] = null,
    SubNavContainer: baseuiLib.Override[_] = null
  ): NavigationOverrides = {
    val __obj = js.Dynamic.literal()
    if (NavItem != null) __obj.updateDynamic("NavItem")(NavItem.asInstanceOf[js.Any])
    if (NavItemContainer != null) __obj.updateDynamic("NavItemContainer")(NavItemContainer.asInstanceOf[js.Any])
    if (NavLink != null) __obj.updateDynamic("NavLink")(NavLink.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    if (SubNavContainer != null) __obj.updateDynamic("SubNavContainer")(SubNavContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationOverrides]
  }
}

