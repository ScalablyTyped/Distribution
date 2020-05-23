package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDashboardResponse extends js.Object {
  /**
    * The ARN of the dashboard, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:dashboard/${DashboardId} 
    */
  var dashboardArn: ARN = js.native
  /**
    * The ID of the dashboard.
    */
  var dashboardId: ID = js.native
}

object CreateDashboardResponse {
  @scala.inline
  def apply(dashboardArn: ARN, dashboardId: ID): CreateDashboardResponse = {
    val __obj = js.Dynamic.literal(dashboardArn = dashboardArn.asInstanceOf[js.Any], dashboardId = dashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDashboardResponse]
  }
}

