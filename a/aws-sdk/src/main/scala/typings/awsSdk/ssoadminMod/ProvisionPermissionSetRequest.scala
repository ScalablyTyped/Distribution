package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionPermissionSetRequest extends StObject {
  
  /**
    * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: typings.awsSdk.ssoadminMod.InstanceArn
  
  /**
    * The ARN of the permission set.
    */
  var PermissionSetArn: typings.awsSdk.ssoadminMod.PermissionSetArn
  
  /**
    * TargetID is an AWS account identifier, typically a 10-12 digit string (For example, 123456789012).
    */
  var TargetId: js.UndefOr[typings.awsSdk.ssoadminMod.TargetId] = js.undefined
  
  /**
    * The entity type for which the assignment will be created.
    */
  var TargetType: ProvisionTargetType
}
object ProvisionPermissionSetRequest {
  
  @scala.inline
  def apply(InstanceArn: InstanceArn, PermissionSetArn: PermissionSetArn, TargetType: ProvisionTargetType): ProvisionPermissionSetRequest = {
    val __obj = js.Dynamic.literal(InstanceArn = InstanceArn.asInstanceOf[js.Any], PermissionSetArn = PermissionSetArn.asInstanceOf[js.Any], TargetType = TargetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionPermissionSetRequest]
  }
  
  @scala.inline
  implicit class ProvisionPermissionSetRequestMutableBuilder[Self <: ProvisionPermissionSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionSetArn(value: PermissionSetArn): Self = StObject.set(x, "PermissionSetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetId(value: TargetId): Self = StObject.set(x, "TargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "TargetId", js.undefined)
    
    @scala.inline
    def setTargetType(value: ProvisionTargetType): Self = StObject.set(x, "TargetType", value.asInstanceOf[js.Any])
  }
}
