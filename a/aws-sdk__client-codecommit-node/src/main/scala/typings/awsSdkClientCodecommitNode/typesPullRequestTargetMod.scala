package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesMergeMetadataMod.MergeMetadata
import typings.awsSdkClientCodecommitNode.typesMergeMetadataMod.UnmarshalledMergeMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPullRequestTargetMod {
  
  trait PullRequestTarget extends StObject {
    
    /**
      * <p>The full commit ID that is the tip of the destination branch. This is the commit where the pull request was or will be merged.</p>
      */
    var destinationCommit: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The branch of the repository where the pull request changes will be merged into. Also known as the destination branch. </p>
      */
    var destinationReference: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The commit ID of the most recent commit that the source branch and the destination branch have in common.</p>
      */
    var mergeBase: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Returns metadata about the state of the merge, including whether the merge has been made.</p>
      */
    var mergeMetadata: js.UndefOr[MergeMetadata] = js.undefined
    
    /**
      * <p>The name of the repository that contains the pull request source and destination branches.</p>
      */
    var repositoryName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The full commit ID of the tip of the source branch used to create the pull request. If the pull request branch is updated by a push while the pull request is open, the commit ID will change to reflect the new tip of the branch.</p>
      */
    var sourceCommit: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The branch of the repository that contains the changes for the pull request. Also known as the source branch.</p>
      */
    var sourceReference: js.UndefOr[String] = js.undefined
  }
  object PullRequestTarget {
    
    @scala.inline
    def apply(): PullRequestTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PullRequestTarget]
    }
    
    @scala.inline
    implicit class PullRequestTargetMutableBuilder[Self <: PullRequestTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationCommit(value: String): Self = StObject.set(x, "destinationCommit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationCommitUndefined: Self = StObject.set(x, "destinationCommit", js.undefined)
      
      @scala.inline
      def setDestinationReference(value: String): Self = StObject.set(x, "destinationReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationReferenceUndefined: Self = StObject.set(x, "destinationReference", js.undefined)
      
      @scala.inline
      def setMergeBase(value: String): Self = StObject.set(x, "mergeBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeBaseUndefined: Self = StObject.set(x, "mergeBase", js.undefined)
      
      @scala.inline
      def setMergeMetadata(value: MergeMetadata): Self = StObject.set(x, "mergeMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeMetadataUndefined: Self = StObject.set(x, "mergeMetadata", js.undefined)
      
      @scala.inline
      def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
      
      @scala.inline
      def setSourceCommit(value: String): Self = StObject.set(x, "sourceCommit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCommitUndefined: Self = StObject.set(x, "sourceCommit", js.undefined)
      
      @scala.inline
      def setSourceReference(value: String): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceReferenceUndefined: Self = StObject.set(x, "sourceReference", js.undefined)
    }
  }
  
  trait UnmarshalledPullRequestTarget
    extends StObject
       with PullRequestTarget {
    
    /**
      * <p>Returns metadata about the state of the merge, including whether the merge has been made.</p>
      */
    @JSName("mergeMetadata")
    var mergeMetadata_UnmarshalledPullRequestTarget: js.UndefOr[UnmarshalledMergeMetadata] = js.undefined
  }
  object UnmarshalledPullRequestTarget {
    
    @scala.inline
    def apply(): UnmarshalledPullRequestTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledPullRequestTarget]
    }
    
    @scala.inline
    implicit class UnmarshalledPullRequestTargetMutableBuilder[Self <: UnmarshalledPullRequestTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMergeMetadata(value: UnmarshalledMergeMetadata): Self = StObject.set(x, "mergeMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeMetadataUndefined: Self = StObject.set(x, "mergeMetadata", js.undefined)
    }
  }
}
