package typings
package bugsnagDashJsLib.typesClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISessionPayload extends js.Object {
  var app: js.UndefOr[js.Object] = js.undefined
  var device: js.UndefOr[js.Object] = js.undefined
  var notifier: bugsnagDashJsLib.Anon_Name
  var sessions: js.Array[ISession]
  var user: js.UndefOr[js.Object] = js.undefined
}

object ISessionPayload {
  @scala.inline
  def apply(
    notifier: bugsnagDashJsLib.Anon_Name,
    sessions: js.Array[ISession],
    app: js.Object = null,
    device: js.Object = null,
    user: js.Object = null
  ): ISessionPayload = {
    val __obj = js.Dynamic.literal(notifier = notifier, sessions = sessions)
    if (app != null) __obj.updateDynamic("app")(app)
    if (device != null) __obj.updateDynamic("device")(device)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[ISessionPayload]
  }
}

