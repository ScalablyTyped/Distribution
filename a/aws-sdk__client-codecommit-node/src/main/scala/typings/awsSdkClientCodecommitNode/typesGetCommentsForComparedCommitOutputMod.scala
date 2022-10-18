package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesCommentsForComparedCommitMod.UnmarshalledCommentsForComparedCommit
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetCommentsForComparedCommitOutputMod {
  
  trait GetCommentsForComparedCommitOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>A list of comment objects on the compared commit.</p>
      */
    var commentsForComparedCommitData: js.UndefOr[js.Array[UnmarshalledCommentsForComparedCommit]] = js.undefined
    
    /**
      * <p>An enumeration token that can be used in a request to return the next batch of the results.</p>
      */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  object GetCommentsForComparedCommitOutput {
    
    inline def apply($metadata: ResponseMetadata): GetCommentsForComparedCommitOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCommentsForComparedCommitOutput]
    }
    
    extension [Self <: GetCommentsForComparedCommitOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setCommentsForComparedCommitData(value: js.Array[UnmarshalledCommentsForComparedCommit]): Self = StObject.set(x, "commentsForComparedCommitData", value.asInstanceOf[js.Any])
      
      inline def setCommentsForComparedCommitDataUndefined: Self = StObject.set(x, "commentsForComparedCommitData", js.undefined)
      
      inline def setCommentsForComparedCommitDataVarargs(value: UnmarshalledCommentsForComparedCommit*): Self = StObject.set(x, "commentsForComparedCommitData", js.Array(value*))
      
      inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    }
  }
}
