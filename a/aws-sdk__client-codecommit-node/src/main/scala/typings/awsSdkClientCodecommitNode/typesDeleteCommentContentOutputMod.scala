package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteCommentContentOutputMod {
  
  trait DeleteCommentContentOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Information about the comment you just deleted.</p>
      */
    var comment: js.UndefOr[UnmarshalledComment] = js.undefined
  }
  object DeleteCommentContentOutput {
    
    inline def apply($metadata: ResponseMetadata): DeleteCommentContentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteCommentContentOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteCommentContentOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setComment(value: UnmarshalledComment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    }
  }
}
