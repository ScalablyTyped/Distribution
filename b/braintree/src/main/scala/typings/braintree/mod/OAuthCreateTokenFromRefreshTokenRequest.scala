package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuthCreateTokenFromRefreshTokenRequest extends js.Object {
  var refreshToken: String = js.native
}

object OAuthCreateTokenFromRefreshTokenRequest {
  @scala.inline
  def apply(refreshToken: String): OAuthCreateTokenFromRefreshTokenRequest = {
    val __obj = js.Dynamic.literal(refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthCreateTokenFromRefreshTokenRequest]
  }
  @scala.inline
  implicit class OAuthCreateTokenFromRefreshTokenRequestOps[Self <: OAuthCreateTokenFromRefreshTokenRequest] (val x: Self) extends AnyVal {
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
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
  }
  
}

