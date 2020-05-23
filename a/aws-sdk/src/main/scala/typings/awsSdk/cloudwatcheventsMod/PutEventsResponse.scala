package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEventsResponse extends js.Object {
  /**
    * The successfully and unsuccessfully ingested events results. If the ingestion was successful, the entry has the event ID in it. Otherwise, you can use the error code and error message to identify the problem with the entry.
    */
  var Entries: js.UndefOr[PutEventsResultEntryList] = js.native
  /**
    * The number of failed entries.
    */
  var FailedEntryCount: js.UndefOr[Integer] = js.native
}

object PutEventsResponse {
  @scala.inline
  def apply(Entries: PutEventsResultEntryList = null, FailedEntryCount: js.UndefOr[Integer] = js.undefined): PutEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (Entries != null) __obj.updateDynamic("Entries")(Entries.asInstanceOf[js.Any])
    if (!js.isUndefined(FailedEntryCount)) __obj.updateDynamic("FailedEntryCount")(FailedEntryCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventsResponse]
  }
}

