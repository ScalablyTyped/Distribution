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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("startedAt")(startedAt)
    __obj.updateDynamic("trackError")(trackError)
    __obj.asInstanceOf[Session]
  }
}

