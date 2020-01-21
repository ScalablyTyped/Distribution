package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedScaling extends js.Object {
  /**
    * The maximum number of container instances that Amazon ECS will scale in or scale out at one time. If this parameter is omitted, the default value of 10000 is used.
    */
  var maximumScalingStepSize: js.UndefOr[ManagedScalingStepSize] = js.native
  /**
    * The minimum number of container instances that Amazon ECS will scale in or scale out at one time. If this parameter is omitted, the default value of 1 is used.
    */
  var minimumScalingStepSize: js.UndefOr[ManagedScalingStepSize] = js.native
  /**
    * Whether or not to enable managed scaling for the capacity provider.
    */
  var status: js.UndefOr[ManagedScalingStatus] = js.native
  /**
    * The target capacity value for the capacity provider. The specified value must be greater than 0 and less than or equal to 100. A value of 100 will result in the Amazon EC2 instances in your Auto Scaling group being completely utilized.
    */
  var targetCapacity: js.UndefOr[ManagedScalingTargetCapacity] = js.native
}

object ManagedScaling {
  @scala.inline
  def apply(
    maximumScalingStepSize: Int | scala.Double = null,
    minimumScalingStepSize: Int | scala.Double = null,
    status: ManagedScalingStatus = null,
    targetCapacity: Int | scala.Double = null
  ): ManagedScaling = {
    val __obj = js.Dynamic.literal()
    if (maximumScalingStepSize != null) __obj.updateDynamic("maximumScalingStepSize")(maximumScalingStepSize.asInstanceOf[js.Any])
    if (minimumScalingStepSize != null) __obj.updateDynamic("minimumScalingStepSize")(minimumScalingStepSize.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (targetCapacity != null) __obj.updateDynamic("targetCapacity")(targetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedScaling]
  }
}

