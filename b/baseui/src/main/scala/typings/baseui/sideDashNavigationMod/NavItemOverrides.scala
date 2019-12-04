package typings.baseui.sideDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavItemOverrides extends js.Object {
  var NavItem: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var NavLink: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}

object NavItemOverrides {
  @scala.inline
  def apply(
    NavItem: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    NavLink: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null
  ): NavItemOverrides = {
    val __obj = js.Dynamic.literal()
    if (NavItem != null) __obj.updateDynamic("NavItem")(NavItem.asInstanceOf[js.Any])
    if (NavLink != null) __obj.updateDynamic("NavLink")(NavLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavItemOverrides]
  }
}

