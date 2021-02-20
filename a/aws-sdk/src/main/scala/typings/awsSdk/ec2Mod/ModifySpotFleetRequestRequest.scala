package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifySpotFleetRequestRequest extends StObject {
  
  /**
    * Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet request is decreased below the current size of the Spot Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[typings.awsSdk.ec2Mod.ExcessCapacityTerminationPolicy] = js.native
  
  /**
    * The launch template and overrides. You can only use this parameter if you specified a launch template (LaunchTemplateConfigs) in your Spot Fleet request. If you specified LaunchSpecifications in your Spot Fleet request, then omit this parameter.
    */
  var LaunchTemplateConfigs: js.UndefOr[LaunchTemplateConfigList] = js.native
  
  /**
    * The number of On-Demand Instances in the fleet.
    */
  var OnDemandTargetCapacity: js.UndefOr[Integer] = js.native
  
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: typings.awsSdk.ec2Mod.SpotFleetRequestId = js.native
  
  /**
    * The size of the fleet.
    */
  var TargetCapacity: js.UndefOr[Integer] = js.native
}
object ModifySpotFleetRequestRequest {
  
  @scala.inline
  def apply(SpotFleetRequestId: SpotFleetRequestId): ModifySpotFleetRequestRequest = {
    val __obj = js.Dynamic.literal(SpotFleetRequestId = SpotFleetRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySpotFleetRequestRequest]
  }
  
  @scala.inline
  implicit class ModifySpotFleetRequestRequestMutableBuilder[Self <: ModifySpotFleetRequestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcessCapacityTerminationPolicy(value: ExcessCapacityTerminationPolicy): Self = StObject.set(x, "ExcessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcessCapacityTerminationPolicyUndefined: Self = StObject.set(x, "ExcessCapacityTerminationPolicy", js.undefined)
    
    @scala.inline
    def setLaunchTemplateConfigs(value: LaunchTemplateConfigList): Self = StObject.set(x, "LaunchTemplateConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateConfigsUndefined: Self = StObject.set(x, "LaunchTemplateConfigs", js.undefined)
    
    @scala.inline
    def setLaunchTemplateConfigsVarargs(value: LaunchTemplateConfig*): Self = StObject.set(x, "LaunchTemplateConfigs", js.Array(value :_*))
    
    @scala.inline
    def setOnDemandTargetCapacity(value: Integer): Self = StObject.set(x, "OnDemandTargetCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandTargetCapacityUndefined: Self = StObject.set(x, "OnDemandTargetCapacity", js.undefined)
    
    @scala.inline
    def setSpotFleetRequestId(value: SpotFleetRequestId): Self = StObject.set(x, "SpotFleetRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCapacity(value: Integer): Self = StObject.set(x, "TargetCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCapacityUndefined: Self = StObject.set(x, "TargetCapacity", js.undefined)
  }
}
