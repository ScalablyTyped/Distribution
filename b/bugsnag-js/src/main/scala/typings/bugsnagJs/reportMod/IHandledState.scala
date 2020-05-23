package typings.bugsnagJs.reportMod

import typings.bugsnagJs.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHandledState extends js.Object {
  var severity: String
  var severityReason: Type
  var unhandled: Boolean
}

object IHandledState {
  @scala.inline
  def apply(severity: String, severityReason: Type, unhandled: Boolean): IHandledState = {
    val __obj = js.Dynamic.literal(severity = severity.asInstanceOf[js.Any], severityReason = severityReason.asInstanceOf[js.Any], unhandled = unhandled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHandledState]
  }
}

