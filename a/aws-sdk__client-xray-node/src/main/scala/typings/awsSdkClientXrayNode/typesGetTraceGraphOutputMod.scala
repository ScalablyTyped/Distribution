package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesServiceMod.UnmarshalledService
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetTraceGraphOutputMod {
  
  trait GetTraceGraphOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Pagination token. Not used.</p>
      */
    var NextToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The services that have processed one of the specified requests.</p>
      */
    var Services: js.UndefOr[js.Array[UnmarshalledService]] = js.undefined
  }
  object GetTraceGraphOutput {
    
    inline def apply($metadata: ResponseMetadata): GetTraceGraphOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTraceGraphOutput]
    }
    
    extension [Self <: GetTraceGraphOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setServices(value: js.Array[UnmarshalledService]): Self = StObject.set(x, "Services", value.asInstanceOf[js.Any])
      
      inline def setServicesUndefined: Self = StObject.set(x, "Services", js.undefined)
      
      inline def setServicesVarargs(value: UnmarshalledService*): Self = StObject.set(x, "Services", js.Array(value*))
    }
  }
}
