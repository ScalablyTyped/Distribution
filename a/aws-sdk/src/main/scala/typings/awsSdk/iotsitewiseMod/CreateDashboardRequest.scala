package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDashboardRequest extends StObject {
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  
  /**
    * The dashboard definition specified in a JSON literal. For detailed information, see Creating dashboards (CLI) in the AWS IoT SiteWise User Guide.
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
  implicit class CreateDashboardRequestMutableBuilder[Self <: CreateDashboardRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setDashboardDefinition(value: DashboardDefinition): Self = StObject.set(x, "dashboardDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardDescription(value: Description): Self = StObject.set(x, "dashboardDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardDescriptionUndefined: Self = StObject.set(x, "dashboardDescription", js.undefined)
    
    @scala.inline
    def setDashboardName(value: Name): Self = StObject.set(x, "dashboardName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectId(value: ID): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
