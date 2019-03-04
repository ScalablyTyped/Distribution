package typings
package bugsnagDashJsLib.typesClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISession extends js.Object {
  var id: java.lang.String
  var startedAt: java.lang.String
  var user: js.UndefOr[js.Object] = js.undefined
}

object ISession {
  @scala.inline
  def apply(id: java.lang.String, startedAt: java.lang.String, user: js.Object = null): ISession = {
    val __obj = js.Dynamic.literal(id = id, startedAt = startedAt)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[ISession]
  }
}

