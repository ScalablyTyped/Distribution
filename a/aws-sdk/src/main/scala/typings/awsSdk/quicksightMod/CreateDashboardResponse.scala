package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDashboardResponse extends js.Object {
  
  /**
    * The ARN of the dashboard.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * The status of the dashboard creation request.
    */
  var CreationStatus: js.UndefOr[ResourceStatus] = js.native
  
  /**
    * The ID for the dashboard.
    */
  var DashboardId: js.UndefOr[RestrictiveResourceId] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  
  /**
    * The ARN of the dashboard, including the version number of the first version that is created.
    */
  var VersionArn: js.UndefOr[Arn] = js.native
}
object CreateDashboardResponse {
  
  @scala.inline
  def apply(): CreateDashboardResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDashboardResponse]
  }
  
  @scala.inline
  implicit class CreateDashboardResponseOps[Self <: CreateDashboardResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCreationStatus(value: ResourceStatus): Self = this.set("CreationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationStatus: Self = this.set("CreationStatus", js.undefined)
    
    @scala.inline
    def setDashboardId(value: RestrictiveResourceId): Self = this.set("DashboardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashboardId: Self = this.set("DashboardId", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setVersionArn(value: Arn): Self = this.set("VersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionArn: Self = this.set("VersionArn", js.undefined)
  }
}
