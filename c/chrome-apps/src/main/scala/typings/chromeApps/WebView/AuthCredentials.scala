package typings.chromeApps.WebView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthCredentials extends js.Object {
  var password: String
  var username: String
}

object AuthCredentials {
  @scala.inline
  def apply(password: String, username: String): AuthCredentials = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthCredentials]
  }
}

