package typings.chrome.chrome.webRequest

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
    val __obj = js.Dynamic.literal(password = password, username = username)
  
    __obj.asInstanceOf[AuthCredentials]
  }
}

