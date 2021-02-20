package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEventMod.Event
import typings.awsSdkClientPinpointBrowser.typesEventMod.UnmarshalledEvent
import typings.awsSdkClientPinpointBrowser.typesPublicEndpointMod.PublicEndpoint
import typings.awsSdkClientPinpointBrowser.typesPublicEndpointMod.UnmarshalledPublicEndpoint
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventsBatchMod {
  
  @js.native
  trait EventsBatch extends StObject {
    
    /**
      * The PublicEndpoint attached to the EndpointId from the request.
      */
    var Endpoint: js.UndefOr[PublicEndpoint] = js.native
    
    /**
      * An object that contains a set of events associated with the endpoint.
      */
    var Events: js.UndefOr[StringDictionary[Event] | (Iterable[js.Tuple2[String, Event]])] = js.native
  }
  object EventsBatch {
    
    @scala.inline
    def apply(): EventsBatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventsBatch]
    }
    
    @scala.inline
    implicit class EventsBatchMutableBuilder[Self <: EventsBatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpoint(value: PublicEndpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
      
      @scala.inline
      def setEvents(value: StringDictionary[Event] | (Iterable[js.Tuple2[String, Event]])): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledEventsBatch extends EventsBatch {
    
    /**
      * The PublicEndpoint attached to the EndpointId from the request.
      */
    @JSName("Endpoint")
    var Endpoint_UnmarshalledEventsBatch: js.UndefOr[UnmarshalledPublicEndpoint] = js.native
    
    /**
      * An object that contains a set of events associated with the endpoint.
      */
    @JSName("Events")
    var Events_UnmarshalledEventsBatch: js.UndefOr[StringDictionary[UnmarshalledEvent]] = js.native
  }
  object UnmarshalledEventsBatch {
    
    @scala.inline
    def apply(): UnmarshalledEventsBatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEventsBatch]
    }
    
    @scala.inline
    implicit class UnmarshalledEventsBatchMutableBuilder[Self <: UnmarshalledEventsBatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpoint(value: UnmarshalledPublicEndpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
      
      @scala.inline
      def setEvents(value: StringDictionary[UnmarshalledEvent]): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    }
  }
}
