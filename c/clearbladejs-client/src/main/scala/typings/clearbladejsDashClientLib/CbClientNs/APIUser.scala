package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIUser extends js.Object {
  var authToken: java.lang.String
  var email: java.lang.String
}

object APIUser {
  @scala.inline
  def apply(authToken: java.lang.String, email: java.lang.String): APIUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authToken")(authToken)
    __obj.updateDynamic("email")(email)
    __obj.asInstanceOf[APIUser]
  }
}

