package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullRequestCreatedEventMetadata extends StObject {
  
  /**
    * The commit ID of the tip of the branch specified as the destination branch when the pull request was created.
    */
  var destinationCommitId: js.UndefOr[CommitId] = js.undefined
  
  /**
    * The commit ID of the most recent commit that the source branch and the destination branch have in common.
    */
  var mergeBase: js.UndefOr[CommitId] = js.undefined
  
  /**
    * The name of the repository where the pull request was created.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  
  /**
    * The commit ID on the source branch used when the pull request was created.
    */
  var sourceCommitId: js.UndefOr[CommitId] = js.undefined
}
object PullRequestCreatedEventMetadata {
  
  @scala.inline
  def apply(): PullRequestCreatedEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestCreatedEventMetadata]
  }
  
  @scala.inline
  implicit class PullRequestCreatedEventMetadataMutableBuilder[Self <: PullRequestCreatedEventMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationCommitId(value: CommitId): Self = StObject.set(x, "destinationCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationCommitIdUndefined: Self = StObject.set(x, "destinationCommitId", js.undefined)
    
    @scala.inline
    def setMergeBase(value: CommitId): Self = StObject.set(x, "mergeBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeBaseUndefined: Self = StObject.set(x, "mergeBase", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    
    @scala.inline
    def setSourceCommitId(value: CommitId): Self = StObject.set(x, "sourceCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCommitIdUndefined: Self = StObject.set(x, "sourceCommitId", js.undefined)
  }
}
