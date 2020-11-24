package typings.awsSdkClientPinpointBrowser.typesEventsRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEventsBatchMod.EventsBatch
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsRequest extends js.Object {
  
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
    def setBatchItem(value: StringDictionary[EventsBatch] | (Iterable[js.Tuple2[String, EventsBatch]])): Self = this.set("BatchItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchItem: Self = this.set("BatchItem", js.undefined)
  }
}
