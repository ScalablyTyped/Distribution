package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFleetsResponse extends js.Object {
  /**
    * A list of fleet details meeting the request criteria.
    */
  var fleetDetails: js.UndefOr[Fleets] = js.native
  /**
    * The nextToken value to include in a future ListDeploymentJobs request. When the results of a ListFleets request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListFleetsResponse {
  @scala.inline
  def apply(): ListFleetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFleetsResponse]
  }
  @scala.inline
  implicit class ListFleetsResponseOps[Self <: ListFleetsResponse] (val x: Self) extends AnyVal {
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
    def setFleetDetailsVarargs(value: Fleet*): Self = this.set("fleetDetails", js.Array(value :_*))
    @scala.inline
    def setFleetDetails(value: Fleets): Self = this.set("fleetDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFleetDetails: Self = this.set("fleetDetails", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

