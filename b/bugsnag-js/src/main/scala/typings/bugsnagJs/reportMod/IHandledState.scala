package typings.bugsnagJs.reportMod

import typings.bugsnagJs.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHandledState extends js.Object {
  var severity: String = js.native
  var severityReason: Type = js.native
  var unhandled: Boolean = js.native
}

object IHandledState {
  @scala.inline
  def apply(severity: String, severityReason: Type, unhandled: Boolean): IHandledState = {
    val __obj = js.Dynamic.literal(severity = severity.asInstanceOf[js.Any], severityReason = severityReason.asInstanceOf[js.Any], unhandled = unhandled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHandledState]
  }
  @scala.inline
  implicit class IHandledStateOps[Self <: IHandledState] (val x: Self) extends AnyVal {
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
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeverityReason(value: Type): Self = this.set("severityReason", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnhandled(value: Boolean): Self = this.set("unhandled", value.asInstanceOf[js.Any])
  }
  
}

