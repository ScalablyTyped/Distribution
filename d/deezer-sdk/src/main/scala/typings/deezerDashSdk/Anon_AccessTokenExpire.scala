package typings.deezerDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessTokenExpire extends js.Object {
  var accessToken: String
  var expire: String
  var userID: String
}

object Anon_AccessTokenExpire {
  @scala.inline
  def apply(accessToken: String, expire: String, userID: String): Anon_AccessTokenExpire = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AccessTokenExpire]
  }
}

