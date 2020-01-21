package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJournalS3ExportsResponse extends js.Object {
  /**
    * The array of journal export job descriptions for all ledgers that are associated with the current AWS account and Region.
    */
  var JournalS3Exports: js.UndefOr[JournalS3ExportList] = js.native
  /**
    *   If NextToken is empty, then the last page of results has been processed and there are no more results to be retrieved.   If NextToken is not empty, then there are more results available. To retrieve the next page of results, use the value of NextToken in a subsequent ListJournalS3Exports call.  
    */
  var NextToken: js.UndefOr[typings.awsSdk.qldbMod.NextToken] = js.native
}

object ListJournalS3ExportsResponse {
  @scala.inline
  def apply(JournalS3Exports: JournalS3ExportList = null, NextToken: NextToken = null): ListJournalS3ExportsResponse = {
    val __obj = js.Dynamic.literal()
    if (JournalS3Exports != null) __obj.updateDynamic("JournalS3Exports")(JournalS3Exports.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJournalS3ExportsResponse]
  }
}

