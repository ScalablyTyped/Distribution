package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFleetCapacityInput extends js.Object {
  /**
    * Number of EC2 instances you want this fleet to host.
    */
  var DesiredInstances: js.UndefOr[WholeNumber] = js.native
  /**
    * A unique identifier for a fleet to update capacity for. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn = js.native
  /**
    * The maximum value allowed for the fleet's instance count. Default if not set is 1.
    */
  var MaxSize: js.UndefOr[WholeNumber] = js.native
  /**
    * The minimum value allowed for the fleet's instance count. Default if not set is 0.
    */
  var MinSize: js.UndefOr[WholeNumber] = js.native
}

object UpdateFleetCapacityInput {
  @scala.inline
  def apply(
    FleetId: FleetIdOrArn,
    DesiredInstances: js.UndefOr[WholeNumber] = js.undefined,
    MaxSize: js.UndefOr[WholeNumber] = js.undefined,
    MinSize: js.UndefOr[WholeNumber] = js.undefined
  ): UpdateFleetCapacityInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    if (!js.isUndefined(DesiredInstances)) __obj.updateDynamic("DesiredInstances")(DesiredInstances.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxSize)) __obj.updateDynamic("MaxSize")(MaxSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinSize)) __obj.updateDynamic("MinSize")(MinSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFleetCapacityInput]
  }
}

