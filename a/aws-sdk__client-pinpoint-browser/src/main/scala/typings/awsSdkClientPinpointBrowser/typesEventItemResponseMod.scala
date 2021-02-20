package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventItemResponseMod {
  
  @js.native
  trait EventItemResponse extends StObject {
    
    /**
      * A custom message that is associated with the processing of an event.
      */
    var Message: js.UndefOr[String] = js.native
    
    /**
      * The status returned in the response as a result of processing the event.
      *
      * Possible values: 400 (for invalid events) and 202 (for events that were accepted).
      */
    var StatusCode: js.UndefOr[Double] = js.native
  }
  object EventItemResponse {
    
    @scala.inline
    def apply(): EventItemResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventItemResponse]
    }
    
    @scala.inline
    implicit class EventItemResponseMutableBuilder[Self <: EventItemResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
    }
  }
  
  type UnmarshalledEventItemResponse = EventItemResponse
}
