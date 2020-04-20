package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthToken extends js.Object {
  var accessToken: String
  var expiresAt: String
  var refreshToken: String
}

object OAuthToken {
  @scala.inline
  def apply(accessToken: String, expiresAt: String, refreshToken: String): OAuthToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthToken]
  }
}

