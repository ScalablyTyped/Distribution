package typings.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined dav.dav.Partial<dav.dav.Credentials> */
@js.native
trait CredentialsOptions extends js.Object {
  var accessToken: js.UndefOr[String] = js.native
  var authorizationCode: js.UndefOr[String] = js.native
  var clientId: js.UndefOr[String] = js.native
  var clientSecret: js.UndefOr[String] = js.native
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], js.Any]] = js.native
  var expiration: js.UndefOr[Double] = js.native
  var password: js.UndefOr[String] = js.native
  var redirectUrl: js.UndefOr[String] = js.native
  var refreshToken: js.UndefOr[String] = js.native
  var tokenUrl: js.UndefOr[String] = js.native
  var username: js.UndefOr[String] = js.native
}

object CredentialsOptions {
  @scala.inline
  def apply(): CredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialsOptions]
  }
  @scala.inline
  implicit class CredentialsOptionsOps[Self <: CredentialsOptions] (val x: Self) extends AnyVal {
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
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    @scala.inline
    def setAuthorizationCode(value: String): Self = this.set("authorizationCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizationCode: Self = this.set("authorizationCode", js.undefined)
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientSecret: Self = this.set("clientSecret", js.undefined)
    @scala.inline
    def setConstructor(value: /* options */ js.UndefOr[CredentialsOptions] => js.Any): Self = this.set("constructor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteConstructor: Self = this.set("constructor", js.undefined)
    @scala.inline
    def setExpiration(value: Double): Self = this.set("expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setRedirectUrl(value: String): Self = this.set("redirectUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectUrl: Self = this.set("redirectUrl", js.undefined)
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
    @scala.inline
    def setTokenUrl(value: String): Self = this.set("tokenUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenUrl: Self = this.set("tokenUrl", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

