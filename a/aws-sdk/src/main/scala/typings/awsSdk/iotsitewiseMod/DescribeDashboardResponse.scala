package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDashboardResponse extends js.Object {
  /**
    * The ARN of the dashboard, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:dashboard/${DashboardId} 
    */
  var dashboardArn: ARN = js.native
  /**
    * The date the dashboard was created, in Unix epoch time.
    */
  var dashboardCreationDate: Timestamp = js.native
  /**
    * The dashboard's definition JSON literal. For detailed information, see Creating Dashboards (CLI) in the AWS IoT SiteWise User Guide.
    */
  var dashboardDefinition: DashboardDefinition = js.native
  /**
    * The dashboard's description.
    */
  var dashboardDescription: js.UndefOr[Description] = js.native
  /**
    * The ID of the dashboard.
    */
  var dashboardId: ID = js.native
  /**
    * The date the dashboard was last updated, in Unix epoch time.
    */
  var dashboardLastUpdateDate: Timestamp = js.native
  /**
    * The name of the dashboard.
    */
  var dashboardName: Name = js.native
  /**
    * The ID of the project that the dashboard is in.
    */
  var projectId: ID = js.native
}

object DescribeDashboardResponse {
  @scala.inline
  def apply(
    dashboardArn: ARN,
    dashboardCreationDate: Timestamp,
    dashboardDefinition: DashboardDefinition,
    dashboardId: ID,
    dashboardLastUpdateDate: Timestamp,
    dashboardName: Name,
    projectId: ID,
    dashboardDescription: Description = null
  ): DescribeDashboardResponse = {
    val __obj = js.Dynamic.literal(dashboardArn = dashboardArn.asInstanceOf[js.Any], dashboardCreationDate = dashboardCreationDate.asInstanceOf[js.Any], dashboardDefinition = dashboardDefinition.asInstanceOf[js.Any], dashboardId = dashboardId.asInstanceOf[js.Any], dashboardLastUpdateDate = dashboardLastUpdateDate.asInstanceOf[js.Any], dashboardName = dashboardName.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    if (dashboardDescription != null) __obj.updateDynamic("dashboardDescription")(dashboardDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDashboardResponse]
  }
}

