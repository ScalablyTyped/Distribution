package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesEndpointResponseMod.UnmarshalledEndpointResponse
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetEndpointOutputMod {
  
  trait GetEndpointOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Endpoint response
      */
    var EndpointResponse: UnmarshalledEndpointResponse
  }
  object GetEndpointOutput {
    
    inline def apply($metadata: ResponseMetadata, EndpointResponse: UnmarshalledEndpointResponse): GetEndpointOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointResponse = EndpointResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEndpointOutput]
    }
    
    extension [Self <: GetEndpointOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setEndpointResponse(value: UnmarshalledEndpointResponse): Self = StObject.set(x, "EndpointResponse", value.asInstanceOf[js.Any])
    }
  }
}
