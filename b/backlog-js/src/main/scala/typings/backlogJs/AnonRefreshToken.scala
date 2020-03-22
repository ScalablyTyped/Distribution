package typings.backlogJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRefreshToken extends js.Object {
  var host: String
  var refreshToken: String
}

object AnonRefreshToken {
  @scala.inline
  def apply(host: String, refreshToken: String): AnonRefreshToken = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRefreshToken]
  }
}

