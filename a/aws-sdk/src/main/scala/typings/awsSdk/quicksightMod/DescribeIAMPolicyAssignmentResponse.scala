package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeIAMPolicyAssignmentResponse extends js.Object {
  
  /**
    * Information describing the IAM policy assignment.
    */
  var IAMPolicyAssignment: js.UndefOr[typings.awsSdk.quicksightMod.IAMPolicyAssignment] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object DescribeIAMPolicyAssignmentResponse {
  
  @scala.inline
  def apply(): DescribeIAMPolicyAssignmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIAMPolicyAssignmentResponse]
  }
  
  @scala.inline
  implicit class DescribeIAMPolicyAssignmentResponseOps[Self <: DescribeIAMPolicyAssignmentResponse] (val x: Self) extends AnyVal {
    
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
    def setIAMPolicyAssignment(value: IAMPolicyAssignment): Self = this.set("IAMPolicyAssignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIAMPolicyAssignment: Self = this.set("IAMPolicyAssignment", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
