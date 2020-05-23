package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingGroupConfiguration extends js.Object {
  /**
    * The desired capacity, or number of instances, for the Auto Scaling group.
    */
  var desiredCapacity: js.UndefOr[DesiredCapacity] = js.native
  /**
    * The instance type for the Auto Scaling group.
    */
  var instanceType: js.UndefOr[InstanceType] = js.native
  /**
    * The maximum size, or maximum number of instances, for the Auto Scaling group.
    */
  var maxSize: js.UndefOr[MaxSize] = js.native
  /**
    * The minimum size, or minimum number of instances, for the Auto Scaling group.
    */
  var minSize: js.UndefOr[MinSize] = js.native
}

object AutoScalingGroupConfiguration {
  @scala.inline
  def apply(
    desiredCapacity: js.UndefOr[DesiredCapacity] = js.undefined,
    instanceType: InstanceType = null,
    maxSize: js.UndefOr[MaxSize] = js.undefined,
    minSize: js.UndefOr[MinSize] = js.undefined
  ): AutoScalingGroupConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(desiredCapacity)) __obj.updateDynamic("desiredCapacity")(desiredCapacity.get.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSize)) __obj.updateDynamic("maxSize")(maxSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSize)) __obj.updateDynamic("minSize")(minSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingGroupConfiguration]
  }
}

