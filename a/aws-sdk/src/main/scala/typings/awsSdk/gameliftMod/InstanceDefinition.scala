package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceDefinition extends js.Object {
  /**
    * An EC2 instance type designation.
    */
  var InstanceType: GameServerGroupInstanceType = js.native
  /**
    * Instance weighting that indicates how much this instance type contributes to the total capacity of a game server group. Instance weights are used by GameLift FleetIQ to calculate the instance type's cost per unit hour and better identify the most cost-effective options. For detailed information on weighting instance capacity, see Instance Weighting in the Amazon EC2 Auto Scaling User Guide. Default value is "1".
    */
  var WeightedCapacity: js.UndefOr[typings.awsSdk.gameliftMod.WeightedCapacity] = js.native
}

object InstanceDefinition {
  @scala.inline
  def apply(InstanceType: GameServerGroupInstanceType, WeightedCapacity: WeightedCapacity = null): InstanceDefinition = {
    val __obj = js.Dynamic.literal(InstanceType = InstanceType.asInstanceOf[js.Any])
    if (WeightedCapacity != null) __obj.updateDynamic("WeightedCapacity")(WeightedCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceDefinition]
  }
}

