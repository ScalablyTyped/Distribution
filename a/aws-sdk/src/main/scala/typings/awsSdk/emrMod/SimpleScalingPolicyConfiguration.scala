package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleScalingPolicyConfiguration extends StObject {
  
  /**
    * The way in which EC2 instances are added (if ScalingAdjustment is a positive number) or terminated (if ScalingAdjustment is a negative number) each time the scaling activity is triggered. CHANGE_IN_CAPACITY is the default. CHANGE_IN_CAPACITY indicates that the EC2 instance count increments or decrements by ScalingAdjustment, which should be expressed as an integer. PERCENT_CHANGE_IN_CAPACITY indicates the instance count increments or decrements by the percentage specified by ScalingAdjustment, which should be expressed as an integer. For example, 20 indicates an increase in 20% increments of cluster capacity. EXACT_CAPACITY indicates the scaling activity results in an instance group with the number of EC2 instances specified by ScalingAdjustment, which should be expressed as a positive integer.
    */
  var AdjustmentType: js.UndefOr[typings.awsSdk.emrMod.AdjustmentType] = js.undefined
  
  /**
    * The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start. The default value is 0.
    */
  var CoolDown: js.UndefOr[Integer] = js.undefined
  
  /**
    * The amount by which to scale in or scale out, based on the specified AdjustmentType. A positive value adds to the instance group's EC2 instance count while a negative number removes instances. If AdjustmentType is set to EXACT_CAPACITY, the number should only be a positive integer. If AdjustmentType is set to PERCENT_CHANGE_IN_CAPACITY, the value should express the percentage as an integer. For example, -20 indicates a decrease in 20% increments of cluster capacity.
    */
  var ScalingAdjustment: Integer
}
object SimpleScalingPolicyConfiguration {
  
  @scala.inline
  def apply(ScalingAdjustment: Integer): SimpleScalingPolicyConfiguration = {
    val __obj = js.Dynamic.literal(ScalingAdjustment = ScalingAdjustment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleScalingPolicyConfiguration]
  }
  
  @scala.inline
  implicit class SimpleScalingPolicyConfigurationMutableBuilder[Self <: SimpleScalingPolicyConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustmentType(value: AdjustmentType): Self = StObject.set(x, "AdjustmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustmentTypeUndefined: Self = StObject.set(x, "AdjustmentType", js.undefined)
    
    @scala.inline
    def setCoolDown(value: Integer): Self = StObject.set(x, "CoolDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoolDownUndefined: Self = StObject.set(x, "CoolDown", js.undefined)
    
    @scala.inline
    def setScalingAdjustment(value: Integer): Self = StObject.set(x, "ScalingAdjustment", value.asInstanceOf[js.Any])
  }
}
