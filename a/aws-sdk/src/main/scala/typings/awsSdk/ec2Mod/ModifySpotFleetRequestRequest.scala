package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifySpotFleetRequestRequest extends StObject {
  
  /**
    * Reserved.
    */
  var Context: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet request is decreased below the current size of the Spot Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[typings.awsSdk.ec2Mod.ExcessCapacityTerminationPolicy] = js.undefined
  
  /**
    * The launch template and overrides. You can only use this parameter if you specified a launch template (LaunchTemplateConfigs) in your Spot Fleet request. If you specified LaunchSpecifications in your Spot Fleet request, then omit this parameter.
    */
  var LaunchTemplateConfigs: js.UndefOr[LaunchTemplateConfigList] = js.undefined
  
  /**
    * The number of On-Demand Instances in the fleet.
    */
  var OnDemandTargetCapacity: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: typings.awsSdk.ec2Mod.SpotFleetRequestId
  
  /**
    * The size of the fleet.
    */
  var TargetCapacity: js.UndefOr[Integer] = js.undefined
}
object ModifySpotFleetRequestRequest {
  
  inline def apply(SpotFleetRequestId: SpotFleetRequestId): ModifySpotFleetRequestRequest = {
    val __obj = js.Dynamic.literal(SpotFleetRequestId = SpotFleetRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySpotFleetRequestRequest]
  }
  
  extension [Self <: ModifySpotFleetRequestRequest](x: Self) {
    
    inline def setContext(value: String): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
    
    inline def setExcessCapacityTerminationPolicy(value: ExcessCapacityTerminationPolicy): Self = StObject.set(x, "ExcessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
    
    inline def setExcessCapacityTerminationPolicyUndefined: Self = StObject.set(x, "ExcessCapacityTerminationPolicy", js.undefined)
    
    inline def setLaunchTemplateConfigs(value: LaunchTemplateConfigList): Self = StObject.set(x, "LaunchTemplateConfigs", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateConfigsUndefined: Self = StObject.set(x, "LaunchTemplateConfigs", js.undefined)
    
    inline def setLaunchTemplateConfigsVarargs(value: LaunchTemplateConfig*): Self = StObject.set(x, "LaunchTemplateConfigs", js.Array(value*))
    
    inline def setOnDemandTargetCapacity(value: Integer): Self = StObject.set(x, "OnDemandTargetCapacity", value.asInstanceOf[js.Any])
    
    inline def setOnDemandTargetCapacityUndefined: Self = StObject.set(x, "OnDemandTargetCapacity", js.undefined)
    
    inline def setSpotFleetRequestId(value: SpotFleetRequestId): Self = StObject.set(x, "SpotFleetRequestId", value.asInstanceOf[js.Any])
    
    inline def setTargetCapacity(value: Integer): Self = StObject.set(x, "TargetCapacity", value.asInstanceOf[js.Any])
    
    inline def setTargetCapacityUndefined: Self = StObject.set(x, "TargetCapacity", js.undefined)
  }
}
