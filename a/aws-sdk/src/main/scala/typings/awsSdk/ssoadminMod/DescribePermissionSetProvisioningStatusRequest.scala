package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePermissionSetProvisioningStatusRequest extends StObject {
  
  /**
    * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: typings.awsSdk.ssoadminMod.InstanceArn
  
  /**
    * The identifier that is provided by the ProvisionPermissionSet call to retrieve the current status of the provisioning workflow.
    */
  var ProvisionPermissionSetRequestId: UUId
}
object DescribePermissionSetProvisioningStatusRequest {
  
  @scala.inline
  def apply(InstanceArn: InstanceArn, ProvisionPermissionSetRequestId: UUId): DescribePermissionSetProvisioningStatusRequest = {
    val __obj = js.Dynamic.literal(InstanceArn = InstanceArn.asInstanceOf[js.Any], ProvisionPermissionSetRequestId = ProvisionPermissionSetRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePermissionSetProvisioningStatusRequest]
  }
  
  @scala.inline
  implicit class DescribePermissionSetProvisioningStatusRequestMutableBuilder[Self <: DescribePermissionSetProvisioningStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionPermissionSetRequestId(value: UUId): Self = StObject.set(x, "ProvisionPermissionSetRequestId", value.asInstanceOf[js.Any])
  }
}
