package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuthGateway extends js.Object {
  def connectUrl(urlRequest: OAuthConnectUrlRequest): String = js.native
  def createTokenFromCode(request: OAuthCreateTokenFromCodeRequest): js.Promise[ValidatedResponse[OAuthToken]] = js.native
  def createTokenFromRefreshToken(request: OAuthCreateTokenFromRefreshTokenRequest): js.Promise[ValidatedResponse[OAuthToken]] = js.native
  def revokeAccessToken(accessToken: String): js.Promise[ValidatedResponse[Unit]] = js.native
}

object OAuthGateway {
  @scala.inline
  def apply(
    connectUrl: OAuthConnectUrlRequest => String,
    createTokenFromCode: OAuthCreateTokenFromCodeRequest => js.Promise[ValidatedResponse[OAuthToken]],
    createTokenFromRefreshToken: OAuthCreateTokenFromRefreshTokenRequest => js.Promise[ValidatedResponse[OAuthToken]],
    revokeAccessToken: String => js.Promise[ValidatedResponse[Unit]]
  ): OAuthGateway = {
    val __obj = js.Dynamic.literal(connectUrl = js.Any.fromFunction1(connectUrl), createTokenFromCode = js.Any.fromFunction1(createTokenFromCode), createTokenFromRefreshToken = js.Any.fromFunction1(createTokenFromRefreshToken), revokeAccessToken = js.Any.fromFunction1(revokeAccessToken))
    __obj.asInstanceOf[OAuthGateway]
  }
  @scala.inline
  implicit class OAuthGatewayOps[Self <: OAuthGateway] (val x: Self) extends AnyVal {
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
    def setConnectUrl(value: OAuthConnectUrlRequest => String): Self = this.set("connectUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateTokenFromCode(value: OAuthCreateTokenFromCodeRequest => js.Promise[ValidatedResponse[OAuthToken]]): Self = this.set("createTokenFromCode", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateTokenFromRefreshToken(value: OAuthCreateTokenFromRefreshTokenRequest => js.Promise[ValidatedResponse[OAuthToken]]): Self = this.set("createTokenFromRefreshToken", js.Any.fromFunction1(value))
    @scala.inline
    def setRevokeAccessToken(value: String => js.Promise[ValidatedResponse[Unit]]): Self = this.set("revokeAccessToken", js.Any.fromFunction1(value))
  }
  
}

