package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePullRequestApprovalStateInput extends StObject {
  
  /**
    * The approval state to associate with the user on the pull request.
    */
  var approvalState: ApprovalState
  
  /**
    * The system-generated ID of the pull request.
    */
  var pullRequestId: PullRequestId
  
  /**
    * The system-generated ID of the revision.
    */
  var revisionId: RevisionId
}
object UpdatePullRequestApprovalStateInput {
  
  @scala.inline
  def apply(approvalState: ApprovalState, pullRequestId: PullRequestId, revisionId: RevisionId): UpdatePullRequestApprovalStateInput = {
    val __obj = js.Dynamic.literal(approvalState = approvalState.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestApprovalStateInput]
  }
  
  @scala.inline
  implicit class UpdatePullRequestApprovalStateInputMutableBuilder[Self <: UpdatePullRequestApprovalStateInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalState(value: ApprovalState): Self = StObject.set(x, "approvalState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
  }
}
