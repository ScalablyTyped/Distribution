package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth extends js.Object {
  var password: java.lang.String
  var username: java.lang.String
}

object Auth {
  @scala.inline
  def apply(password: java.lang.String, username: java.lang.String): Auth = {
    val __obj = js.Dynamic.literal(password = password, username = username)
  
    __obj.asInstanceOf[Auth]
  }
}

