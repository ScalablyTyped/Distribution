package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPullRequestApprovalStatesInput extends StObject {
  
  /**
    * The system-generated ID for the pull request.
    */
  var pullRequestId: PullRequestId
  
  /**
    * The system-generated ID for the pull request revision.
    */
  var revisionId: RevisionId
}
object GetPullRequestApprovalStatesInput {
  
  @scala.inline
  def apply(pullRequestId: PullRequestId, revisionId: RevisionId): GetPullRequestApprovalStatesInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPullRequestApprovalStatesInput]
  }
  
  @scala.inline
  implicit class GetPullRequestApprovalStatesInputMutableBuilder[Self <: GetPullRequestApprovalStatesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
  }
}
