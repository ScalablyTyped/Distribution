package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRoleAliasRequest extends js.Object {
  
  /**
    * The number of seconds the credential will be valid.
    */
  var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.native
  
  /**
    * The role alias to update.
    */
  var roleAlias: RoleAlias = js.native
  
  /**
    * The role ARN.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}
object UpdateRoleAliasRequest {
  
  @scala.inline
  def apply(roleAlias: RoleAlias): UpdateRoleAliasRequest = {
    val __obj = js.Dynamic.literal(roleAlias = roleAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoleAliasRequest]
  }
  
  @scala.inline
  implicit class UpdateRoleAliasRequestOps[Self <: UpdateRoleAliasRequest] (val x: Self) extends AnyVal {
    
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
    def setCredentialDurationSeconds(value: CredentialDurationSeconds): Self = this.set("credentialDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentialDurationSeconds: Self = this.set("credentialDurationSeconds", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
}
