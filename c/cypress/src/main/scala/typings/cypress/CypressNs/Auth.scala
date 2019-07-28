package typings.cypress.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth extends js.Object {
  var password: String
  var username: String
}

object Auth {
  @scala.inline
  def apply(password: String, username: String): Auth = {
    val __obj = js.Dynamic.literal(password = password, username = username)
  
    __obj.asInstanceOf[Auth]
  }
}

