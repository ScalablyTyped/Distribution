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
  def apply(): PutEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEventsResponse]
  }
  @scala.inline
  implicit class PutEventsResponseOps[Self <: PutEventsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntriesVarargs(value: PutEventsResultEntry*): Self = this.set("Entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: PutEventsResultEntryList): Self = this.set("Entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("Entries", js.undefined)
    @scala.inline
    def setFailedEntryCount(value: Integer): Self = this.set("FailedEntryCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedEntryCount: Self = this.set("FailedEntryCount", js.undefined)
  }
  
}

