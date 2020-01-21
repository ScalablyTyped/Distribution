package typings.bugsnagJs.sessionMod

import typings.bugsnagJs.AnonHandled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  var events: AnonHandled
  var id: String
  var startedAt: String
  def trackError(report: typings.bugsnagJs.reportMod.default): Unit
}

object Session {
  @scala.inline
  def apply(
    events: AnonHandled,
    id: String,
    startedAt: String,
    trackError: typings.bugsnagJs.reportMod.default => Unit
  ): Session = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], trackError = js.Any.fromFunction1(trackError))
  
    __obj.asInstanceOf[Session]
  }
}

