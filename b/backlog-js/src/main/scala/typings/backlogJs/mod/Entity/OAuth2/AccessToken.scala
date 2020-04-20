package typings.backlogJs.mod.Entity.OAuth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessToken extends js.Object {
  var access_token: String
  var expires_in: Double
  var refresh_token: String
  var token_type: String
}

object AccessToken {
  @scala.inline
  def apply(access_token: String, expires_in: Double, refresh_token: String, token_type: String): AccessToken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessToken]
  }
}

