package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRoleDescriptionRequest extends js.Object {
  
  /**
    * The new description that you want to apply to the specified role.
    */
  var Description: roleDescriptionType = js.native
  
  /**
    * The name of the role that you want to modify.
    */
  var RoleName: roleNameType = js.native
}
object UpdateRoleDescriptionRequest {
  
  @scala.inline
  def apply(Description: roleDescriptionType, RoleName: roleNameType): UpdateRoleDescriptionRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], RoleName = RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoleDescriptionRequest]
  }
  
  @scala.inline
  implicit class UpdateRoleDescriptionRequestOps[Self <: UpdateRoleDescriptionRequest] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: roleDescriptionType): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleName(value: roleNameType): Self = this.set("RoleName", value.asInstanceOf[js.Any])
  }
}
