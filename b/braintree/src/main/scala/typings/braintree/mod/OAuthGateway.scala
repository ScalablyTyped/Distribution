package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthGateway extends js.Object {
  def connectUrl(urlRequest: OAuthConnectUrlRequest): String
  def createTokenFromCode(request: OAuthCreateTokenFromCodeRequest): js.Promise[ValidatedResponse[OAuthToken]]
  def createTokenFromRefreshToken(request: OAuthCreateTokenFromRefreshTokenRequest): js.Promise[ValidatedResponse[OAuthToken]]
  def revokeAccessToken(accessToken: String): js.Promise[ValidatedResponse[Unit]]
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
}

