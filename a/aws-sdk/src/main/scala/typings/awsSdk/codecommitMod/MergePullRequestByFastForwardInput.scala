package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergePullRequestByFastForwardInput extends StObject {
  
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId
  
  /**
    * The name of the repository where the pull request was created.
    */
  var repositoryName: RepositoryName
  
  /**
    * The full commit ID of the original or updated commit in the pull request source branch. Pass this value if you want an exception thrown if the current commit ID of the tip of the source branch does not match this commit ID.
    */
  var sourceCommitId: js.UndefOr[ObjectId] = js.undefined
}
object MergePullRequestByFastForwardInput {
  
  @scala.inline
  def apply(pullRequestId: PullRequestId, repositoryName: RepositoryName): MergePullRequestByFastForwardInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergePullRequestByFastForwardInput]
  }
  
  @scala.inline
  implicit class MergePullRequestByFastForwardInputMutableBuilder[Self <: MergePullRequestByFastForwardInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCommitId(value: ObjectId): Self = StObject.set(x, "sourceCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCommitIdUndefined: Self = StObject.set(x, "sourceCommitId", js.undefined)
  }
}
