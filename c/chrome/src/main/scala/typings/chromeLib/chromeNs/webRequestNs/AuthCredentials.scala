package typings
package chromeLib.chromeNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthCredentials extends js.Object {
  var password: java.lang.String
  var username: java.lang.String
}

object AuthCredentials {
  @scala.inline
  def apply(password: java.lang.String, username: java.lang.String): AuthCredentials = {
    val __obj = js.Dynamic.literal(password = password, username = username)
  
    __obj.asInstanceOf[AuthCredentials]
  }
}

