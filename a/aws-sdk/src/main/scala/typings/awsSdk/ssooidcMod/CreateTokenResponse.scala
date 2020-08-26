package typings.awsSdk.ssooidcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTokenResponse extends js.Object {
  /**
    * An opaque token to access AWS SSO resources assigned to a user.
    */
  var accessToken: js.UndefOr[AccessToken] = js.native
  /**
    * Indicates the time in seconds when an access token will expire.
    */
  var expiresIn: js.UndefOr[ExpirationInSeconds] = js.native
  /**
    * The identifier of the user that associated with the access token, if present.
    */
  var idToken: js.UndefOr[IdToken] = js.native
  /**
    * A token that, if present, can be used to refresh a previously issued access token that might have expired.
    */
  var refreshToken: js.UndefOr[RefreshToken] = js.native
  /**
    * Used to notify the client that the returned token is an access token. The supported type is BearerToken.
    */
  var tokenType: js.UndefOr[TokenType] = js.native
}

object CreateTokenResponse {
  @scala.inline
  def apply(): CreateTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTokenResponse]
  }
  @scala.inline
  implicit class CreateTokenResponseOps[Self <: CreateTokenResponse] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: AccessToken): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    @scala.inline
    def setExpiresIn(value: ExpirationInSeconds): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiresIn: Self = this.set("expiresIn", js.undefined)
    @scala.inline
    def setIdToken(value: IdToken): Self = this.set("idToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
    @scala.inline
    def setRefreshToken(value: RefreshToken): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
    @scala.inline
    def setTokenType(value: TokenType): Self = this.set("tokenType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenType: Self = this.set("tokenType", js.undefined)
  }
  
}

