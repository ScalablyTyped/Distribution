package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateServiceLinkedRoleResponse extends js.Object {
  
  /**
    * A Role object that contains details about the newly created role.
    */
  var Role: js.UndefOr[typings.awsSdk.iamMod.Role] = js.native
}
object CreateServiceLinkedRoleResponse {
  
  @scala.inline
  def apply(): CreateServiceLinkedRoleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceLinkedRoleResponse]
  }
  
  @scala.inline
  implicit class CreateServiceLinkedRoleResponseOps[Self <: CreateServiceLinkedRoleResponse] (val x: Self) extends AnyVal {
    
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
    def setRole(value: Role): Self = this.set("Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("Role", js.undefined)
  }
}
