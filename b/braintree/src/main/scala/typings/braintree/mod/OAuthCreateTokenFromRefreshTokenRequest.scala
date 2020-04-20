package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthCreateTokenFromRefreshTokenRequest extends js.Object {
  var refreshToken: String
}

object OAuthCreateTokenFromRefreshTokenRequest {
  @scala.inline
  def apply(refreshToken: String): OAuthCreateTokenFromRefreshTokenRequest = {
    val __obj = js.Dynamic.literal(refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthCreateTokenFromRefreshTokenRequest]
  }
}

