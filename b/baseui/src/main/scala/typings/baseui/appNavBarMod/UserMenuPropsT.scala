package typings.baseui.appNavBarMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserMenuPropsT extends js.Object {
  
  var onUserItemSelect: js.UndefOr[
    js.Function1[
      /* item */ NavItemT, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mixed */ _
    ]
  ] = js.native
  
  var userImgUrl: js.UndefOr[String] = js.native
  
  var userItems: js.UndefOr[js.Array[NavItemT]] = js.native
  
  var username: js.UndefOr[String] = js.native
  
  var usernameSubtitle: js.UndefOr[ReactNode] = js.native
}
object UserMenuPropsT {
  
  @scala.inline
  def apply(): UserMenuPropsT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserMenuPropsT]
  }
  
  @scala.inline
  implicit class UserMenuPropsTOps[Self <: UserMenuPropsT] (val x: Self) extends AnyVal {
    
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
    def setOnUserItemSelect(
      value: /* item */ NavItemT => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mixed */ _
    ): Self = this.set("onUserItemSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUserItemSelect: Self = this.set("onUserItemSelect", js.undefined)
    
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
