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
  def apply(): ListSimulationJobBatchesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSimulationJobBatchesResponse]
  }
  @scala.inline
  implicit class ListSimulationJobBatchesResponseOps[Self <: ListSimulationJobBatchesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setSimulationJobBatchSummariesVarargs(value: SimulationJobBatchSummary*): Self = this.set("simulationJobBatchSummaries", js.Array(value :_*))
    @scala.inline
    def setSimulationJobBatchSummaries(value: SimulationJobBatchSummaries): Self = this.set("simulationJobBatchSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimulationJobBatchSummaries: Self = this.set("simulationJobBatchSummaries", js.undefined)
  }
  
}

