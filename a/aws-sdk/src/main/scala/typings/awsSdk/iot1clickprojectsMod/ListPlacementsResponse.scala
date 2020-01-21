package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlacementsResponse extends js.Object {
  /**
    * The token used to retrieve the next set of results - will be effectively empty if there are no further results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * An object listing the requested placements.
    */
  var placements: PlacementSummaryList = js.native
}

object ListPlacementsResponse {
  @scala.inline
  def apply(placements: PlacementSummaryList, nextToken: NextToken = null): ListPlacementsResponse = {
    val __obj = js.Dynamic.literal(placements = placements.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPlacementsResponse]
  }
}

