package typings.backlogDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostRefreshToken extends js.Object {
  var host: String
  var refreshToken: String
}

object Anon_HostRefreshToken {
  @scala.inline
  def apply(host: String, refreshToken: String): Anon_HostRefreshToken = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_HostRefreshToken]
  }
}

