package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingThresholds extends StObject {
  
  /**
    * Custom Cloudwatch auto scaling alarms, to be used as thresholds. This parameter takes a list of up to five alarm names, which are case sensitive and must be in the same region as the stack.  To use custom alarms, you must update your service role to allow cloudwatch:DescribeAlarms. You can either have AWS OpsWorks Stacks update the role for you when you first use this feature or you can edit the role manually. For more information, see Allowing AWS OpsWorks Stacks to Act on Your Behalf. 
    */
  var Alarms: js.UndefOr[Strings] = js.undefined
  
  /**
    * The CPU utilization threshold, as a percent of the available CPU. A value of -1 disables the threshold.
    */
  var CpuThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount of time (in minutes) after a scaling event occurs that AWS OpsWorks Stacks should ignore metrics and suppress additional scaling events. For example, AWS OpsWorks Stacks adds new instances following an upscaling event but the instances won't start reducing the load until they have been booted and configured. There is no point in raising additional scaling events during that operation, which typically takes several minutes. IgnoreMetricsTime allows you to direct AWS OpsWorks Stacks to suppress scaling events long enough to get the new instances online.
    */
  var IgnoreMetricsTime: js.UndefOr[Minute] = js.undefined
  
  /**
    * The number of instances to add or remove when the load exceeds a threshold.
    */
  var InstanceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The load threshold. A value of -1 disables the threshold. For more information about how load is computed, see Load (computing).
    */
  var LoadThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * The memory utilization threshold, as a percent of the available memory. A value of -1 disables the threshold.
    */
  var MemoryThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount of time, in minutes, that the load must exceed a threshold before more instances are added or removed.
    */
  var ThresholdsWaitTime: js.UndefOr[Minute] = js.undefined
}
object AutoScalingThresholds {
  
  inline def apply(): AutoScalingThresholds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingThresholds]
  }
  
  extension [Self <: AutoScalingThresholds](x: Self) {
    
    inline def setAlarms(value: Strings): Self = StObject.set(x, "Alarms", value.asInstanceOf[js.Any])
    
    inline def setAlarmsUndefined: Self = StObject.set(x, "Alarms", js.undefined)
    
    inline def setAlarmsVarargs(value: String*): Self = StObject.set(x, "Alarms", js.Array(value*))
    
    inline def setCpuThreshold(value: Double): Self = StObject.set(x, "CpuThreshold", value.asInstanceOf[js.Any])
    
    inline def setCpuThresholdUndefined: Self = StObject.set(x, "CpuThreshold", js.undefined)
    
    inline def setIgnoreMetricsTime(value: Minute): Self = StObject.set(x, "IgnoreMetricsTime", value.asInstanceOf[js.Any])
    
    inline def setIgnoreMetricsTimeUndefined: Self = StObject.set(x, "IgnoreMetricsTime", js.undefined)
    
    inline def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    inline def setLoadThreshold(value: Double): Self = StObject.set(x, "LoadThreshold", value.asInstanceOf[js.Any])
    
    inline def setLoadThresholdUndefined: Self = StObject.set(x, "LoadThreshold", js.undefined)
    
    inline def setMemoryThreshold(value: Double): Self = StObject.set(x, "MemoryThreshold", value.asInstanceOf[js.Any])
    
    inline def setMemoryThresholdUndefined: Self = StObject.set(x, "MemoryThreshold", js.undefined)
    
    inline def setThresholdsWaitTime(value: Minute): Self = StObject.set(x, "ThresholdsWaitTime", value.asInstanceOf[js.Any])
    
    inline def setThresholdsWaitTimeUndefined: Self = StObject.set(x, "ThresholdsWaitTime", js.undefined)
  }
}
