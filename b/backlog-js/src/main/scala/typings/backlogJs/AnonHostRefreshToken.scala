package typings.backlogJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHostRefreshToken extends js.Object {
  var host: String
  var refreshToken: String
}

object AnonHostRefreshToken {
  @scala.inline
  def apply(host: String, refreshToken: String): AnonHostRefreshToken = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHostRefreshToken]
  }
}

