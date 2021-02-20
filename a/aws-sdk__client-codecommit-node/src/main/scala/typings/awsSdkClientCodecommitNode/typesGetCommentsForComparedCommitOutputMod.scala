package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesCommentsForComparedCommitMod.UnmarshalledCommentsForComparedCommit
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetCommentsForComparedCommitOutputMod {
  
  @js.native
  trait GetCommentsForComparedCommitOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>A list of comment objects on the compared commit.</p>
      */
    var commentsForComparedCommitData: js.UndefOr[js.Array[UnmarshalledCommentsForComparedCommit]] = js.native
    
    /**
      * <p>An enumeration token that can be used in a request to return the next batch of the results.</p>
      */
    var nextToken: js.UndefOr[String] = js.native
  }
  object GetCommentsForComparedCommitOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetCommentsForComparedCommitOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCommentsForComparedCommitOutput]
    }
    
    @scala.inline
    implicit class GetCommentsForComparedCommitOutputMutableBuilder[Self <: GetCommentsForComparedCommitOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsForComparedCommitData(value: js.Array[UnmarshalledCommentsForComparedCommit]): Self = StObject.set(x, "commentsForComparedCommitData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsForComparedCommitDataUndefined: Self = StObject.set(x, "commentsForComparedCommitData", js.undefined)
      
      @scala.inline
      def setCommentsForComparedCommitDataVarargs(value: UnmarshalledCommentsForComparedCommit*): Self = StObject.set(x, "commentsForComparedCommitData", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    }
  }
}
