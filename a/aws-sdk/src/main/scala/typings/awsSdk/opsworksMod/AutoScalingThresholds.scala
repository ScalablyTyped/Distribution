package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): AutoScalingThresholds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingThresholds]
  }
  
  @scala.inline
  implicit class AutoScalingThresholdsOps[Self <: AutoScalingThresholds] (val x: Self) extends AnyVal {
    
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
    def setAlarmsVarargs(value: String*): Self = this.set("Alarms", js.Array(value :_*))
    
    @scala.inline
    def setAlarms(value: Strings): Self = this.set("Alarms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarms: Self = this.set("Alarms", js.undefined)
    
    @scala.inline
    def setCpuThreshold(value: Double): Self = this.set("CpuThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuThreshold: Self = this.set("CpuThreshold", js.undefined)
    
    @scala.inline
    def setIgnoreMetricsTime(value: Minute): Self = this.set("IgnoreMetricsTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreMetricsTime: Self = this.set("IgnoreMetricsTime", js.undefined)
    
    @scala.inline
    def setInstanceCount(value: Integer): Self = this.set("InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceCount: Self = this.set("InstanceCount", js.undefined)
    
    @scala.inline
    def setLoadThreshold(value: Double): Self = this.set("LoadThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadThreshold: Self = this.set("LoadThreshold", js.undefined)
    
    @scala.inline
    def setMemoryThreshold(value: Double): Self = this.set("MemoryThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryThreshold: Self = this.set("MemoryThreshold", js.undefined)
    
    @scala.inline
    def setThresholdsWaitTime(value: Minute): Self = this.set("ThresholdsWaitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThresholdsWaitTime: Self = this.set("ThresholdsWaitTime", js.undefined)
  }
}
