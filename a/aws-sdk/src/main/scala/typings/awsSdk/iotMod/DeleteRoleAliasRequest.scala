package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRoleAliasRequest extends js.Object {
  
  /**
    * The role alias to delete.
    */
  var roleAlias: RoleAlias = js.native
}
object DeleteRoleAliasRequest {
  
  @scala.inline
  def apply(roleAlias: RoleAlias): DeleteRoleAliasRequest = {
    val __obj = js.Dynamic.literal(roleAlias = roleAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRoleAliasRequest]
  }
  
  @scala.inline
  implicit class DeleteRoleAliasRequestOps[Self <: DeleteRoleAliasRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRoleAlias(value: RoleAlias): Self = this.set("roleAlias", value.asInstanceOf[js.Any])
  }
}
