package typings.bugsnagJs.clientMod

import typings.bugsnagJs.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISessionPayload extends js.Object {
  var app: js.UndefOr[js.Object] = js.native
  var device: js.UndefOr[js.Object] = js.native
  var notifier: Name = js.native
  var sessions: js.Array[ISession] = js.native
  var user: js.UndefOr[js.Object] = js.native
}

object ISessionPayload {
  @scala.inline
  def apply(notifier: Name, sessions: js.Array[ISession]): ISessionPayload = {
    val __obj = js.Dynamic.literal(notifier = notifier.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISessionPayload]
  }
  @scala.inline
  implicit class ISessionPayloadOps[Self <: ISessionPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNotifier(value: Name): Self = this.set("notifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionsVarargs(value: ISession*): Self = this.set("sessions", js.Array(value :_*))
    @scala.inline
    def setSessions(value: js.Array[ISession]): Self = this.set("sessions", value.asInstanceOf[js.Any])
    @scala.inline
    def setApp(value: js.Object): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp: Self = this.set("app", js.undefined)
    @scala.inline
    def setDevice(value: js.Object): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    @scala.inline
    def setUser(value: js.Object): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

