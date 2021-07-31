package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDashboardResponse extends StObject {
  
  /**
    * The ARN of the dashboard, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:dashboard/${DashboardId} 
    */
  var dashboardArn: ARN
  
  /**
    * The date the dashboard was created, in Unix epoch time.
    */
  var dashboardCreationDate: Timestamp
  
  /**
    * The dashboard's definition JSON literal. For detailed information, see Creating dashboards (CLI) in the AWS IoT SiteWise User Guide.
    */
  var dashboardDefinition: DashboardDefinition
  
  /**
    * The dashboard's description.
    */
  var dashboardDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the dashboard.
    */
  var dashboardId: ID
  
  /**
    * The date the dashboard was last updated, in Unix epoch time.
    */
  var dashboardLastUpdateDate: Timestamp
  
  /**
    * The name of the dashboard.
    */
  var dashboardName: Name
  
  /**
    * The ID of the project that the dashboard is in.
    */
  var projectId: ID
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
    projectId: ID
  ): DescribeDashboardResponse = {
    val __obj = js.Dynamic.literal(dashboardArn = dashboardArn.asInstanceOf[js.Any], dashboardCreationDate = dashboardCreationDate.asInstanceOf[js.Any], dashboardDefinition = dashboardDefinition.asInstanceOf[js.Any], dashboardId = dashboardId.asInstanceOf[js.Any], dashboardLastUpdateDate = dashboardLastUpdateDate.asInstanceOf[js.Any], dashboardName = dashboardName.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDashboardResponse]
  }
  
  @scala.inline
  implicit class DescribeDashboardResponseMutableBuilder[Self <: DescribeDashboardResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboardArn(value: ARN): Self = StObject.set(x, "dashboardArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardCreationDate(value: Timestamp): Self = StObject.set(x, "dashboardCreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardDefinition(value: DashboardDefinition): Self = StObject.set(x, "dashboardDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardDescription(value: Description): Self = StObject.set(x, "dashboardDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardDescriptionUndefined: Self = StObject.set(x, "dashboardDescription", js.undefined)
    
    @scala.inline
    def setDashboardId(value: ID): Self = StObject.set(x, "dashboardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardLastUpdateDate(value: Timestamp): Self = StObject.set(x, "dashboardLastUpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardName(value: Name): Self = StObject.set(x, "dashboardName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectId(value: ID): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
  }
}
