package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventItemResponseMod {
  
  trait EventItemResponse extends StObject {
    
    /**
      * A custom message that is associated with the processing of an event.
      */
    var Message: js.UndefOr[String] = js.undefined
    
    /**
      * The status returned in the response as a result of processing the event.
      *
      * Possible values: 400 (for invalid events) and 202 (for events that were accepted).
      */
    var StatusCode: js.UndefOr[Double] = js.undefined
  }
  object EventItemResponse {
    
    inline def apply(): EventItemResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventItemResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventItemResponse] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
    }
  }
  
  type UnmarshalledEventItemResponse = EventItemResponse
}
