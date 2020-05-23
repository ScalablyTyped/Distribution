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
  def apply(NextToken: NextToken = null, Streams: JournalKinesisStreamDescriptionList = null): ListJournalKinesisStreamsForLedgerResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Streams != null) __obj.updateDynamic("Streams")(Streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJournalKinesisStreamsForLedgerResponse]
  }
}

