package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuthToken extends js.Object {
  var accessToken: String = js.native
  var expiresAt: String = js.native
  var refreshToken: String = js.native
}

object OAuthToken {
  @scala.inline
  def apply(accessToken: String, expiresAt: String, refreshToken: String): OAuthToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthToken]
  }
  @scala.inline
  implicit class OAuthTokenOps[Self <: OAuthToken] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpiresAt(value: String): Self = this.set("expiresAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
  }
  
}

