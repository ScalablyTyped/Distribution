package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyFleetRequest extends js.Object {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2 Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy] = js.native
  
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: typings.awsSdk.ec2Mod.FleetId = js.native
  
  /**
    * The launch template and overrides.
    */
  var LaunchTemplateConfigs: js.UndefOr[FleetLaunchTemplateConfigListRequest] = js.native
  
  /**
    * The size of the EC2 Fleet.
    */
  var TargetCapacitySpecification: js.UndefOr[TargetCapacitySpecificationRequest] = js.native
}
object ModifyFleetRequest {
  
  @scala.inline
  def apply(FleetId: FleetId): ModifyFleetRequest = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyFleetRequest]
  }
  
  @scala.inline
  implicit class ModifyFleetRequestOps[Self <: ModifyFleetRequest] (val x: Self) extends AnyVal {
    
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
    def setFleetId(value: FleetId): Self = this.set("FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setExcessCapacityTerminationPolicy(value: FleetExcessCapacityTerminationPolicy): Self = this.set("ExcessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcessCapacityTerminationPolicy: Self = this.set("ExcessCapacityTerminationPolicy", js.undefined)
    
    @scala.inline
    def setLaunchTemplateConfigsVarargs(value: FleetLaunchTemplateConfigRequest*): Self = this.set("LaunchTemplateConfigs", js.Array(value :_*))
    
    @scala.inline
    def setLaunchTemplateConfigs(value: FleetLaunchTemplateConfigListRequest): Self = this.set("LaunchTemplateConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplateConfigs: Self = this.set("LaunchTemplateConfigs", js.undefined)
    
    @scala.inline
    def setTargetCapacitySpecification(value: TargetCapacitySpecificationRequest): Self = this.set("TargetCapacitySpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetCapacitySpecification: Self = this.set("TargetCapacitySpecification", js.undefined)
  }
}
