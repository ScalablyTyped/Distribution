package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesItemResponseMod.ItemResponse
import typings.awsSdkClientPinpointBrowser.typesItemResponseMod.UnmarshalledItemResponse
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventsResponseMod {
  
  @js.native
  trait EventsResponse extends StObject {
    
    /**
      * A map that contains a multipart response for each endpoint. Each item in this object uses the endpoint ID as the key, and the item response as the value.
      *
      * If no item response exists, the value can also be one of the following: 202 (if the request was processed successfully) or 400 (if the payload was invalid, or required fields were missing).
      */
    var Results: js.UndefOr[StringDictionary[ItemResponse] | (Iterable[js.Tuple2[String, ItemResponse]])] = js.native
  }
  object EventsResponse {
    
    @scala.inline
    def apply(): EventsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventsResponse]
    }
    
    @scala.inline
    implicit class EventsResponseMutableBuilder[Self <: EventsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResults(value: StringDictionary[ItemResponse] | (Iterable[js.Tuple2[String, ItemResponse]])): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "Results", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledEventsResponse extends EventsResponse {
    
    /**
      * A map that contains a multipart response for each endpoint. Each item in this object uses the endpoint ID as the key, and the item response as the value.
      *
      * If no item response exists, the value can also be one of the following: 202 (if the request was processed successfully) or 400 (if the payload was invalid, or required fields were missing).
      */
    @JSName("Results")
    var Results_UnmarshalledEventsResponse: js.UndefOr[StringDictionary[UnmarshalledItemResponse]] = js.native
  }
  object UnmarshalledEventsResponse {
    
    @scala.inline
    def apply(): UnmarshalledEventsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEventsResponse]
    }
    
    @scala.inline
    implicit class UnmarshalledEventsResponseMutableBuilder[Self <: UnmarshalledEventsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResults(value: StringDictionary[UnmarshalledItemResponse]): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "Results", js.undefined)
    }
  }
}
