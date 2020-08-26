package typings.backlogJs.mod.Entity.OAuth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessToken extends js.Object {
  var access_token: String = js.native
  var expires_in: Double = js.native
  var refresh_token: String = js.native
  var token_type: String = js.native
}

object AccessToken {
  @scala.inline
  def apply(access_token: String, expires_in: Double, refresh_token: String, token_type: String): AccessToken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessToken]
  }
  @scala.inline
  implicit class AccessTokenOps[Self <: AccessToken] (val x: Self) extends AnyVal {
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
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpires_in(value: Double): Self = this.set("expires_in", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefresh_token(value: String): Self = this.set("refresh_token", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken_type(value: String): Self = this.set("token_type", value.asInstanceOf[js.Any])
  }
  
}

