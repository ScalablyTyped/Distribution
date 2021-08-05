package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyFleetRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2 Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy] = js.undefined
  
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: typings.awsSdk.ec2Mod.FleetId
  
  /**
    * The launch template and overrides.
    */
  var LaunchTemplateConfigs: js.UndefOr[FleetLaunchTemplateConfigListRequest] = js.undefined
  
  /**
    * The size of the EC2 Fleet.
    */
  var TargetCapacitySpecification: js.UndefOr[TargetCapacitySpecificationRequest] = js.undefined
}
object ModifyFleetRequest {
  
  inline def apply(FleetId: FleetId): ModifyFleetRequest = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyFleetRequest]
  }
  
  extension [Self <: ModifyFleetRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setExcessCapacityTerminationPolicy(value: FleetExcessCapacityTerminationPolicy): Self = StObject.set(x, "ExcessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
    
    inline def setExcessCapacityTerminationPolicyUndefined: Self = StObject.set(x, "ExcessCapacityTerminationPolicy", js.undefined)
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateConfigs(value: FleetLaunchTemplateConfigListRequest): Self = StObject.set(x, "LaunchTemplateConfigs", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateConfigsUndefined: Self = StObject.set(x, "LaunchTemplateConfigs", js.undefined)
    
    inline def setLaunchTemplateConfigsVarargs(value: FleetLaunchTemplateConfigRequest*): Self = StObject.set(x, "LaunchTemplateConfigs", js.Array(value :_*))
    
    inline def setTargetCapacitySpecification(value: TargetCapacitySpecificationRequest): Self = StObject.set(x, "TargetCapacitySpecification", value.asInstanceOf[js.Any])
    
    inline def setTargetCapacitySpecificationUndefined: Self = StObject.set(x, "TargetCapacitySpecification", js.undefined)
  }
}
