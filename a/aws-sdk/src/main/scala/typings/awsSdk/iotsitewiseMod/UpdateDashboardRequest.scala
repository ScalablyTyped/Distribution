package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDashboardRequest extends js.Object {
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  
  /**
    * The new dashboard definition, as specified in a JSON literal. For detailed information, see Creating dashboards (CLI) in the AWS IoT SiteWise User Guide.
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
  def apply(dashboardDefinition: DashboardDefinition, dashboardId: ID, dashboardName: Name): UpdateDashboardRequest = {
    val __obj = js.Dynamic.literal(dashboardDefinition = dashboardDefinition.asInstanceOf[js.Any], dashboardId = dashboardId.asInstanceOf[js.Any], dashboardName = dashboardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDashboardRequest]
  }
  
  @scala.inline
  implicit class UpdateDashboardRequestOps[Self <: UpdateDashboardRequest] (val x: Self) extends AnyVal {
    
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
    def setDashboardId(value: ID): Self = this.set("dashboardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardName(value: Name): Self = this.set("dashboardName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    
    @scala.inline
    def setDashboardDescription(value: Description): Self = this.set("dashboardDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashboardDescription: Self = this.set("dashboardDescription", js.undefined)
  }
}
