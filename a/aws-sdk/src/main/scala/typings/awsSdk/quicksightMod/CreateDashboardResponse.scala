package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDashboardResponse extends StObject {
  
  /**
    * The ARN of the dashboard.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.undefined
  
  /**
    * The status of the dashboard creation request.
    */
  var CreationStatus: js.UndefOr[ResourceStatus] = js.undefined
  
  /**
    * The ID for the dashboard.
    */
  var DashboardId: js.UndefOr[RestrictiveResourceId] = js.undefined
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * The ARN of the dashboard, including the version number of the first version that is created.
    */
  var VersionArn: js.UndefOr[Arn] = js.undefined
}
object CreateDashboardResponse {
  
  @scala.inline
  def apply(): CreateDashboardResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDashboardResponse]
  }
  
  @scala.inline
  implicit class CreateDashboardResponseMutableBuilder[Self <: CreateDashboardResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreationStatus(value: ResourceStatus): Self = StObject.set(x, "CreationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationStatusUndefined: Self = StObject.set(x, "CreationStatus", js.undefined)
    
    @scala.inline
    def setDashboardId(value: RestrictiveResourceId): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardIdUndefined: Self = StObject.set(x, "DashboardId", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setVersionArn(value: Arn): Self = StObject.set(x, "VersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionArnUndefined: Self = StObject.set(x, "VersionArn", js.undefined)
  }
}
