package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIndicesResponse extends js.Object {
  /**
    * An array of summary information for one or more indexes.
    */
  var IndexConfigurationSummaryItems: js.UndefOr[IndexConfigurationSummaryList] = js.native
  /**
    * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to retrieve the next set of indexes.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kendraMod.NextToken] = js.native
}

object ListIndicesResponse {
  @scala.inline
  def apply(IndexConfigurationSummaryItems: IndexConfigurationSummaryList = null, NextToken: NextToken = null): ListIndicesResponse = {
    val __obj = js.Dynamic.literal()
    if (IndexConfigurationSummaryItems != null) __obj.updateDynamic("IndexConfigurationSummaryItems")(IndexConfigurationSummaryItems.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIndicesResponse]
  }
}

