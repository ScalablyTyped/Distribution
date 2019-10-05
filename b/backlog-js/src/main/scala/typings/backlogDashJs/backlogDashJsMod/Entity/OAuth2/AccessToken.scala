package typings.backlogDashJs.backlogDashJsMod.Entity.OAuth2

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
    val __obj = js.Dynamic.literal(access_token = access_token, expires_in = expires_in, refresh_token = refresh_token, token_type = token_type)
  
    __obj.asInstanceOf[AccessToken]
  }
}

