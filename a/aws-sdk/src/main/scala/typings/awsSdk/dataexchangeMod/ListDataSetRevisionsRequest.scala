package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataSetRevisionsRequest extends js.Object {
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: string = js.native
  /**
    * The maximum number of results returned by a single call.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.dataexchangeMod.MaxResults] = js.native
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListDataSetRevisionsRequest {
  @scala.inline
  def apply(DataSetId: string, MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: string = null): ListDataSetRevisionsRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataSetRevisionsRequest]
  }
}

