package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDashboardRequest extends js.Object {
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  /**
    * The new dashboard definition, as specified in a JSON literal. For detailed information, see Creating Dashboards (CLI) in the AWS IoT SiteWise User Guide.
    */
  var dashboardDefinition: DashboardDefinition = js.native
  /**
    * A new description for the dashboard.
    */
  var dashboardDescription: js.UndefOr[Description] = js.native
  /**
    * The ID of the dashboard to update.
    */
  var dashboardId: ID = js.native
  /**
    * A new friendly name for the dashboard.
    */
  var dashboardName: Name = js.native
}

object UpdateDashboardRequest {
  @scala.inline
  def apply(
    dashboardDefinition: DashboardDefinition,
    dashboardId: ID,
    dashboardName: Name,
    clientToken: ClientToken = null,
    dashboardDescription: Description = null
  ): UpdateDashboardRequest = {
    val __obj = js.Dynamic.literal(dashboardDefinition = dashboardDefinition.asInstanceOf[js.Any], dashboardId = dashboardId.asInstanceOf[js.Any], dashboardName = dashboardName.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (dashboardDescription != null) __obj.updateDynamic("dashboardDescription")(dashboardDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDashboardRequest]
  }
}

