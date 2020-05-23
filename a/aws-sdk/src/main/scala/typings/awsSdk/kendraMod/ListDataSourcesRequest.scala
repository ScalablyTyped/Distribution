package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataSourcesRequest extends js.Object {
  /**
    * The identifier of the index that contains the data source.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId = js.native
  /**
    * The maximum number of data sources to return.
    */
  var MaxResults: js.UndefOr[MaxResultsIntegerForListDataSourcesRequest] = js.native
  /**
    * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a pagination token in the response. You can use this pagination token to retrieve the next set of data sources (DataSourceSummaryItems). 
    */
  var NextToken: js.UndefOr[typings.awsSdk.kendraMod.NextToken] = js.native
}

object ListDataSourcesRequest {
  @scala.inline
  def apply(
    IndexId: IndexId,
    MaxResults: js.UndefOr[MaxResultsIntegerForListDataSourcesRequest] = js.undefined,
    NextToken: NextToken = null
  ): ListDataSourcesRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataSourcesRequest]
  }
}

