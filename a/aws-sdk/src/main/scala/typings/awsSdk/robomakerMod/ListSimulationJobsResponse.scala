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
  def apply(simulationJobSummaries: SimulationJobSummaries, nextToken: PaginationToken = null): ListSimulationJobsResponse = {
    val __obj = js.Dynamic.literal(simulationJobSummaries = simulationJobSummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSimulationJobsResponse]
  }
}

