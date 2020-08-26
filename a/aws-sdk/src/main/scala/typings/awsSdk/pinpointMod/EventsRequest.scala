package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsRequest extends js.Object {
  /**
    * The batch of events to process. For each item in a batch, the endpoint ID acts as a key that has an EventsBatch object as its value.
    */
  var BatchItem: MapOfEventsBatch = js.native
}

object EventsRequest {
  @scala.inline
  def apply(BatchItem: MapOfEventsBatch): EventsRequest = {
    val __obj = js.Dynamic.literal(BatchItem = BatchItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsRequest]
  }
  @scala.inline
  implicit class EventsRequestOps[Self <: EventsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBatchItem(value: MapOfEventsBatch): Self = this.set("BatchItem", value.asInstanceOf[js.Any])
  }
  
}

