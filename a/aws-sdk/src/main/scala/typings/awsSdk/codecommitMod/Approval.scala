package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Approval extends js.Object {
  /**
    * The state of the approval, APPROVE or REVOKE. REVOKE states are not stored.
    */
  var approvalState: js.UndefOr[ApprovalState] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user.
    */
  var userArn: js.UndefOr[Arn] = js.native
}

object Approval {
  @scala.inline
  def apply(): Approval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Approval]
  }
  @scala.inline
  implicit class ApprovalOps[Self <: Approval] (val x: Self) extends AnyVal {
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
    def setApprovalState(value: ApprovalState): Self = this.set("approvalState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalState: Self = this.set("approvalState", js.undefined)
    @scala.inline
    def setUserArn(value: Arn): Self = this.set("userArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserArn: Self = this.set("userArn", js.undefined)
  }
  
}

