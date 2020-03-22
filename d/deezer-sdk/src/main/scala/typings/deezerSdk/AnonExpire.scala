package typings.deezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpire extends js.Object {
  var accessToken: String
  var expire: String
  var userID: String
}

object AnonExpire {
  @scala.inline
  def apply(accessToken: String, expire: String, userID: String): AnonExpire = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExpire]
  }
}

