package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesMergeMetadataMod.MergeMetadata
import typings.awsSdkClientCodecommitNode.typesMergeMetadataMod.UnmarshalledMergeMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPullRequestMergedStateChangedEventMetadataMod {
  
  @js.native
  trait PullRequestMergedStateChangedEventMetadata extends StObject {
    
    /**
      * <p>The name of the branch that the pull request will be merged into.</p>
      */
    var destinationReference: js.UndefOr[String] = js.native
    
    /**
      * <p>Information about the merge state change event.</p>
      */
    var mergeMetadata: js.UndefOr[MergeMetadata] = js.native
    
    /**
      * <p>The name of the repository where the pull request was created.</p>
      */
    var repositoryName: js.UndefOr[String] = js.native
  }
  object PullRequestMergedStateChangedEventMetadata {
    
    @scala.inline
    def apply(): PullRequestMergedStateChangedEventMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PullRequestMergedStateChangedEventMetadata]
    }
    
    @scala.inline
    implicit class PullRequestMergedStateChangedEventMetadataMutableBuilder[Self <: PullRequestMergedStateChangedEventMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationReference(value: String): Self = StObject.set(x, "destinationReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationReferenceUndefined: Self = StObject.set(x, "destinationReference", js.undefined)
      
      @scala.inline
      def setMergeMetadata(value: MergeMetadata): Self = StObject.set(x, "mergeMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeMetadataUndefined: Self = StObject.set(x, "mergeMetadata", js.undefined)
      
      @scala.inline
      def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledPullRequestMergedStateChangedEventMetadata extends PullRequestMergedStateChangedEventMetadata {
    
    /**
      * <p>Information about the merge state change event.</p>
      */
    @JSName("mergeMetadata")
    var mergeMetadata_UnmarshalledPullRequestMergedStateChangedEventMetadata: js.UndefOr[UnmarshalledMergeMetadata] = js.native
  }
  object UnmarshalledPullRequestMergedStateChangedEventMetadata {
    
    @scala.inline
    def apply(): UnmarshalledPullRequestMergedStateChangedEventMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledPullRequestMergedStateChangedEventMetadata]
    }
    
    @scala.inline
    implicit class UnmarshalledPullRequestMergedStateChangedEventMetadataMutableBuilder[Self <: UnmarshalledPullRequestMergedStateChangedEventMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMergeMetadata(value: UnmarshalledMergeMetadata): Self = StObject.set(x, "mergeMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeMetadataUndefined: Self = StObject.set(x, "mergeMetadata", js.undefined)
    }
  }
}
