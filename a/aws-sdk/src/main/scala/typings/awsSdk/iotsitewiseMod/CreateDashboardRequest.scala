package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDashboardRequest extends js.Object {
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  /**
    * The dashboard definition specified in a JSON literal. For detailed information, see Creating Dashboards (CLI) in the AWS IoT SiteWise User Guide.
    */
  var dashboardDefinition: DashboardDefinition = js.native
  /**
    * A description for the dashboard.
    */
  var dashboardDescription: js.UndefOr[Description] = js.native
  /**
    * A friendly name for the dashboard.
    */
  var dashboardName: Name = js.native
  /**
    * The ID of the project in which to create the dashboard.
    */
  var projectId: ID = js.native
  /**
    * A list of key-value pairs that contain metadata for the dashboard. For more information, see Tagging your AWS IoT SiteWise resources in the AWS IoT SiteWise User Guide.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateDashboardRequest {
  @scala.inline
  def apply(
    dashboardDefinition: DashboardDefinition,
    dashboardName: Name,
    projectId: ID,
    clientToken: ClientToken = null,
    dashboardDescription: Description = null,
    tags: TagMap = null
  ): CreateDashboardRequest = {
    val __obj = js.Dynamic.literal(dashboardDefinition = dashboardDefinition.asInstanceOf[js.Any], dashboardName = dashboardName.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (dashboardDescription != null) __obj.updateDynamic("dashboardDescription")(dashboardDescription.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDashboardRequest]
  }
}

