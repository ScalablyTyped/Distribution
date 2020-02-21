package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSimulationJobBatchesRequest extends js.Object {
  /**
    * Optional filters to limit results.
    */
  var filters: js.UndefOr[Filters] = js.native
  /**
    * When this parameter is used, ListSimulationJobBatches only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListSimulationJobBatches request with the returned nextToken value. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The nextToken value returned from a previous paginated ListSimulationJobBatches request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListSimulationJobBatchesRequest {
  @scala.inline
  def apply(filters: Filters = null, maxResults: Int | Double = null, nextToken: PaginationToken = null): ListSimulationJobBatchesRequest = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSimulationJobBatchesRequest]
  }
}

