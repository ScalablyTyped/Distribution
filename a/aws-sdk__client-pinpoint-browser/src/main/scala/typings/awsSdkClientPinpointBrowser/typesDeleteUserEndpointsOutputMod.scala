package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesEndpointsResponseMod.UnmarshalledEndpointsResponse
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteUserEndpointsOutputMod {
  
  trait DeleteUserEndpointsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * List of endpoints
      */
    var EndpointsResponse: UnmarshalledEndpointsResponse
  }
  object DeleteUserEndpointsOutput {
    
    inline def apply($metadata: ResponseMetadata, EndpointsResponse: UnmarshalledEndpointsResponse): DeleteUserEndpointsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointsResponse = EndpointsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteUserEndpointsOutput]
    }
    
    extension [Self <: DeleteUserEndpointsOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setEndpointsResponse(value: UnmarshalledEndpointsResponse): Self = StObject.set(x, "EndpointsResponse", value.asInstanceOf[js.Any])
    }
  }
}
