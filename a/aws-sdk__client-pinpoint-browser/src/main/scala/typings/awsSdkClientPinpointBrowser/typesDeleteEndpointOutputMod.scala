package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesEndpointResponseMod.UnmarshalledEndpointResponse
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteEndpointOutputMod {
  
  trait DeleteEndpointOutput
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
  object DeleteEndpointOutput {
    
    inline def apply($metadata: ResponseMetadata, EndpointResponse: UnmarshalledEndpointResponse): DeleteEndpointOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointResponse = EndpointResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteEndpointOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteEndpointOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setEndpointResponse(value: UnmarshalledEndpointResponse): Self = StObject.set(x, "EndpointResponse", value.asInstanceOf[js.Any])
    }
  }
}
