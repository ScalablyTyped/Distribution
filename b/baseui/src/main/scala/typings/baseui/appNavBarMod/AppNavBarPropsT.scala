package typings.baseui.appNavBarMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/app-nav-bar.UserMenuPropsT & {  isMainItemActive :(item : baseui.baseui/app-nav-bar.NavItemT): boolean | undefined,   mainItems :std.Array<baseui.baseui/app-nav-bar.NavItemT> | undefined,   mapItemToNode :(item : baseui.baseui/app-nav-bar.NavItemT): react.react.ReactNode | undefined,   onMainItemSelect :(item : baseui.baseui/app-nav-bar.NavItemT): / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mixed * / any | undefined,   title :react.react.ReactNode | undefined} */
@js.native
trait AppNavBarPropsT extends js.Object {
  
  var isMainItemActive: js.UndefOr[js.Function1[/* item */ NavItemT, Boolean]] = js.native
  
  var mainItems: js.UndefOr[js.Array[NavItemT]] = js.native
  
  var mapItemToNode: js.UndefOr[js.Function1[/* item */ NavItemT, ReactNode]] = js.native
  
  var onMainItemSelect: js.UndefOr[
    js.Function1[
      /* item */ NavItemT, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mixed */ _
    ]
  ] = js.native
  
  var onUserItemSelect: js.UndefOr[
    js.Function1[
      /* item */ NavItemT, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mixed */ _
    ]
  ] = js.native
  
  var title: js.UndefOr[ReactNode] = js.native
  
  var userImgUrl: js.UndefOr[String] = js.native
  
  var userItems: js.UndefOr[js.Array[NavItemT]] = js.native
  
  var username: js.UndefOr[String] = js.native
  
  var usernameSubtitle: js.UndefOr[ReactNode] = js.native
}
object AppNavBarPropsT {
  
  @scala.inline
  def apply(): AppNavBarPropsT = {
    val __obj = js.Dynamic.literal()
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
    def setIsMainItemActive(value: /* item */ NavItemT => Boolean): Self = this.set("isMainItemActive", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsMainItemActive: Self = this.set("isMainItemActive", js.undefined)
    
    @scala.inline
    def setMainItemsVarargs(value: NavItemT*): Self = this.set("mainItems", js.Array(value :_*))
    
    @scala.inline
    def setMainItems(value: js.Array[NavItemT]): Self = this.set("mainItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainItems: Self = this.set("mainItems", js.undefined)
    
    @scala.inline
    def setMapItemToNode(value: /* item */ NavItemT => ReactNode): Self = this.set("mapItemToNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMapItemToNode: Self = this.set("mapItemToNode", js.undefined)
    
    @scala.inline
    def setOnMainItemSelect(
      value: /* item */ NavItemT => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mixed */ _
    ): Self = this.set("onMainItemSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMainItemSelect: Self = this.set("onMainItemSelect", js.undefined)
    
    @scala.inline
    def setOnUserItemSelect(
      value: /* item */ NavItemT => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mixed */ _
    ): Self = this.set("onUserItemSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUserItemSelect: Self = this.set("onUserItemSelect", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUserImgUrl(value: String): Self = this.set("userImgUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserImgUrl: Self = this.set("userImgUrl", js.undefined)
    
    @scala.inline
    def setUserItemsVarargs(value: NavItemT*): Self = this.set("userItems", js.Array(value :_*))
    
    @scala.inline
    def setUserItems(value: js.Array[NavItemT]): Self = this.set("userItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserItems: Self = this.set("userItems", js.undefined)
    
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
