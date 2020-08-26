package typings.baseui.sideNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavItemOverrides extends js.Object {
  var NavItem: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var NavLink: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}

object NavItemOverrides {
  @scala.inline
  def apply(): NavItemOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavItemOverrides]
  }
  @scala.inline
  implicit class NavItemOverridesOps[Self <: NavItemOverrides] (val x: Self) extends AnyVal {
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
    def setNavLink(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("NavLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavLink: Self = this.set("NavLink", js.undefined)
  }
  
}

