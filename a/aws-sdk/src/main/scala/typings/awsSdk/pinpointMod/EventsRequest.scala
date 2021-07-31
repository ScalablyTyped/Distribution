package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventsRequest extends StObject {
  
  /**
    * The batch of events to process. For each item in a batch, the endpoint ID acts as a key that has an EventsBatch object as its value.
    */
  var BatchItem: MapOfEventsBatch
}
object EventsRequest {
  
  @scala.inline
  def apply(BatchItem: MapOfEventsBatch): EventsRequest = {
    val __obj = js.Dynamic.literal(BatchItem = BatchItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsRequest]
  }
  
  @scala.inline
  implicit class EventsRequestMutableBuilder[Self <: EventsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchItem(value: MapOfEventsBatch): Self = StObject.set(x, "BatchItem", value.asInstanceOf[js.Any])
  }
}
