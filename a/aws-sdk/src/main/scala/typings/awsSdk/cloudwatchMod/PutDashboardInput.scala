package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDashboardInput extends js.Object {
  /**
    * The detailed information about the dashboard in JSON format, including the widgets to include and their location on the dashboard. This parameter is required. For more information about the syntax, see Dashboard Body Structure and Syntax.
    */
  var DashboardBody: typings.awsSdk.cloudwatchMod.DashboardBody = js.native
  /**
    * The name of the dashboard. If a dashboard with this name already exists, this call modifies that dashboard, replacing its current contents. Otherwise, a new dashboard is created. The maximum length is 255, and valid characters are A-Z, a-z, 0-9, "-", and "_". This parameter is required.
    */
  var DashboardName: typings.awsSdk.cloudwatchMod.DashboardName = js.native
}

object PutDashboardInput {
  @scala.inline
  def apply(DashboardBody: DashboardBody, DashboardName: DashboardName): PutDashboardInput = {
    val __obj = js.Dynamic.literal(DashboardBody = DashboardBody.asInstanceOf[js.Any], DashboardName = DashboardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDashboardInput]
  }
  @scala.inline
  implicit class PutDashboardInputOps[Self <: PutDashboardInput] (val x: Self) extends AnyVal {
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
    def setDashboardBody(value: DashboardBody): Self = this.set("DashboardBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setDashboardName(value: DashboardName): Self = this.set("DashboardName", value.asInstanceOf[js.Any])
  }
  
}

