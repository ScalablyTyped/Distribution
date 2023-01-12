package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEventMod.Event
import typings.awsSdkClientPinpointBrowser.typesEventMod.UnmarshalledEvent
import typings.awsSdkClientPinpointBrowser.typesPublicEndpointMod.PublicEndpoint
import typings.awsSdkClientPinpointBrowser.typesPublicEndpointMod.UnmarshalledPublicEndpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventsBatchMod {
  
  trait EventsBatch extends StObject {
    
    /**
      * The PublicEndpoint attached to the EndpointId from the request.
      */
    var Endpoint: js.UndefOr[PublicEndpoint] = js.undefined
    
    /**
      * An object that contains a set of events associated with the endpoint.
      */
    var Events: js.UndefOr[StringDictionary[Event] | (js.Iterable[js.Tuple2[String, Event]])] = js.undefined
  }
  object EventsBatch {
    
    inline def apply(): EventsBatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventsBatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventsBatch] (val x: Self) extends AnyVal {
      
      inline def setEndpoint(value: PublicEndpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
      
      inline def setEvents(value: StringDictionary[Event] | (js.Iterable[js.Tuple2[String, Event]])): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    }
  }
  
  trait UnmarshalledEventsBatch
    extends StObject
       with EventsBatch {
    
    /**
      * The PublicEndpoint attached to the EndpointId from the request.
      */
    @JSName("Endpoint")
    var Endpoint_UnmarshalledEventsBatch: js.UndefOr[UnmarshalledPublicEndpoint] = js.undefined
    
    /**
      * An object that contains a set of events associated with the endpoint.
      */
    @JSName("Events")
    var Events_UnmarshalledEventsBatch: js.UndefOr[StringDictionary[UnmarshalledEvent]] = js.undefined
  }
  object UnmarshalledEventsBatch {
    
    inline def apply(): UnmarshalledEventsBatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEventsBatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledEventsBatch] (val x: Self) extends AnyVal {
      
      inline def setEndpoint(value: UnmarshalledPublicEndpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
      
      inline def setEvents(value: StringDictionary[UnmarshalledEvent]): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    }
  }
}
