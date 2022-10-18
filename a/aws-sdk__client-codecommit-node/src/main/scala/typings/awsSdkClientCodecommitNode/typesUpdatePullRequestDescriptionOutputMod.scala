package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesPullRequestMod.UnmarshalledPullRequest
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdatePullRequestDescriptionOutputMod {
  
  trait UpdatePullRequestDescriptionOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Information about the updated pull request.</p>
      */
    var pullRequest: UnmarshalledPullRequest
  }
  object UpdatePullRequestDescriptionOutput {
    
    inline def apply($metadata: ResponseMetadata, pullRequest: UnmarshalledPullRequest): UpdatePullRequestDescriptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdatePullRequestDescriptionOutput]
    }
    
    extension [Self <: UpdatePullRequestDescriptionOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setPullRequest(value: UnmarshalledPullRequest): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
    }
  }
}
