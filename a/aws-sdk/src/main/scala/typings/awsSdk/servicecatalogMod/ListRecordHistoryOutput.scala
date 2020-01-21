package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRecordHistoryOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * The records, in reverse chronological order.
    */
  var RecordDetails: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordDetails] = js.native
}

object ListRecordHistoryOutput {
  @scala.inline
  def apply(NextPageToken: PageToken = null, RecordDetails: RecordDetails = null): ListRecordHistoryOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (RecordDetails != null) __obj.updateDynamic("RecordDetails")(RecordDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecordHistoryOutput]
  }
}

