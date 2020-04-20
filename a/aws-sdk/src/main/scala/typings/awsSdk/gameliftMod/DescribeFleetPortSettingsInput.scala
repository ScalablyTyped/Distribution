package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetPortSettingsInput extends js.Object {
  /**
    * A unique identifier for a fleet to retrieve port settings for. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn = js.native
}

object DescribeFleetPortSettingsInput {
  @scala.inline
  def apply(FleetId: FleetIdOrArn): DescribeFleetPortSettingsInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetPortSettingsInput]
  }
}

