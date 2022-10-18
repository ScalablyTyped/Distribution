package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesEventStreamMod.UnmarshalledEventStream
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteEventStreamOutputMod {
  
  trait DeleteEventStreamOutput
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
  object DeleteEventStreamOutput {
    
    inline def apply($metadata: ResponseMetadata, EventStream: UnmarshalledEventStream): DeleteEventStreamOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventStream = EventStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteEventStreamOutput]
    }
    
    extension [Self <: DeleteEventStreamOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setEventStream(value: UnmarshalledEventStream): Self = StObject.set(x, "EventStream", value.asInstanceOf[js.Any])
    }
  }
}
