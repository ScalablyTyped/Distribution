package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDashboardPermissionsRequest extends StObject {
  
  /**
    * The ID of the AWS account that contains the dashboard whose permissions you're updating.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * The ID for the dashboard.
    */
  var DashboardId: RestrictiveResourceId
  
  /**
    * The permissions that you want to grant on this resource.
    */
  var GrantPermissions: js.UndefOr[UpdateResourcePermissionList] = js.undefined
  
  /**
    * The permissions that you want to revoke from this resource.
    */
  var RevokePermissions: js.UndefOr[UpdateResourcePermissionList] = js.undefined
}
object UpdateDashboardPermissionsRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, DashboardId: RestrictiveResourceId): UpdateDashboardPermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDashboardPermissionsRequest]
  }
  
  extension [Self <: UpdateDashboardPermissionsRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setDashboardId(value: RestrictiveResourceId): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
    
    inline def setGrantPermissions(value: UpdateResourcePermissionList): Self = StObject.set(x, "GrantPermissions", value.asInstanceOf[js.Any])
    
    inline def setGrantPermissionsUndefined: Self = StObject.set(x, "GrantPermissions", js.undefined)
    
    inline def setGrantPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "GrantPermissions", js.Array(value :_*))
    
    inline def setRevokePermissions(value: UpdateResourcePermissionList): Self = StObject.set(x, "RevokePermissions", value.asInstanceOf[js.Any])
    
    inline def setRevokePermissionsUndefined: Self = StObject.set(x, "RevokePermissions", js.undefined)
    
    inline def setRevokePermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "RevokePermissions", js.Array(value :_*))
  }
}
