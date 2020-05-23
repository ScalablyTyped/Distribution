package typings.backlogJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshToken extends js.Object {
  var host: String
  var refreshToken: String
}

object RefreshToken {
  @scala.inline
  def apply(host: String, refreshToken: String): RefreshToken = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshToken]
  }
}

