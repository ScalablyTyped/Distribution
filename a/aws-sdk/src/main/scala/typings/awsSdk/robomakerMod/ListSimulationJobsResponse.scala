package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSimulationJobsResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListSimulationJobs request. When the results of a ListRobot request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * A list of simulation job summaries that meet the criteria of the request.
    */
  var simulationJobSummaries: SimulationJobSummaries = js.native
}

object ListSimulationJobsResponse {
  @scala.inline
  def apply(simulationJobSummaries: SimulationJobSummaries): ListSimulationJobsResponse = {
    val __obj = js.Dynamic.literal(simulationJobSummaries = simulationJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSimulationJobsResponse]
  }
  @scala.inline
  implicit class ListSimulationJobsResponseOps[Self <: ListSimulationJobsResponse] (val x: Self) extends AnyVal {
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
    def setSimulationJobSummariesVarargs(value: SimulationJobSummary*): Self = this.set("simulationJobSummaries", js.Array(value :_*))
    @scala.inline
    def setSimulationJobSummaries(value: SimulationJobSummaries): Self = this.set("simulationJobSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

