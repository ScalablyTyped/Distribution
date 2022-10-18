package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesEventsResponseMod.UnmarshalledEventsResponse
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutEventsOutputMod {
  
  trait PutEventsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Custom messages associated with events.
      */
    var EventsResponse: UnmarshalledEventsResponse
  }
  object PutEventsOutput {
    
    inline def apply($metadata: ResponseMetadata, EventsResponse: UnmarshalledEventsResponse): PutEventsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventsResponse = EventsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutEventsOutput]
    }
    
    extension [Self <: PutEventsOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setEventsResponse(value: UnmarshalledEventsResponse): Self = StObject.set(x, "EventsResponse", value.asInstanceOf[js.Any])
    }
  }
}
