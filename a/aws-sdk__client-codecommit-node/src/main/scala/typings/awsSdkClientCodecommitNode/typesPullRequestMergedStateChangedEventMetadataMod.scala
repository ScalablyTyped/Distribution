package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesMergeMetadataMod.MergeMetadata
import typings.awsSdkClientCodecommitNode.typesMergeMetadataMod.UnmarshalledMergeMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPullRequestMergedStateChangedEventMetadataMod {
  
  trait PullRequestMergedStateChangedEventMetadata extends StObject {
    
    /**
      * <p>The name of the branch that the pull request will be merged into.</p>
      */
    var destinationReference: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Information about the merge state change event.</p>
      */
    var mergeMetadata: js.UndefOr[MergeMetadata] = js.undefined
    
    /**
      * <p>The name of the repository where the pull request was created.</p>
      */
    var repositoryName: js.UndefOr[String] = js.undefined
  }
  object PullRequestMergedStateChangedEventMetadata {
    
    inline def apply(): PullRequestMergedStateChangedEventMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PullRequestMergedStateChangedEventMetadata]
    }
    
    extension [Self <: PullRequestMergedStateChangedEventMetadata](x: Self) {
      
      inline def setDestinationReference(value: String): Self = StObject.set(x, "destinationReference", value.asInstanceOf[js.Any])
      
      inline def setDestinationReferenceUndefined: Self = StObject.set(x, "destinationReference", js.undefined)
      
      inline def setMergeMetadata(value: MergeMetadata): Self = StObject.set(x, "mergeMetadata", value.asInstanceOf[js.Any])
      
      inline def setMergeMetadataUndefined: Self = StObject.set(x, "mergeMetadata", js.undefined)
      
      inline def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    }
  }
  
  trait UnmarshalledPullRequestMergedStateChangedEventMetadata
    extends StObject
       with PullRequestMergedStateChangedEventMetadata {
    
    /**
      * <p>Information about the merge state change event.</p>
      */
    @JSName("mergeMetadata")
    var mergeMetadata_UnmarshalledPullRequestMergedStateChangedEventMetadata: js.UndefOr[UnmarshalledMergeMetadata] = js.undefined
  }
  object UnmarshalledPullRequestMergedStateChangedEventMetadata {
    
    inline def apply(): UnmarshalledPullRequestMergedStateChangedEventMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledPullRequestMergedStateChangedEventMetadata]
    }
    
    extension [Self <: UnmarshalledPullRequestMergedStateChangedEventMetadata](x: Self) {
      
      inline def setMergeMetadata(value: UnmarshalledMergeMetadata): Self = StObject.set(x, "mergeMetadata", value.asInstanceOf[js.Any])
      
      inline def setMergeMetadataUndefined: Self = StObject.set(x, "mergeMetadata", js.undefined)
    }
  }
}
