package typings.baseui.sideDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationOverrides extends js.Object {
  var NavItem: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var NavItemContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var NavLink: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var SubNavContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}

object NavigationOverrides {
  @scala.inline
  def apply(
    NavItem: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    NavItemContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    NavLink: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    Root: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    SubNavContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null
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

