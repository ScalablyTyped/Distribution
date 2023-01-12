package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEventsBatchMod.EventsBatch
import typings.awsSdkClientPinpointBrowser.typesEventsBatchMod.UnmarshalledEventsBatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventsRequestMod {
  
  trait EventsRequest extends StObject {
    
    /**
      * A batch of events to process. Each BatchItem consists of an endpoint ID as the key, and an EventsBatch object as the value.
      */
    var BatchItem: js.UndefOr[StringDictionary[EventsBatch] | (js.Iterable[js.Tuple2[String, EventsBatch]])] = js.undefined
  }
  object EventsRequest {
    
    inline def apply(): EventsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventsRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventsRequest] (val x: Self) extends AnyVal {
      
      inline def setBatchItem(value: StringDictionary[EventsBatch] | (js.Iterable[js.Tuple2[String, EventsBatch]])): Self = StObject.set(x, "BatchItem", value.asInstanceOf[js.Any])
      
      inline def setBatchItemUndefined: Self = StObject.set(x, "BatchItem", js.undefined)
    }
  }
  
  trait UnmarshalledEventsRequest
    extends StObject
       with EventsRequest {
    
    /**
      * A batch of events to process. Each BatchItem consists of an endpoint ID as the key, and an EventsBatch object as the value.
      */
    @JSName("BatchItem")
    var BatchItem_UnmarshalledEventsRequest: js.UndefOr[StringDictionary[UnmarshalledEventsBatch]] = js.undefined
  }
  object UnmarshalledEventsRequest {
    
    inline def apply(): UnmarshalledEventsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEventsRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledEventsRequest] (val x: Self) extends AnyVal {
      
      inline def setBatchItem(value: StringDictionary[UnmarshalledEventsBatch]): Self = StObject.set(x, "BatchItem", value.asInstanceOf[js.Any])
      
      inline def setBatchItemUndefined: Self = StObject.set(x, "BatchItem", js.undefined)
    }
  }
}
