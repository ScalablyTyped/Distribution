package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesEventStreamMod.UnmarshalledEventStream
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteEventStreamOutputMod {
  
  @js.native
  trait DeleteEventStreamOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * Model for an event publishing subscription export.
      */
    var EventStream: UnmarshalledEventStream = js.native
  }
  object DeleteEventStreamOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, EventStream: UnmarshalledEventStream): DeleteEventStreamOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventStream = EventStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteEventStreamOutput]
    }
    
    @scala.inline
    implicit class DeleteEventStreamOutputMutableBuilder[Self <: DeleteEventStreamOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventStream(value: UnmarshalledEventStream): Self = StObject.set(x, "EventStream", value.asInstanceOf[js.Any])
    }
  }
}
