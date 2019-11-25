package typings.clearbladejsDashServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIUser extends js.Object {
  var authToken: String
  var email: String
  var user_id: js.UndefOr[String] = js.undefined
}

object APIUser {
  @scala.inline
  def apply(authToken: String, email: String, user_id: String = null): APIUser = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIUser]
  }
}

