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
  @scala.inline
  implicit class LogoutRequestOps[Self <: LogoutRequest] (val x: Self) extends AnyVal {
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
  }
  
}

