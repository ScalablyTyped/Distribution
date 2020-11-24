package typings.awsSdk.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRoleCredentialsRequest extends js.Object {
  
  /**
    * The token issued by the CreateToken API call. For more information, see CreateToken in the AWS SSO OIDC API Reference Guide.
    */
  var accessToken: AccessTokenType = js.native
  
  /**
    * The identifier for the AWS account that is assigned to the user.
    */
  var accountId: AccountIdType = js.native
  
  /**
    * The friendly name of the role that is assigned to the user.
    */
  var roleName: RoleNameType = js.native
}
object GetRoleCredentialsRequest {
  
  @scala.inline
  def apply(accessToken: AccessTokenType, accountId: AccountIdType, roleName: RoleNameType): GetRoleCredentialsRequest = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], accountId = accountId.asInstanceOf[js.Any], roleName = roleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRoleCredentialsRequest]
  }
  
  @scala.inline
  implicit class GetRoleCredentialsRequestOps[Self <: GetRoleCredentialsRequest] (val x: Self) extends AnyVal {
    
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
    def setAccessToken(value: AccessTokenType): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountId(value: AccountIdType): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleName(value: RoleNameType): Self = this.set("roleName", value.asInstanceOf[js.Any])
  }
}
