package typings.backlogJs.mod.Option.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchUserParams extends js.Object {
  
  var mailAddress: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var roleType: js.UndefOr[RoleType] = js.native
}
object PatchUserParams {
  
  @scala.inline
  def apply(): PatchUserParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchUserParams]
  }
  
  @scala.inline
  implicit class PatchUserParamsOps[Self <: PatchUserParams] (val x: Self) extends AnyVal {
    
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
    def setMailAddress(value: String): Self = this.set("mailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMailAddress: Self = this.set("mailAddress", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setRoleType(value: RoleType): Self = this.set("roleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleType: Self = this.set("roleType", js.undefined)
  }
}
