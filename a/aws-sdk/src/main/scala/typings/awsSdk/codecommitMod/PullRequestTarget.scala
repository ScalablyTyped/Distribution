package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullRequestTarget extends StObject {
  
  /**
    * The full commit ID that is the tip of the destination branch. This is the commit where the pull request was or will be merged.
    */
  var destinationCommit: js.UndefOr[CommitId] = js.undefined
  
  /**
    * The branch of the repository where the pull request changes are merged. Also known as the destination branch. 
    */
  var destinationReference: js.UndefOr[ReferenceName] = js.undefined
  
  /**
    * The commit ID of the most recent commit that the source branch and the destination branch have in common.
    */
  var mergeBase: js.UndefOr[CommitId] = js.undefined
  
  /**
    * Returns metadata about the state of the merge, including whether the merge has been made.
    */
  var mergeMetadata: js.UndefOr[MergeMetadata] = js.undefined
  
  /**
    * The name of the repository that contains the pull request source and destination branches.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  
  /**
    * The full commit ID of the tip of the source branch used to create the pull request. If the pull request branch is updated by a push while the pull request is open, the commit ID changes to reflect the new tip of the branch.
    */
  var sourceCommit: js.UndefOr[CommitId] = js.undefined
  
  /**
    * The branch of the repository that contains the changes for the pull request. Also known as the source branch.
    */
  var sourceReference: js.UndefOr[ReferenceName] = js.undefined
}
object PullRequestTarget {
  
  inline def apply(): PullRequestTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestTarget]
  }
  
  extension [Self <: PullRequestTarget](x: Self) {
    
    inline def setDestinationCommit(value: CommitId): Self = StObject.set(x, "destinationCommit", value.asInstanceOf[js.Any])
    
    inline def setDestinationCommitUndefined: Self = StObject.set(x, "destinationCommit", js.undefined)
    
    inline def setDestinationReference(value: ReferenceName): Self = StObject.set(x, "destinationReference", value.asInstanceOf[js.Any])
    
    inline def setDestinationReferenceUndefined: Self = StObject.set(x, "destinationReference", js.undefined)
    
    inline def setMergeBase(value: CommitId): Self = StObject.set(x, "mergeBase", value.asInstanceOf[js.Any])
    
    inline def setMergeBaseUndefined: Self = StObject.set(x, "mergeBase", js.undefined)
    
    inline def setMergeMetadata(value: MergeMetadata): Self = StObject.set(x, "mergeMetadata", value.asInstanceOf[js.Any])
    
    inline def setMergeMetadataUndefined: Self = StObject.set(x, "mergeMetadata", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    
    inline def setSourceCommit(value: CommitId): Self = StObject.set(x, "sourceCommit", value.asInstanceOf[js.Any])
    
    inline def setSourceCommitUndefined: Self = StObject.set(x, "sourceCommit", js.undefined)
    
    inline def setSourceReference(value: ReferenceName): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
    
    inline def setSourceReferenceUndefined: Self = StObject.set(x, "sourceReference", js.undefined)
  }
}
