package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveIAMPolicyAssignment extends js.Object {
  /**
    * A name for the IAM policy assignment.
    */
  var AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var PolicyArn: js.UndefOr[Arn] = js.native
}

object ActiveIAMPolicyAssignment {
  @scala.inline
  def apply(): ActiveIAMPolicyAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveIAMPolicyAssignment]
  }
  @scala.inline
  implicit class ActiveIAMPolicyAssignmentOps[Self <: ActiveIAMPolicyAssignment] (val x: Self) extends AnyVal {
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
    def deleteAssignmentName: Self = this.set("AssignmentName", js.undefined)
    @scala.inline
    def setPolicyArn(value: Arn): Self = this.set("PolicyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyArn: Self = this.set("PolicyArn", js.undefined)
  }
  
}

