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
  var FleetId: typings.awsSdk.gameliftMod.FleetId = js.native
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
    FleetId: FleetId,
    DesiredInstances: Int | scala.Double = null,
    MaxSize: Int | scala.Double = null,
    MinSize: Int | scala.Double = null
  ): UpdateFleetCapacityInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    if (DesiredInstances != null) __obj.updateDynamic("DesiredInstances")(DesiredInstances.asInstanceOf[js.Any])
    if (MaxSize != null) __obj.updateDynamic("MaxSize")(MaxSize.asInstanceOf[js.Any])
    if (MinSize != null) __obj.updateDynamic("MinSize")(MinSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFleetCapacityInput]
  }
}

