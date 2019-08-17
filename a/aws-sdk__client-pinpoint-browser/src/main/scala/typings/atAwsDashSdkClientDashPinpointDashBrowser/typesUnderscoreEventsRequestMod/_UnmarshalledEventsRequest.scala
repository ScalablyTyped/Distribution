package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEventsRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEventsBatchMod._UnmarshalledEventsBatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledEventsRequest extends _EventsRequest {
  /**
    * A batch of events to process. Each BatchItem consists of an endpoint ID as the key, and an EventsBatch object as the value.
    */
  @JSName("BatchItem")
  var BatchItem__UnmarshalledEventsRequest: js.UndefOr[StringDictionary[_UnmarshalledEventsBatch]] = js.undefined
}

object _UnmarshalledEventsRequest {
  @scala.inline
  def apply(BatchItem: StringDictionary[_UnmarshalledEventsBatch] = null): _UnmarshalledEventsRequest = {
    val __obj = js.Dynamic.literal()
    if (BatchItem != null) __obj.updateDynamic("BatchItem")(BatchItem)
    __obj.asInstanceOf[_UnmarshalledEventsRequest]
  }
}

