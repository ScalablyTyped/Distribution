package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSimulationJobBatchesResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListSimulationJobBatches request. When the results of a ListSimulationJobBatches request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * A list of simulation job batch summaries.
    */
  var simulationJobBatchSummaries: js.UndefOr[SimulationJobBatchSummaries] = js.native
}

object ListSimulationJobBatchesResponse {
  @scala.inline
  def apply(nextToken: PaginationToken = null, simulationJobBatchSummaries: SimulationJobBatchSummaries = null): ListSimulationJobBatchesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (simulationJobBatchSummaries != null) __obj.updateDynamic("simulationJobBatchSummaries")(simulationJobBatchSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSimulationJobBatchesResponse]
  }
}

