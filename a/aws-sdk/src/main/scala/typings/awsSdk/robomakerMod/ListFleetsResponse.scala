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
  def apply(fleetDetails: Fleets = null, nextToken: PaginationToken = null): ListFleetsResponse = {
    val __obj = js.Dynamic.literal()
    if (fleetDetails != null) __obj.updateDynamic("fleetDetails")(fleetDetails.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFleetsResponse]
  }
}

