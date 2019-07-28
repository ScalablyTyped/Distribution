package typings.clearbladejsDashClient.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIUser extends js.Object {
  var authToken: String
  var email: String
}

object APIUser {
  @scala.inline
  def apply(authToken: String, email: String): APIUser = {
    val __obj = js.Dynamic.literal(authToken = authToken, email = email)
  
    __obj.asInstanceOf[APIUser]
  }
}

