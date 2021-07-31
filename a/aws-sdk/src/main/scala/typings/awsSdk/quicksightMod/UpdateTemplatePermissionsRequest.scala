package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTemplatePermissionsRequest extends StObject {
  
  /**
    * The ID of the AWS account that contains the template.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * A list of resource permissions to be granted on the template. 
    */
  var GrantPermissions: js.UndefOr[UpdateResourcePermissionList] = js.undefined
  
  /**
    * A list of resource permissions to be revoked from the template. 
    */
  var RevokePermissions: js.UndefOr[UpdateResourcePermissionList] = js.undefined
  
  /**
    * The ID for the template.
    */
  var TemplateId: RestrictiveResourceId
}
object UpdateTemplatePermissionsRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, TemplateId: RestrictiveResourceId): UpdateTemplatePermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTemplatePermissionsRequest]
  }
  
  @scala.inline
  implicit class UpdateTemplatePermissionsRequestMutableBuilder[Self <: UpdateTemplatePermissionsRequest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setTemplateId(value: RestrictiveResourceId): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
  }
}
