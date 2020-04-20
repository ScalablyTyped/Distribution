package typings.awsSdk.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogoutRequest extends js.Object {
  /**
    * The token issued by the CreateToken API call. For more information, see CreateToken in the AWS SSO OIDC API Reference Guide.
    */
  var accessToken: AccessTokenType = js.native
}

object LogoutRequest {
  @scala.inline
  def apply(accessToken: AccessTokenType): LogoutRequest = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogoutRequest]
  }
}

