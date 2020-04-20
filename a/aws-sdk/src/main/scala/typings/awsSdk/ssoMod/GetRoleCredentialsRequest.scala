package typings.awsSdk.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

