package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPullRequestCreatedEventMetadataMod {
  
  @js.native
  trait PullRequestCreatedEventMetadata extends StObject {
    
    /**
      * <p>The commit ID of the tip of the branch specified as the destination branch when the pull request was created.</p>
      */
    var destinationCommitId: js.UndefOr[String] = js.native
    
    /**
      * <p>The commit ID of the most recent commit that the source branch and the destination branch have in common.</p>
      */
    var mergeBase: js.UndefOr[String] = js.native
    
    /**
      * <p>The name of the repository where the pull request was created.</p>
      */
    var repositoryName: js.UndefOr[String] = js.native
    
    /**
      * <p>The commit ID on the source branch used when the pull request was created.</p>
      */
    var sourceCommitId: js.UndefOr[String] = js.native
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
      def setDestinationCommitId(value: String): Self = StObject.set(x, "destinationCommitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationCommitIdUndefined: Self = StObject.set(x, "destinationCommitId", js.undefined)
      
      @scala.inline
      def setMergeBase(value: String): Self = StObject.set(x, "mergeBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeBaseUndefined: Self = StObject.set(x, "mergeBase", js.undefined)
      
      @scala.inline
      def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
      
      @scala.inline
      def setSourceCommitId(value: String): Self = StObject.set(x, "sourceCommitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCommitIdUndefined: Self = StObject.set(x, "sourceCommitId", js.undefined)
    }
  }
  
  type UnmarshalledPullRequestCreatedEventMetadata = PullRequestCreatedEventMetadata
}
