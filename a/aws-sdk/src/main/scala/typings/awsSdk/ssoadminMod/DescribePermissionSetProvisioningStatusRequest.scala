package typings.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePermissionSetProvisioningStatusRequest extends js.Object {
  
  /**
    * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: typings.awsSdk.ssoadminMod.InstanceArn = js.native
  
  /**
    * The identifier that is provided by the ProvisionPermissionSet call to retrieve the current status of the provisioning workflow.
    */
  var ProvisionPermissionSetRequestId: UUId = js.native
}
object DescribePermissionSetProvisioningStatusRequest {
  
  @scala.inline
  def apply(InstanceArn: InstanceArn, ProvisionPermissionSetRequestId: UUId): DescribePermissionSetProvisioningStatusRequest = {
    val __obj = js.Dynamic.literal(InstanceArn = InstanceArn.asInstanceOf[js.Any], ProvisionPermissionSetRequestId = ProvisionPermissionSetRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePermissionSetProvisioningStatusRequest]
  }
  
  @scala.inline
  implicit class DescribePermissionSetProvisioningStatusRequestOps[Self <: DescribePermissionSetProvisioningStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstanceArn(value: InstanceArn): Self = this.set("InstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionPermissionSetRequestId(value: UUId): Self = this.set("ProvisionPermissionSetRequestId", value.asInstanceOf[js.Any])
  }
}
