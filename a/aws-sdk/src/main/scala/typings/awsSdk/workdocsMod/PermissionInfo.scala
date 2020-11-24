package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionInfo extends js.Object {
  
  /**
    * The role of the user.
    */
  var Role: js.UndefOr[RoleType] = js.native
  
  /**
    * The type of permissions.
    */
  var Type: js.UndefOr[RolePermissionType] = js.native
}
object PermissionInfo {
  
  @scala.inline
  def apply(): PermissionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionInfo]
  }
  
  @scala.inline
  implicit class PermissionInfoOps[Self <: PermissionInfo] (val x: Self) extends AnyVal {
    
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
    def setRole(value: RoleType): Self = this.set("Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("Role", js.undefined)
    
    @scala.inline
    def setType(value: RolePermissionType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
