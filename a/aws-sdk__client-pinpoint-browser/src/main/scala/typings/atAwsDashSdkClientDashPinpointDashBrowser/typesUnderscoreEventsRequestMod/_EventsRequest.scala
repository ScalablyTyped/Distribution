package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEventsRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEventsBatchMod._EventsBatch
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _EventsRequest extends js.Object {
  /**
    * A batch of events to process. Each BatchItem consists of an endpoint ID as the key, and an EventsBatch object as the value.
    */
  var BatchItem: js.UndefOr[StringDictionary[_EventsBatch] | (Iterable[js.Tuple2[String, _EventsBatch]])] = js.undefined
}

object _EventsRequest {
  @scala.inline
  def apply(BatchItem: StringDictionary[_EventsBatch] | (Iterable[js.Tuple2[String, _EventsBatch]]) = null): _EventsRequest = {
    val __obj = js.Dynamic.literal()
    if (BatchItem != null) __obj.updateDynamic("BatchItem")(BatchItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EventsRequest]
  }
}

