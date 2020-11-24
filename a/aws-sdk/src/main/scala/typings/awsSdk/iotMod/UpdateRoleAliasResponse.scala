package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRoleAliasResponse extends js.Object {
  
  /**
    * The role alias.
    */
  var roleAlias: js.UndefOr[RoleAlias] = js.native
  
  /**
    * The role alias ARN.
    */
  var roleAliasArn: js.UndefOr[RoleAliasArn] = js.native
}
object UpdateRoleAliasResponse {
  
  @scala.inline
  def apply(): UpdateRoleAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRoleAliasResponse]
  }
  
  @scala.inline
  implicit class UpdateRoleAliasResponseOps[Self <: UpdateRoleAliasResponse] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteRoleAlias: Self = this.set("roleAlias", js.undefined)
    
    @scala.inline
    def setRoleAliasArn(value: RoleAliasArn): Self = this.set("roleAliasArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleAliasArn: Self = this.set("roleAliasArn", js.undefined)
  }
}
