package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullRequestSourceReferenceUpdatedEventMetadata extends StObject {
  
  /**
    * The full commit ID of the commit in the source branch that was the tip of the branch at the time the pull request was updated.
    */
  var afterCommitId: js.UndefOr[CommitId] = js.native
  
  /**
    * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull request was updated.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.native
  
  /**
    * The commit ID of the most recent commit that the source branch and the destination branch have in common.
    */
  var mergeBase: js.UndefOr[CommitId] = js.native
  
  /**
    * The name of the repository where the pull request was updated.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}
object PullRequestSourceReferenceUpdatedEventMetadata {
  
  @scala.inline
  def apply(): PullRequestSourceReferenceUpdatedEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestSourceReferenceUpdatedEventMetadata]
  }
  
  @scala.inline
  implicit class PullRequestSourceReferenceUpdatedEventMetadataMutableBuilder[Self <: PullRequestSourceReferenceUpdatedEventMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterCommitId(value: CommitId): Self = StObject.set(x, "afterCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterCommitIdUndefined: Self = StObject.set(x, "afterCommitId", js.undefined)
    
    @scala.inline
    def setBeforeCommitId(value: CommitId): Self = StObject.set(x, "beforeCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeCommitIdUndefined: Self = StObject.set(x, "beforeCommitId", js.undefined)
    
    @scala.inline
    def setMergeBase(value: CommitId): Self = StObject.set(x, "mergeBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeBaseUndefined: Self = StObject.set(x, "mergeBase", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
