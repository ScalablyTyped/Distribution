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
  def apply(dashboardDefinition: DashboardDefinition, dashboardName: Name, projectId: ID): CreateDashboardRequest = {
    val __obj = js.Dynamic.literal(dashboardDefinition = dashboardDefinition.asInstanceOf[js.Any], dashboardName = dashboardName.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDashboardRequest]
  }
  @scala.inline
  implicit class CreateDashboardRequestOps[Self <: CreateDashboardRequest] (val x: Self) extends AnyVal {
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
    def setDashboardDefinition(value: DashboardDefinition): Self = this.set("dashboardDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setDashboardName(value: Name): Self = this.set("dashboardName", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectId(value: ID): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    @scala.inline
    def setDashboardDescription(value: Description): Self = this.set("dashboardDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashboardDescription: Self = this.set("dashboardDescription", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

