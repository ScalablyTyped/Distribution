package typings
package backlogDashJsLib.backlogDashJsMod.EntityNs.OAuth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessToken extends js.Object {
  var access_token: java.lang.String
  var expires_in: scala.Double
  var refresh_token: java.lang.String
  var token_type: java.lang.String
}

object AccessToken {
  @scala.inline
  def apply(
    access_token: java.lang.String,
    expires_in: scala.Double,
    refresh_token: java.lang.String,
    token_type: java.lang.String
  ): AccessToken = {
    val __obj = js.Dynamic.literal(access_token = access_token, expires_in = expires_in, refresh_token = refresh_token, token_type = token_type)
  
    __obj.asInstanceOf[AccessToken]
  }
}

