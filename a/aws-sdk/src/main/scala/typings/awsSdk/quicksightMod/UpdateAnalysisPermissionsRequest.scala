package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAnalysisPermissionsRequest extends js.Object {
  
  /**
    * The ID of the analysis whose permissions you're updating. The ID is part of the analysis URL.
    */
  var AnalysisId: RestrictiveResourceId = js.native
  
  /**
    * The ID of the AWS account that contains the analysis whose permissions you're updating. You must be using the AWS account that the analysis is in.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * A structure that describes the permissions to add and the principal to add them to.
    */
  var GrantPermissions: js.UndefOr[UpdateResourcePermissionList] = js.native
  
  /**
    * A structure that describes the permissions to remove and the principal to remove them from.
    */
  var RevokePermissions: js.UndefOr[UpdateResourcePermissionList] = js.native
}
object UpdateAnalysisPermissionsRequest {
  
  @scala.inline
  def apply(AnalysisId: RestrictiveResourceId, AwsAccountId: AwsAccountId): UpdateAnalysisPermissionsRequest = {
    val __obj = js.Dynamic.literal(AnalysisId = AnalysisId.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAnalysisPermissionsRequest]
  }
  
  @scala.inline
  implicit class UpdateAnalysisPermissionsRequestOps[Self <: UpdateAnalysisPermissionsRequest] (val x: Self) extends AnyVal {
    
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
    def setAnalysisId(value: RestrictiveResourceId): Self = this.set("AnalysisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    
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
