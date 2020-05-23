package typings.deezerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expire extends js.Object {
  var accessToken: String
  var expire: String
  var userID: String
}

object Expire {
  @scala.inline
  def apply(accessToken: String, expire: String, userID: String): Expire = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expire]
  }
}

