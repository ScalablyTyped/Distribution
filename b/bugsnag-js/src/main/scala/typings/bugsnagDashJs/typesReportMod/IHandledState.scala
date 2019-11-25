package typings.bugsnagDashJs.typesReportMod

import typings.bugsnagDashJs.Anon_KeyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHandledState extends js.Object {
  var severity: String
  var severityReason: Anon_KeyType
  var unhandled: Boolean
}

object IHandledState {
  @scala.inline
  def apply(severity: String, severityReason: Anon_KeyType, unhandled: Boolean): IHandledState = {
    val __obj = js.Dynamic.literal(severity = severity.asInstanceOf[js.Any], severityReason = severityReason.asInstanceOf[js.Any], unhandled = unhandled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IHandledState]
  }
}

