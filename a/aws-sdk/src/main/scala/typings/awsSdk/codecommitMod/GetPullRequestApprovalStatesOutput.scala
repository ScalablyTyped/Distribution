package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPullRequestApprovalStatesOutput extends StObject {
  
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
  implicit class GetPullRequestApprovalStatesOutputMutableBuilder[Self <: GetPullRequestApprovalStatesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovals(value: ApprovalList): Self = StObject.set(x, "approvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalsUndefined: Self = StObject.set(x, "approvals", js.undefined)
    
    @scala.inline
    def setApprovalsVarargs(value: Approval*): Self = StObject.set(x, "approvals", js.Array(value :_*))
  }
}
