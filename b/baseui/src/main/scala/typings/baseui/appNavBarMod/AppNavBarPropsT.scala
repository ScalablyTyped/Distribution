package typings.baseui.appNavBarMod

import typings.baseui.anon.Item
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppNavBarPropsT extends js.Object {
  var appDisplayName: js.UndefOr[ReactNode] = js.native
  // eslint-disable-next-line flowtype/no-weak-type;
  var mainNav: js.UndefOr[js.Array[MainNavItemT]] = js.native
  var userImgUrl: js.UndefOr[String] = js.native
  var userNav: js.UndefOr[js.Array[UserNavItemT]] = js.native
  var username: js.UndefOr[String] = js.native
  var usernameSubtitle: js.UndefOr[ReactNode] = js.native
  def isNavItemActive(params: Item): Boolean = js.native
  def onNavItemSelect(params: Item): js.Any = js.native
}

object AppNavBarPropsT {
  @scala.inline
  def apply(isNavItemActive: Item => Boolean, onNavItemSelect: Item => js.Any): AppNavBarPropsT = {
    val __obj = js.Dynamic.literal(isNavItemActive = js.Any.fromFunction1(isNavItemActive), onNavItemSelect = js.Any.fromFunction1(onNavItemSelect))
    __obj.asInstanceOf[AppNavBarPropsT]
  }
  @scala.inline
  implicit class AppNavBarPropsTOps[Self <: AppNavBarPropsT] (val x: Self) extends AnyVal {
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
    def setIsNavItemActive(value: Item => Boolean): Self = this.set("isNavItemActive", js.Any.fromFunction1(value))
    @scala.inline
    def setOnNavItemSelect(value: Item => js.Any): Self = this.set("onNavItemSelect", js.Any.fromFunction1(value))
    @scala.inline
    def setAppDisplayName(value: ReactNode): Self = this.set("appDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppDisplayName: Self = this.set("appDisplayName", js.undefined)
    @scala.inline
    def setMainNavVarargs(value: MainNavItemT*): Self = this.set("mainNav", js.Array(value :_*))
    @scala.inline
    def setMainNav(value: js.Array[MainNavItemT]): Self = this.set("mainNav", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMainNav: Self = this.set("mainNav", js.undefined)
    @scala.inline
    def setUserImgUrl(value: String): Self = this.set("userImgUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserImgUrl: Self = this.set("userImgUrl", js.undefined)
    @scala.inline
    def setUserNavVarargs(value: UserNavItemT*): Self = this.set("userNav", js.Array(value :_*))
    @scala.inline
    def setUserNav(value: js.Array[UserNavItemT]): Self = this.set("userNav", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserNav: Self = this.set("userNav", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    @scala.inline
    def setUsernameSubtitle(value: ReactNode): Self = this.set("usernameSubtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsernameSubtitle: Self = this.set("usernameSubtitle", js.undefined)
  }
  
}

