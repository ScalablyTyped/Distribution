package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetUtilizationInput extends js.Object {
  /**
    * A unique identifier for a fleet(s) to retrieve utilization data for. You can use either the fleet ID or ARN value. To retrieve attributes for all current fleets, do not include this parameter. If the list of fleet identifiers includes fleets that don't currently exist, the request succeeds but no attributes for that fleet are returned.
    */
  var FleetIds: js.UndefOr[FleetIdOrArnList] = js.native
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages. This parameter is ignored when the request specifies one or a list of fleet IDs.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value. This parameter is ignored when the request specifies one or a list of fleet IDs.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}

object DescribeFleetUtilizationInput {
  @scala.inline
  def apply(
    FleetIds: FleetIdOrArnList = null,
    Limit: Int | scala.Double = null,
    NextToken: NonZeroAndMaxString = null
  ): DescribeFleetUtilizationInput = {
    val __obj = js.Dynamic.literal()
    if (FleetIds != null) __obj.updateDynamic("FleetIds")(FleetIds.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetUtilizationInput]
  }
}

