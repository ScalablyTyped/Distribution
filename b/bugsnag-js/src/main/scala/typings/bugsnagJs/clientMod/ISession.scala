package typings.bugsnagJs.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISession extends js.Object {
  var id: String
  var startedAt: String
  var user: js.UndefOr[js.Object] = js.undefined
}

object ISession {
  @scala.inline
  def apply(id: String, startedAt: String, user: js.Object = null): ISession = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISession]
  }
}

