package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingThresholds extends js.Object {
  /**
    * Custom Cloudwatch auto scaling alarms, to be used as thresholds. This parameter takes a list of up to five alarm names, which are case sensitive and must be in the same region as the stack.  To use custom alarms, you must update your service role to allow cloudwatch:DescribeAlarms. You can either have AWS OpsWorks Stacks update the role for you when you first use this feature or you can edit the role manually. For more information, see Allowing AWS OpsWorks Stacks to Act on Your Behalf. 
    */
  var Alarms: js.UndefOr[Strings] = js.native
  /**
    * The CPU utilization threshold, as a percent of the available CPU. A value of -1 disables the threshold.
    */
  var CpuThreshold: js.UndefOr[Double] = js.native
  /**
    * The amount of time (in minutes) after a scaling event occurs that AWS OpsWorks Stacks should ignore metrics and suppress additional scaling events. For example, AWS OpsWorks Stacks adds new instances following an upscaling event but the instances won't start reducing the load until they have been booted and configured. There is no point in raising additional scaling events during that operation, which typically takes several minutes. IgnoreMetricsTime allows you to direct AWS OpsWorks Stacks to suppress scaling events long enough to get the new instances online.
    */
  var IgnoreMetricsTime: js.UndefOr[Minute] = js.native
  /**
    * The number of instances to add or remove when the load exceeds a threshold.
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The load threshold. A value of -1 disables the threshold. For more information about how load is computed, see Load (computing).
    */
  var LoadThreshold: js.UndefOr[Double] = js.native
  /**
    * The memory utilization threshold, as a percent of the available memory. A value of -1 disables the threshold.
    */
  var MemoryThreshold: js.UndefOr[Double] = js.native
  /**
    * The amount of time, in minutes, that the load must exceed a threshold before more instances are added or removed.
    */
  var ThresholdsWaitTime: js.UndefOr[Minute] = js.native
}

object AutoScalingThresholds {
  @scala.inline
  def apply(
    Alarms: Strings = null,
    CpuThreshold: js.UndefOr[Double] = js.undefined,
    IgnoreMetricsTime: js.UndefOr[Minute] = js.undefined,
    InstanceCount: js.UndefOr[Integer] = js.undefined,
    LoadThreshold: js.UndefOr[Double] = js.undefined,
    MemoryThreshold: js.UndefOr[Double] = js.undefined,
    ThresholdsWaitTime: js.UndefOr[Minute] = js.undefined
  ): AutoScalingThresholds = {
    val __obj = js.Dynamic.literal()
    if (Alarms != null) __obj.updateDynamic("Alarms")(Alarms.asInstanceOf[js.Any])
    if (!js.isUndefined(CpuThreshold)) __obj.updateDynamic("CpuThreshold")(CpuThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(IgnoreMetricsTime)) __obj.updateDynamic("IgnoreMetricsTime")(IgnoreMetricsTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(InstanceCount)) __obj.updateDynamic("InstanceCount")(InstanceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(LoadThreshold)) __obj.updateDynamic("LoadThreshold")(LoadThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MemoryThreshold)) __obj.updateDynamic("MemoryThreshold")(MemoryThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ThresholdsWaitTime)) __obj.updateDynamic("ThresholdsWaitTime")(ThresholdsWaitTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingThresholds]
  }
}

