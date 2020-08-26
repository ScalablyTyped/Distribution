package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJournalKinesisStreamsForLedgerResponse extends js.Object {
  /**
    *   If NextToken is empty, the last page of results has been processed and there are no more results to be retrieved.   If NextToken is not empty, more results are available. To retrieve the next page of results, use the value of NextToken in a subsequent ListJournalKinesisStreamsForLedger call.  
    */
  var NextToken: js.UndefOr[typings.awsSdk.qldbMod.NextToken] = js.native
  /**
    * The array of QLDB journal stream descriptors that are associated with the given ledger.
    */
  var Streams: js.UndefOr[JournalKinesisStreamDescriptionList] = js.native
}

object ListJournalKinesisStreamsForLedgerResponse {
  @scala.inline
  def apply(): ListJournalKinesisStreamsForLedgerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJournalKinesisStreamsForLedgerResponse]
  }
  @scala.inline
  implicit class ListJournalKinesisStreamsForLedgerResponseOps[Self <: ListJournalKinesisStreamsForLedgerResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setStreamsVarargs(value: JournalKinesisStreamDescription*): Self = this.set("Streams", js.Array(value :_*))
    @scala.inline
    def setStreams(value: JournalKinesisStreamDescriptionList): Self = this.set("Streams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreams: Self = this.set("Streams", js.undefined)
  }
  
}

