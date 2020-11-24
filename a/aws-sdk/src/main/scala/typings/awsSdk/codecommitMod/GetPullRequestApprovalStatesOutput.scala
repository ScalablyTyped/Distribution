package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPullRequestApprovalStatesOutput extends js.Object {
  
  /**
    * Information about users who have approved the pull request.
    */
  var approvals: js.UndefOr[ApprovalList] = js.native
}
object GetPullRequestApprovalStatesOutput {
  
  @scala.inline
  def apply(): GetPullRequestApprovalStatesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPullRequestApprovalStatesOutput]
  }
  
  @scala.inline
  implicit class GetPullRequestApprovalStatesOutputOps[Self <: GetPullRequestApprovalStatesOutput] (val x: Self) extends AnyVal {
    
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
    def setApprovalsVarargs(value: Approval*): Self = this.set("approvals", js.Array(value :_*))
    
    @scala.inline
    def setApprovals(value: ApprovalList): Self = this.set("approvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApprovals: Self = this.set("approvals", js.undefined)
  }
}
