package typings
package bugsnagDashJsLib.typesSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  var events: bugsnagDashJsLib.Anon_Handled
  var id: java.lang.String
  var startedAt: java.lang.String
  def trackError(report: bugsnagDashJsLib.typesReportMod.default): scala.Unit
}

object Session {
  @scala.inline
  def apply(
    events: bugsnagDashJsLib.Anon_Handled,
    id: java.lang.String,
    startedAt: java.lang.String,
    trackError: js.Function1[bugsnagDashJsLib.typesReportMod.default, scala.Unit]
  ): Session = {
    val __obj = js.Dynamic.literal(events = events, id = id, startedAt = startedAt, trackError = trackError)
  
    __obj.asInstanceOf[Session]
  }
}

