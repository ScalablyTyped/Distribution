package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIAMPolicyAssignmentsRequest extends js.Object {
  /**
    * The status of the assignments.
    */
  var AssignmentStatus: js.UndefOr[typings.awsSdk.quicksightMod.AssignmentStatus] = js.native
  /**
    * The ID of the AWS account that contains these IAM policy assignments.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.quicksightMod.MaxResults] = js.native
  /**
    * The namespace for the assignments.
    */
  var Namespace: typings.awsSdk.quicksightMod.Namespace = js.native
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListIAMPolicyAssignmentsRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, Namespace: Namespace): ListIAMPolicyAssignmentsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIAMPolicyAssignmentsRequest]
  }
  @scala.inline
  implicit class ListIAMPolicyAssignmentsRequestOps[Self <: ListIAMPolicyAssignmentsRequest] (val x: Self) extends AnyVal {
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
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: Namespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssignmentStatus(value: AssignmentStatus): Self = this.set("AssignmentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignmentStatus: Self = this.set("AssignmentStatus", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

