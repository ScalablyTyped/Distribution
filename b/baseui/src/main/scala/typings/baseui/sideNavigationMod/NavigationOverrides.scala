package typings.baseui.sideNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationOverrides extends js.Object {
  var NavItem: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var NavItemContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var NavLink: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var SubNavContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}

object NavigationOverrides {
  @scala.inline
  def apply(): NavigationOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationOverrides]
  }
  @scala.inline
  implicit class NavigationOverridesOps[Self <: NavigationOverrides] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNavItem(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("NavItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavItem: Self = this.set("NavItem", js.undefined)
    @scala.inline
    def setNavItemContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("NavItemContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavItemContainer: Self = this.set("NavItemContainer", js.undefined)
    @scala.inline
    def setNavLink(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("NavLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavLink: Self = this.set("NavLink", js.undefined)
    @scala.inline
    def setRoot(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("Root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("Root", js.undefined)
    @scala.inline
    def setSubNavContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("SubNavContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubNavContainer: Self = this.set("SubNavContainer", js.undefined)
  }
  
}

