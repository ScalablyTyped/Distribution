package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typings.awsSdkClientCodecommitNode.typesLocationMod.UnmarshalledLocation
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPostCommentForPullRequestOutputMod {
  
  trait PostCommentForPullRequestOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>In the directionality of the pull request, the blob ID of the 'after' blob.</p>
      */
    var afterBlobId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The full commit ID of the commit in the destination branch where the pull request will be merged.</p>
      */
    var afterCommitId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>In the directionality of the pull request, the blob ID of the 'before' blob.</p>
      */
    var beforeBlobId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The full commit ID of the commit in the source branch used to create the pull request, or in the case of an updated pull request, the full commit ID of the commit used to update the pull request.</p>
      */
    var beforeCommitId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The content of the comment you posted.</p>
      */
    var comment: js.UndefOr[UnmarshalledComment] = js.undefined
    
    /**
      * <p>The location of the change where you posted your comment.</p>
      */
    var location: js.UndefOr[UnmarshalledLocation] = js.undefined
    
    /**
      * <p>The system-generated ID of the pull request. </p>
      */
    var pullRequestId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name of the repository where you posted a comment on a pull request.</p>
      */
    var repositoryName: js.UndefOr[String] = js.undefined
  }
  object PostCommentForPullRequestOutput {
    
    inline def apply($metadata: ResponseMetadata): PostCommentForPullRequestOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostCommentForPullRequestOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PostCommentForPullRequestOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setAfterBlobId(value: String): Self = StObject.set(x, "afterBlobId", value.asInstanceOf[js.Any])
      
      inline def setAfterBlobIdUndefined: Self = StObject.set(x, "afterBlobId", js.undefined)
      
      inline def setAfterCommitId(value: String): Self = StObject.set(x, "afterCommitId", value.asInstanceOf[js.Any])
      
      inline def setAfterCommitIdUndefined: Self = StObject.set(x, "afterCommitId", js.undefined)
      
      inline def setBeforeBlobId(value: String): Self = StObject.set(x, "beforeBlobId", value.asInstanceOf[js.Any])
      
      inline def setBeforeBlobIdUndefined: Self = StObject.set(x, "beforeBlobId", js.undefined)
      
      inline def setBeforeCommitId(value: String): Self = StObject.set(x, "beforeCommitId", value.asInstanceOf[js.Any])
      
      inline def setBeforeCommitIdUndefined: Self = StObject.set(x, "beforeCommitId", js.undefined)
      
      inline def setComment(value: UnmarshalledComment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setLocation(value: UnmarshalledLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setPullRequestId(value: String): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
      
      inline def setPullRequestIdUndefined: Self = StObject.set(x, "pullRequestId", js.undefined)
      
      inline def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    }
  }
}
