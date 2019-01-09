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

