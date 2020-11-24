package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDashboardPermissionsRequest extends js.Object {
  
  /**
    * The ID of the AWS account that contains the dashboard whose permissions you're updating.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * The ID for the dashboard.
    */
  var DashboardId: RestrictiveResourceId = js.native
  
  /**
    * The permissions that you want to grant on this resource.
    */
  var GrantPermissions: js.UndefOr[UpdateResourcePermissionList] = js.native
  
  /**
    * The permissions that you want to revoke from this resource.
    */
  var RevokePermissions: js.UndefOr[UpdateResourcePermissionList] = js.native
}
object UpdateDashboardPermissionsRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DashboardId: RestrictiveResourceId): UpdateDashboardPermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDashboardPermissionsRequest]
  }
  
  @scala.inline
  implicit class UpdateDashboardPermissionsRequestOps[Self <: UpdateDashboardPermissionsRequest] (val x: Self) extends AnyVal {
    
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
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardId(value: RestrictiveResourceId): Self = this.set("DashboardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantPermissionsVarargs(value: ResourcePermission*): Self = this.set("GrantPermissions", js.Array(value :_*))
    
    @scala.inline
    def setGrantPermissions(value: UpdateResourcePermissionList): Self = this.set("GrantPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantPermissions: Self = this.set("GrantPermissions", js.undefined)
    
    @scala.inline
    def setRevokePermissionsVarargs(value: ResourcePermission*): Self = this.set("RevokePermissions", js.Array(value :_*))
    
    @scala.inline
    def setRevokePermissions(value: UpdateResourcePermissionList): Self = this.set("RevokePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevokePermissions: Self = this.set("RevokePermissions", js.undefined)
  }
}
