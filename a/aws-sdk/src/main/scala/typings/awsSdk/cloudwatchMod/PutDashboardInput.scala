package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDashboardInput extends js.Object {
  /**
    * The detailed information about the dashboard in JSON format, including the widgets to include and their location on the dashboard. This parameter is required. For more information about the syntax, see CloudWatch-Dashboard-Body-Structure.
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
}

