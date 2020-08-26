package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSimulationApplicationsResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListSimulationApplications request. When the results of a ListRobot request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * A list of simulation application summaries that meet the criteria of the request.
    */
  var simulationApplicationSummaries: js.UndefOr[SimulationApplicationSummaries] = js.native
}

object ListSimulationApplicationsResponse {
  @scala.inline
  def apply(): ListSimulationApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSimulationApplicationsResponse]
  }
  @scala.inline
  implicit class ListSimulationApplicationsResponseOps[Self <: ListSimulationApplicationsResponse] (val x: Self) extends AnyVal {
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
    def setSimulationApplicationSummariesVarargs(value: SimulationApplicationSummary*): Self = this.set("simulationApplicationSummaries", js.Array(value :_*))
    @scala.inline
    def setSimulationApplicationSummaries(value: SimulationApplicationSummaries): Self = this.set("simulationApplicationSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimulationApplicationSummaries: Self = this.set("simulationApplicationSummaries", js.undefined)
  }
  
}

