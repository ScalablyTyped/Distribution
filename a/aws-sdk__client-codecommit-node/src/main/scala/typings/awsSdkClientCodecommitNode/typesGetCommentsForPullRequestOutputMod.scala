package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesCommentsForPullRequestMod.UnmarshalledCommentsForPullRequest
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetCommentsForPullRequestOutputMod {
  
  trait GetCommentsForPullRequestOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>An array of comment objects on the pull request.</p>
      */
    var commentsForPullRequestData: js.UndefOr[js.Array[UnmarshalledCommentsForPullRequest]] = js.undefined
    
    /**
      * <p>An enumeration token that can be used in a request to return the next batch of the results.</p>
      */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  object GetCommentsForPullRequestOutput {
    
    inline def apply($metadata: ResponseMetadata): GetCommentsForPullRequestOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCommentsForPullRequestOutput]
    }
    
    extension [Self <: GetCommentsForPullRequestOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setCommentsForPullRequestData(value: js.Array[UnmarshalledCommentsForPullRequest]): Self = StObject.set(x, "commentsForPullRequestData", value.asInstanceOf[js.Any])
      
      inline def setCommentsForPullRequestDataUndefined: Self = StObject.set(x, "commentsForPullRequestData", js.undefined)
      
      inline def setCommentsForPullRequestDataVarargs(value: UnmarshalledCommentsForPullRequest*): Self = StObject.set(x, "commentsForPullRequestData", js.Array(value :_*))
      
      inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    }
  }
}
