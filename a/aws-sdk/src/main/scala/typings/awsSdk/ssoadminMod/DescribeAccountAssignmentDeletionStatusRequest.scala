package typings.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccountAssignmentDeletionStatusRequest extends js.Object {
  
  /**
    * The identifier that is used to track the request operation progress.
    */
  var AccountAssignmentDeletionRequestId: UUId = js.native
  
  /**
    * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: typings.awsSdk.ssoadminMod.InstanceArn = js.native
}
object DescribeAccountAssignmentDeletionStatusRequest {
  
  @scala.inline
  def apply(AccountAssignmentDeletionRequestId: UUId, InstanceArn: InstanceArn): DescribeAccountAssignmentDeletionStatusRequest = {
    val __obj = js.Dynamic.literal(AccountAssignmentDeletionRequestId = AccountAssignmentDeletionRequestId.asInstanceOf[js.Any], InstanceArn = InstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountAssignmentDeletionStatusRequest]
  }
  
  @scala.inline
  implicit class DescribeAccountAssignmentDeletionStatusRequestOps[Self <: DescribeAccountAssignmentDeletionStatusRequest] (val x: Self) extends AnyVal {
    
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
    def setAccountAssignmentDeletionRequestId(value: UUId): Self = this.set("AccountAssignmentDeletionRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceArn(value: InstanceArn): Self = this.set("InstanceArn", value.asInstanceOf[js.Any])
  }
}
