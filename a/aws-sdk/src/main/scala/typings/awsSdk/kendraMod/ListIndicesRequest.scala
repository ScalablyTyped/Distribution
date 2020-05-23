package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIndicesRequest extends js.Object {
  /**
    * The maximum number of data sources to return.
    */
  var MaxResults: js.UndefOr[MaxResultsIntegerForListIndicesRequest] = js.native
  /**
    * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a pagination token in the response. You can use this pagination token to retrieve the next set of indexes (DataSourceSummaryItems). 
    */
  var NextToken: js.UndefOr[typings.awsSdk.kendraMod.NextToken] = js.native
}

object ListIndicesRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxResultsIntegerForListIndicesRequest] = js.undefined,
    NextToken: NextToken = null
  ): ListIndicesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIndicesRequest]
  }
}

