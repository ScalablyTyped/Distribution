package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetAttributesOutput extends js.Object {
  /**
    * A collection of objects containing attribute metadata for each requested fleet ID. Attribute objects are returned only for fleets that currently exist.
    */
  var FleetAttributes: js.UndefOr[FleetAttributesList] = js.native
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}

object DescribeFleetAttributesOutput {
  @scala.inline
  def apply(FleetAttributes: FleetAttributesList = null, NextToken: NonZeroAndMaxString = null): DescribeFleetAttributesOutput = {
    val __obj = js.Dynamic.literal()
    if (FleetAttributes != null) __obj.updateDynamic("FleetAttributes")(FleetAttributes.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetAttributesOutput]
  }
}

