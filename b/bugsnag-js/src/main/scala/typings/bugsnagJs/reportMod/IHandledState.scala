package typings.bugsnagJs.reportMod

import typings.bugsnagJs.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHandledState extends js.Object {
  var severity: String
  var severityReason: AnonType
  var unhandled: Boolean
}

object IHandledState {
  @scala.inline
  def apply(severity: String, severityReason: AnonType, unhandled: Boolean): IHandledState = {
    val __obj = js.Dynamic.literal(severity = severity.asInstanceOf[js.Any], severityReason = severityReason.asInstanceOf[js.Any], unhandled = unhandled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IHandledState]
  }
}

