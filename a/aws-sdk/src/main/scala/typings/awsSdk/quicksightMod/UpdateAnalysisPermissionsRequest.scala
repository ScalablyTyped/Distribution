package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAnalysisPermissionsRequest extends StObject {
  
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
  implicit class UpdateAnalysisPermissionsRequestMutableBuilder[Self <: UpdateAnalysisPermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisId(value: RestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantPermissions(value: UpdateResourcePermissionList): Self = StObject.set(x, "GrantPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantPermissionsUndefined: Self = StObject.set(x, "GrantPermissions", js.undefined)
    
    @scala.inline
    def setGrantPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "GrantPermissions", js.Array(value :_*))
    
    @scala.inline
    def setRevokePermissions(value: UpdateResourcePermissionList): Self = StObject.set(x, "RevokePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevokePermissionsUndefined: Self = StObject.set(x, "RevokePermissions", js.undefined)
    
    @scala.inline
    def setRevokePermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "RevokePermissions", js.Array(value :_*))
  }
}
