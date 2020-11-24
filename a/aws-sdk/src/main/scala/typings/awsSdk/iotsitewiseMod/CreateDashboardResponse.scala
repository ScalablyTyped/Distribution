package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class CreateDashboardResponseOps[Self <: CreateDashboardResponse] (val x: Self) extends AnyVal {
    
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
    def setDashboardId(value: ID): Self = this.set("dashboardId", value.asInstanceOf[js.Any])
  }
}
