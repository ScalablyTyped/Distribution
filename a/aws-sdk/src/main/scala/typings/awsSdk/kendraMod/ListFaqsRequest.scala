package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFaqsRequest extends js.Object {
  /**
    * The index that contains the FAQ lists.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId = js.native
  /**
    * The maximum number of FAQs to return in the response. If there are fewer results in the list, this response contains only the actual results.
    */
  var MaxResults: js.UndefOr[MaxResultsIntegerForListFaqsRequest] = js.native
  /**
    * If the result of the previous request to ListFaqs was truncated, include the NextToken to fetch the next set of FAQs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kendraMod.NextToken] = js.native
}

object ListFaqsRequest {
  @scala.inline
  def apply(IndexId: IndexId, MaxResults: Int | Double = null, NextToken: NextToken = null): ListFaqsRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFaqsRequest]
  }
}

