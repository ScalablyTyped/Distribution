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
  def apply(): ManagedScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedScaling]
  }
  @scala.inline
  implicit class ManagedScalingOps[Self <: ManagedScaling] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaximumScalingStepSize(value: ManagedScalingStepSize): Self = this.set("maximumScalingStepSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumScalingStepSize: Self = this.set("maximumScalingStepSize", js.undefined)
    @scala.inline
    def setMinimumScalingStepSize(value: ManagedScalingStepSize): Self = this.set("minimumScalingStepSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumScalingStepSize: Self = this.set("minimumScalingStepSize", js.undefined)
    @scala.inline
    def setStatus(value: ManagedScalingStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTargetCapacity(value: ManagedScalingTargetCapacity): Self = this.set("targetCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetCapacity: Self = this.set("targetCapacity", js.undefined)
  }
  
}

