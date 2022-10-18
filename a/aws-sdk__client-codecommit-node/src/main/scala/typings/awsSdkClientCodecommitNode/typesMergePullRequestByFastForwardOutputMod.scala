package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesPullRequestMod.UnmarshalledPullRequest
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMergePullRequestByFastForwardOutputMod {
  
  trait MergePullRequestByFastForwardOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Information about the specified pull request, including information about the merge.</p>
      */
    var pullRequest: js.UndefOr[UnmarshalledPullRequest] = js.undefined
  }
  object MergePullRequestByFastForwardOutput {
    
    inline def apply($metadata: ResponseMetadata): MergePullRequestByFastForwardOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergePullRequestByFastForwardOutput]
    }
    
    extension [Self <: MergePullRequestByFastForwardOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setPullRequest(value: UnmarshalledPullRequest): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
      
      inline def setPullRequestUndefined: Self = StObject.set(x, "pullRequest", js.undefined)
    }
  }
}
