package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFleetsResponse extends js.Object {
  /**
    * The summary list of the fleets.
    */
  var FleetSummaryList: js.UndefOr[typings.awsSdk.worklinkMod.FleetSummaryList] = js.native
  /**
    * The pagination token used to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.worklinkMod.NextToken] = js.native
}

object ListFleetsResponse {
  @scala.inline
  def apply(FleetSummaryList: FleetSummaryList = null, NextToken: NextToken = null): ListFleetsResponse = {
    val __obj = js.Dynamic.literal()
    if (FleetSummaryList != null) __obj.updateDynamic("FleetSummaryList")(FleetSummaryList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFleetsResponse]
  }
}

