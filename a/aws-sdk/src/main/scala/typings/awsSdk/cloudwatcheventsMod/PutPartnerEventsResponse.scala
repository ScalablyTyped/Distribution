package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPartnerEventsResponse extends js.Object {
  /**
    * The list of events from this operation that were successfully written to the partner event bus.
    */
  var Entries: js.UndefOr[PutPartnerEventsResultEntryList] = js.native
  /**
    * The number of events from this operation that could not be written to the partner event bus.
    */
  var FailedEntryCount: js.UndefOr[Integer] = js.native
}

object PutPartnerEventsResponse {
  @scala.inline
  def apply(
    Entries: PutPartnerEventsResultEntryList = null,
    FailedEntryCount: js.UndefOr[Integer] = js.undefined
  ): PutPartnerEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (Entries != null) __obj.updateDynamic("Entries")(Entries.asInstanceOf[js.Any])
    if (!js.isUndefined(FailedEntryCount)) __obj.updateDynamic("FailedEntryCount")(FailedEntryCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPartnerEventsResponse]
  }
}

