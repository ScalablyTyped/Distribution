package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesServiceMod.UnmarshalledService
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetTraceGraphOutputMod {
  
  @js.native
  trait GetTraceGraphOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>Pagination token. Not used.</p>
      */
    var NextToken: js.UndefOr[String] = js.native
    
    /**
      * <p>The services that have processed one of the specified requests.</p>
      */
    var Services: js.UndefOr[js.Array[UnmarshalledService]] = js.native
  }
  object GetTraceGraphOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetTraceGraphOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTraceGraphOutput]
    }
    
    @scala.inline
    implicit class GetTraceGraphOutputMutableBuilder[Self <: GetTraceGraphOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setServices(value: js.Array[UnmarshalledService]): Self = StObject.set(x, "Services", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicesUndefined: Self = StObject.set(x, "Services", js.undefined)
      
      @scala.inline
      def setServicesVarargs(value: UnmarshalledService*): Self = StObject.set(x, "Services", js.Array(value :_*))
    }
  }
}
