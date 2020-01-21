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
}

