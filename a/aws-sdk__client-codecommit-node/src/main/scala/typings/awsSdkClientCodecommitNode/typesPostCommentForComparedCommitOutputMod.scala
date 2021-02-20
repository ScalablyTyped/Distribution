package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typings.awsSdkClientCodecommitNode.typesLocationMod.UnmarshalledLocation
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPostCommentForComparedCommitOutputMod {
  
  @js.native
  trait PostCommentForComparedCommitOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>In the directionality you established, the blob ID of the 'after' blob.</p>
      */
    var afterBlobId: js.UndefOr[String] = js.native
    
    /**
      * <p>In the directionality you established, the full commit ID of the 'after' commit.</p>
      */
    var afterCommitId: js.UndefOr[String] = js.native
    
    /**
      * <p>In the directionality you established, the blob ID of the 'before' blob.</p>
      */
    var beforeBlobId: js.UndefOr[String] = js.native
    
    /**
      * <p>In the directionality you established, the full commit ID of the 'before' commit.</p>
      */
    var beforeCommitId: js.UndefOr[String] = js.native
    
    /**
      * <p>The content of the comment you posted.</p>
      */
    var comment: js.UndefOr[UnmarshalledComment] = js.native
    
    /**
      * <p>The location of the comment in the comparison between the two commits.</p>
      */
    var location: js.UndefOr[UnmarshalledLocation] = js.native
    
    /**
      * <p>The name of the repository where you posted a comment on the comparison between commits.</p>
      */
    var repositoryName: js.UndefOr[String] = js.native
  }
  object PostCommentForComparedCommitOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): PostCommentForComparedCommitOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostCommentForComparedCommitOutput]
    }
    
    @scala.inline
    implicit class PostCommentForComparedCommitOutputMutableBuilder[Self <: PostCommentForComparedCommitOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterBlobId(value: String): Self = StObject.set(x, "afterBlobId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterBlobIdUndefined: Self = StObject.set(x, "afterBlobId", js.undefined)
      
      @scala.inline
      def setAfterCommitId(value: String): Self = StObject.set(x, "afterCommitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterCommitIdUndefined: Self = StObject.set(x, "afterCommitId", js.undefined)
      
      @scala.inline
      def setBeforeBlobId(value: String): Self = StObject.set(x, "beforeBlobId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeBlobIdUndefined: Self = StObject.set(x, "beforeBlobId", js.undefined)
      
      @scala.inline
      def setBeforeCommitId(value: String): Self = StObject.set(x, "beforeCommitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeCommitIdUndefined: Self = StObject.set(x, "beforeCommitId", js.undefined)
      
      @scala.inline
      def setComment(value: UnmarshalledComment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setLocation(value: UnmarshalledLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    }
  }
}
