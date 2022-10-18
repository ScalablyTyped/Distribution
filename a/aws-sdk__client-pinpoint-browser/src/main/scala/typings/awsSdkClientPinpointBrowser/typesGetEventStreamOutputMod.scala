package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesEventStreamMod.UnmarshalledEventStream
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetEventStreamOutputMod {
  
  trait GetEventStreamOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Model for an event publishing subscription export.
      */
    var EventStream: UnmarshalledEventStream
  }
  object GetEventStreamOutput {
    
    inline def apply($metadata: ResponseMetadata, EventStream: UnmarshalledEventStream): GetEventStreamOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventStream = EventStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEventStreamOutput]
    }
    
    extension [Self <: GetEventStreamOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setEventStream(value: UnmarshalledEventStream): Self = StObject.set(x, "EventStream", value.asInstanceOf[js.Any])
    }
  }
}
