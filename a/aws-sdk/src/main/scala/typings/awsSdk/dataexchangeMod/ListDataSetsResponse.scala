package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataSetsResponse extends js.Object {
  /**
    * The data set objects listed by the request.
    */
  var DataSets: js.UndefOr[ListOfDataSetEntry] = js.native
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.dataexchangeMod.NextToken] = js.native
}

object ListDataSetsResponse {
  @scala.inline
  def apply(DataSets: ListOfDataSetEntry = null, NextToken: NextToken = null): ListDataSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (DataSets != null) __obj.updateDynamic("DataSets")(DataSets.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataSetsResponse]
  }
}

