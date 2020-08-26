package typings.bugsnagJs.sessionMod

import typings.bugsnagJs.anon.Handled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  var events: Handled = js.native
  var id: String = js.native
  var startedAt: String = js.native
  def trackError(report: typings.bugsnagJs.reportMod.default): Unit = js.native
}

object Session {
  @scala.inline
  def apply(
    events: Handled,
    id: String,
    startedAt: String,
    trackError: typings.bugsnagJs.reportMod.default => Unit
  ): Session = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], trackError = js.Any.fromFunction1(trackError))
    __obj.asInstanceOf[Session]
  }
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
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
    def setEvents(value: Handled): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartedAt(value: String): Self = this.set("startedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrackError(value: typings.bugsnagJs.reportMod.default => Unit): Self = this.set("trackError", js.Any.fromFunction1(value))
  }
  
}

