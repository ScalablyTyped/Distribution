package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDashboardOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dashboard.
    */
  var DashboardArn: js.UndefOr[typings.awsSdk.cloudwatchMod.DashboardArn] = js.native
  /**
    * The detailed information about the dashboard, including what widgets are included and their location on the dashboard. For more information about the DashboardBody syntax, see CloudWatch-Dashboard-Body-Structure. 
    */
  var DashboardBody: js.UndefOr[typings.awsSdk.cloudwatchMod.DashboardBody] = js.native
  /**
    * The name of the dashboard.
    */
  var DashboardName: js.UndefOr[typings.awsSdk.cloudwatchMod.DashboardName] = js.native
}

object GetDashboardOutput {
  @scala.inline
  def apply(
    DashboardArn: DashboardArn = null,
    DashboardBody: DashboardBody = null,
    DashboardName: DashboardName = null
  ): GetDashboardOutput = {
    val __obj = js.Dynamic.literal()
    if (DashboardArn != null) __obj.updateDynamic("DashboardArn")(DashboardArn.asInstanceOf[js.Any])
    if (DashboardBody != null) __obj.updateDynamic("DashboardBody")(DashboardBody.asInstanceOf[js.Any])
    if (DashboardName != null) __obj.updateDynamic("DashboardName")(DashboardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDashboardOutput]
  }
}

