package typings
package bugsnagDashJsLib.typesReportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHandledState extends js.Object {
  var severity: java.lang.String
  var severityReason: bugsnagDashJsLib.Anon_KeyType
  var unhandled: scala.Boolean
}

object IHandledState {
  @scala.inline
  def apply(
    severity: java.lang.String,
    severityReason: bugsnagDashJsLib.Anon_KeyType,
    unhandled: scala.Boolean
  ): IHandledState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("severity")(severity)
    __obj.updateDynamic("severityReason")(severityReason)
    __obj.updateDynamic("unhandled")(unhandled)
    __obj.asInstanceOf[IHandledState]
  }
}

