package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEventsBatchMod.EventsBatch
import typings.awsSdkClientPinpointBrowser.typesEventsBatchMod.UnmarshalledEventsBatch
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventsRequestMod {
  
  @js.native
  trait EventsRequest extends StObject {
    
    /**
      * A batch of events to process. Each BatchItem consists of an endpoint ID as the key, and an EventsBatch object as the value.
      */
    var BatchItem: js.UndefOr[StringDictionary[EventsBatch] | (Iterable[js.Tuple2[String, EventsBatch]])] = js.native
  }
  object EventsRequest {
    
    @scala.inline
    def apply(): EventsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventsRequest]
    }
    
    @scala.inline
    implicit class EventsRequestMutableBuilder[Self <: EventsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchItem(value: StringDictionary[EventsBatch] | (Iterable[js.Tuple2[String, EventsBatch]])): Self = StObject.set(x, "BatchItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchItemUndefined: Self = StObject.set(x, "BatchItem", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledEventsRequest extends EventsRequest {
    
    /**
      * A batch of events to process. Each BatchItem consists of an endpoint ID as the key, and an EventsBatch object as the value.
      */
    @JSName("BatchItem")
    var BatchItem_UnmarshalledEventsRequest: js.UndefOr[StringDictionary[UnmarshalledEventsBatch]] = js.native
  }
  object UnmarshalledEventsRequest {
    
    @scala.inline
    def apply(): UnmarshalledEventsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEventsRequest]
    }
    
    @scala.inline
    implicit class UnmarshalledEventsRequestMutableBuilder[Self <: UnmarshalledEventsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchItem(value: StringDictionary[UnmarshalledEventsBatch]): Self = StObject.set(x, "BatchItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchItemUndefined: Self = StObject.set(x, "BatchItem", js.undefined)
    }
  }
}
