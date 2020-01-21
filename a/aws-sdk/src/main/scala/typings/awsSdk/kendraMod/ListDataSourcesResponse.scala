package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataSourcesResponse extends js.Object {
  /**
    * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to retrieve the next set of data sources. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.kendraMod.NextToken] = js.native
  /**
    * An array of summary information for one or more data sources.
    */
  var SummaryItems: js.UndefOr[DataSourceSummaryList] = js.native
}

object ListDataSourcesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, SummaryItems: DataSourceSummaryList = null): ListDataSourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SummaryItems != null) __obj.updateDynamic("SummaryItems")(SummaryItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataSourcesResponse]
  }
}

