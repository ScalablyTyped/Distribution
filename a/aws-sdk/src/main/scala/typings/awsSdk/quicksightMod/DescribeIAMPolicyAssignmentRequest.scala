package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIAMPolicyAssignmentRequest extends js.Object {
  /**
    * The name of the assignment. 
    */
  var AssignmentName: IAMPolicyAssignmentName = js.native
  /**
    * The ID of the AWS account that contains the assignment that you want to describe.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The namespace that contains the assignment.
    */
  var Namespace: typings.awsSdk.quicksightMod.Namespace = js.native
}

object DescribeIAMPolicyAssignmentRequest {
  @scala.inline
  def apply(AssignmentName: IAMPolicyAssignmentName, AwsAccountId: AwsAccountId, Namespace: Namespace): DescribeIAMPolicyAssignmentRequest = {
    val __obj = js.Dynamic.literal(AssignmentName = AssignmentName.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIAMPolicyAssignmentRequest]
  }
  @scala.inline
  implicit class DescribeIAMPolicyAssignmentRequestOps[Self <: DescribeIAMPolicyAssignmentRequest] (val x: Self) extends AnyVal {
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
    def setAssignmentName(value: IAMPolicyAssignmentName): Self = this.set("AssignmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: Namespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
  }
  
}

