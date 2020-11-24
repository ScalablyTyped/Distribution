package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The dashboard's definition JSON literal. For detailed information, see Creating dashboards (CLI) in the AWS IoT SiteWise User Guide.
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
    projectId: ID
  ): DescribeDashboardResponse = {
    val __obj = js.Dynamic.literal(dashboardArn = dashboardArn.asInstanceOf[js.Any], dashboardCreationDate = dashboardCreationDate.asInstanceOf[js.Any], dashboardDefinition = dashboardDefinition.asInstanceOf[js.Any], dashboardId = dashboardId.asInstanceOf[js.Any], dashboardLastUpdateDate = dashboardLastUpdateDate.asInstanceOf[js.Any], dashboardName = dashboardName.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDashboardResponse]
  }
  
  @scala.inline
  implicit class DescribeDashboardResponseOps[Self <: DescribeDashboardResponse] (val x: Self) extends AnyVal {
    
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
    def setDashboardArn(value: ARN): Self = this.set("dashboardArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardCreationDate(value: Timestamp): Self = this.set("dashboardCreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardDefinition(value: DashboardDefinition): Self = this.set("dashboardDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardId(value: ID): Self = this.set("dashboardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardLastUpdateDate(value: Timestamp): Self = this.set("dashboardLastUpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardName(value: Name): Self = this.set("dashboardName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectId(value: ID): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardDescription(value: Description): Self = this.set("dashboardDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashboardDescription: Self = this.set("dashboardDescription", js.undefined)
  }
}
