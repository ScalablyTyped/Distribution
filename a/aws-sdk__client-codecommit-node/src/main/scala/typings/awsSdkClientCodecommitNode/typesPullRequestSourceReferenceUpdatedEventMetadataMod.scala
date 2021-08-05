package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPullRequestSourceReferenceUpdatedEventMetadataMod {
  
  trait PullRequestSourceReferenceUpdatedEventMetadata extends StObject {
    
    /**
      * <p>The full commit ID of the commit in the source branch that was the tip of the branch at the time the pull request was updated.</p>
      */
    var afterCommitId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull request was updated.</p>
      */
    var beforeCommitId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The commit ID of the most recent commit that the source branch and the destination branch have in common.</p>
      */
    var mergeBase: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name of the repository where the pull request was updated.</p>
      */
    var repositoryName: js.UndefOr[String] = js.undefined
  }
  object PullRequestSourceReferenceUpdatedEventMetadata {
    
    inline def apply(): PullRequestSourceReferenceUpdatedEventMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PullRequestSourceReferenceUpdatedEventMetadata]
    }
    
    extension [Self <: PullRequestSourceReferenceUpdatedEventMetadata](x: Self) {
      
      inline def setAfterCommitId(value: String): Self = StObject.set(x, "afterCommitId", value.asInstanceOf[js.Any])
      
      inline def setAfterCommitIdUndefined: Self = StObject.set(x, "afterCommitId", js.undefined)
      
      inline def setBeforeCommitId(value: String): Self = StObject.set(x, "beforeCommitId", value.asInstanceOf[js.Any])
      
      inline def setBeforeCommitIdUndefined: Self = StObject.set(x, "beforeCommitId", js.undefined)
      
      inline def setMergeBase(value: String): Self = StObject.set(x, "mergeBase", value.asInstanceOf[js.Any])
      
      inline def setMergeBaseUndefined: Self = StObject.set(x, "mergeBase", js.undefined)
      
      inline def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    }
  }
  
  type UnmarshalledPullRequestSourceReferenceUpdatedEventMetadata = PullRequestSourceReferenceUpdatedEventMetadata
}
