package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIUser extends js.Object {
  var authToken: java.lang.String
  var email: java.lang.String
  var user_id: js.UndefOr[java.lang.String] = js.undefined
}

object APIUser {
  @scala.inline
  def apply(authToken: java.lang.String, email: java.lang.String, user_id: java.lang.String = null): APIUser = {
    val __obj = js.Dynamic.literal(authToken = authToken, email = email)
    if (user_id != null) __obj.updateDynamic("user_id")(user_id)
    __obj.asInstanceOf[APIUser]
  }
}

