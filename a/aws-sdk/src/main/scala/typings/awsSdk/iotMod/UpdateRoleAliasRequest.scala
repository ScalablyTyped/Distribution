package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRoleAliasRequest extends StObject {
  
  /**
    * The number of seconds the credential will be valid.
    */
  var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined
  
  /**
    * The role alias to update.
    */
  var roleAlias: RoleAlias
  
  /**
    * The role ARN.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}
object UpdateRoleAliasRequest {
  
  @scala.inline
  def apply(roleAlias: RoleAlias): UpdateRoleAliasRequest = {
    val __obj = js.Dynamic.literal(roleAlias = roleAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoleAliasRequest]
  }
  
  @scala.inline
  implicit class UpdateRoleAliasRequestMutableBuilder[Self <: UpdateRoleAliasRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentialDurationSeconds(value: CredentialDurationSeconds): Self = StObject.set(x, "credentialDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialDurationSecondsUndefined: Self = StObject.set(x, "credentialDurationSeconds", js.undefined)
    
    @scala.inline
    def setRoleAlias(value: RoleAlias): Self = StObject.set(x, "roleAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
