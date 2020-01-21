package typings.awsSdkClientPinpointBrowser.typesEventsRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEventsBatchMod.UnmarshalledEventsBatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledEventsRequest extends EventsRequest {
  /**
    * A batch of events to process. Each BatchItem consists of an endpoint ID as the key, and an EventsBatch object as the value.
    */
  @JSName("BatchItem")
  var BatchItem_UnmarshalledEventsRequest: js.UndefOr[StringDictionary[UnmarshalledEventsBatch]] = js.undefined
}

object UnmarshalledEventsRequest {
  @scala.inline
  def apply(BatchItem: StringDictionary[UnmarshalledEventsBatch] = null): UnmarshalledEventsRequest = {
    val __obj = js.Dynamic.literal()
    if (BatchItem != null) __obj.updateDynamic("BatchItem")(BatchItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledEventsRequest]
  }
}

