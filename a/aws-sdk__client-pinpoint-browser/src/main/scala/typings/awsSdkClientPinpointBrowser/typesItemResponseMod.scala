package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEndpointItemResponseMod.EndpointItemResponse
import typings.awsSdkClientPinpointBrowser.typesEndpointItemResponseMod.UnmarshalledEndpointItemResponse
import typings.awsSdkClientPinpointBrowser.typesEventItemResponseMod.EventItemResponse
import typings.awsSdkClientPinpointBrowser.typesEventItemResponseMod.UnmarshalledEventItemResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesItemResponseMod {
  
  trait ItemResponse extends StObject {
    
    /**
      * The response received after the endpoint was accepted.
      */
    var EndpointItemResponse: js.UndefOr[
        typings.awsSdkClientPinpointBrowser.typesEndpointItemResponseMod.EndpointItemResponse
      ] = js.undefined
    
    /**
      * A multipart response object that contains a key and value for each event ID in the request. In each object, the event ID is the key, and an EventItemResponse object is the value.
      */
    var EventsItemResponse: js.UndefOr[
        StringDictionary[EventItemResponse] | (js.Iterable[js.Tuple2[String, EventItemResponse]])
      ] = js.undefined
  }
  object ItemResponse {
    
    inline def apply(): ItemResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemResponse]
    }
    
    extension [Self <: ItemResponse](x: Self) {
      
      inline def setEndpointItemResponse(value: EndpointItemResponse): Self = StObject.set(x, "EndpointItemResponse", value.asInstanceOf[js.Any])
      
      inline def setEndpointItemResponseUndefined: Self = StObject.set(x, "EndpointItemResponse", js.undefined)
      
      inline def setEventsItemResponse(value: StringDictionary[EventItemResponse] | (js.Iterable[js.Tuple2[String, EventItemResponse]])): Self = StObject.set(x, "EventsItemResponse", value.asInstanceOf[js.Any])
      
      inline def setEventsItemResponseUndefined: Self = StObject.set(x, "EventsItemResponse", js.undefined)
    }
  }
  
  trait UnmarshalledItemResponse
    extends StObject
       with ItemResponse {
    
    /**
      * The response received after the endpoint was accepted.
      */
    @JSName("EndpointItemResponse")
    var EndpointItemResponse_UnmarshalledItemResponse: js.UndefOr[UnmarshalledEndpointItemResponse] = js.undefined
    
    /**
      * A multipart response object that contains a key and value for each event ID in the request. In each object, the event ID is the key, and an EventItemResponse object is the value.
      */
    @JSName("EventsItemResponse")
    var EventsItemResponse_UnmarshalledItemResponse: js.UndefOr[StringDictionary[UnmarshalledEventItemResponse]] = js.undefined
  }
  object UnmarshalledItemResponse {
    
    inline def apply(): UnmarshalledItemResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledItemResponse]
    }
    
    extension [Self <: UnmarshalledItemResponse](x: Self) {
      
      inline def setEndpointItemResponse(value: UnmarshalledEndpointItemResponse): Self = StObject.set(x, "EndpointItemResponse", value.asInstanceOf[js.Any])
      
      inline def setEndpointItemResponseUndefined: Self = StObject.set(x, "EndpointItemResponse", js.undefined)
      
      inline def setEventsItemResponse(value: StringDictionary[UnmarshalledEventItemResponse]): Self = StObject.set(x, "EventsItemResponse", value.asInstanceOf[js.Any])
      
      inline def setEventsItemResponseUndefined: Self = StObject.set(x, "EventsItemResponse", js.undefined)
    }
  }
}
