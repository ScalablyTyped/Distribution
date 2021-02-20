package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDashboardPermissionsResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dashboard.
    */
  var DashboardArn: js.UndefOr[Arn] = js.native
  
  /**
    * The ID for the dashboard.
    */
  var DashboardId: js.UndefOr[RestrictiveResourceId] = js.native
  
  /**
    * Information about the permissions on the dashboard.
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object UpdateDashboardPermissionsResponse {
  
  @scala.inline
  def apply(): UpdateDashboardPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDashboardPermissionsResponse]
  }
  
  @scala.inline
  implicit class UpdateDashboardPermissionsResponseMutableBuilder[Self <: UpdateDashboardPermissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboardArn(value: Arn): Self = StObject.set(x, "DashboardArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardArnUndefined: Self = StObject.set(x, "DashboardArn", js.undefined)
    
    @scala.inline
    def setDashboardId(value: RestrictiveResourceId): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardIdUndefined: Self = StObject.set(x, "DashboardId", js.undefined)
    
    @scala.inline
    def setPermissions(value: ResourcePermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "Permissions", js.Array(value :_*))
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
