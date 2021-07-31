package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFleetRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2 Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy] = js.undefined
  
  /**
    * The configuration for the EC2 Fleet.
    */
  var LaunchTemplateConfigs: FleetLaunchTemplateConfigListRequest
  
  /**
    * Describes the configuration of On-Demand Instances in an EC2 Fleet.
    */
  var OnDemandOptions: js.UndefOr[OnDemandOptionsRequest] = js.undefined
  
  /**
    * Indicates whether EC2 Fleet should replace unhealthy instances.
    */
  var ReplaceUnhealthyInstances: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Describes the configuration of Spot Instances in an EC2 Fleet.
    */
  var SpotOptions: js.UndefOr[SpotOptionsRequest] = js.undefined
  
  /**
    * The key-value pair for tagging the EC2 Fleet request on creation. The value for ResourceType must be fleet, otherwise the fleet request fails. To tag instances at launch, specify the tags in the launch template. For information about tagging after launch, see Tagging your resources.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * The number of units to request.
    */
  var TargetCapacitySpecification: TargetCapacitySpecificationRequest
  
  /**
    * Indicates whether running instances should be terminated when the EC2 Fleet expires.
    */
  var TerminateInstancesWithExpiration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of request. The default value is maintain.    maintain - The EC2 Fleet plaees an asynchronous request for your desired capacity, and continues to maintain your desired Spot capacity by replenishing interrupted Spot Instances.    request - The EC2 Fleet places an asynchronous one-time request for your desired capacity, but does submit Spot requests in alternative capacity pools if Spot capacity is unavailable, and does not maintain Spot capacity if Spot Instances are interrupted.    instant - The EC2 Fleet places a synchronous one-time request for your desired capacity, and returns errors for any instances that could not be launched.   For more information, see EC2 Fleet request types in the Amazon Elastic Compute Cloud User Guide.
    */
  var Type: js.UndefOr[FleetType] = js.undefined
  
  /**
    * The start date and time of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
    */
  var ValidFrom: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The end date and time of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new EC2 Fleet requests are placed or able to fulfill the request. If no value is specified, the request remains until you cancel it.
    */
  var ValidUntil: js.UndefOr[DateTime] = js.undefined
}
object CreateFleetRequest {
  
  @scala.inline
  def apply(
    LaunchTemplateConfigs: FleetLaunchTemplateConfigListRequest,
    TargetCapacitySpecification: TargetCapacitySpecificationRequest
  ): CreateFleetRequest = {
    val __obj = js.Dynamic.literal(LaunchTemplateConfigs = LaunchTemplateConfigs.asInstanceOf[js.Any], TargetCapacitySpecification = TargetCapacitySpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFleetRequest]
  }
  
  @scala.inline
  implicit class CreateFleetRequestMutableBuilder[Self <: CreateFleetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setExcessCapacityTerminationPolicy(value: FleetExcessCapacityTerminationPolicy): Self = StObject.set(x, "ExcessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcessCapacityTerminationPolicyUndefined: Self = StObject.set(x, "ExcessCapacityTerminationPolicy", js.undefined)
    
    @scala.inline
    def setLaunchTemplateConfigs(value: FleetLaunchTemplateConfigListRequest): Self = StObject.set(x, "LaunchTemplateConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateConfigsVarargs(value: FleetLaunchTemplateConfigRequest*): Self = StObject.set(x, "LaunchTemplateConfigs", js.Array(value :_*))
    
    @scala.inline
    def setOnDemandOptions(value: OnDemandOptionsRequest): Self = StObject.set(x, "OnDemandOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandOptionsUndefined: Self = StObject.set(x, "OnDemandOptions", js.undefined)
    
    @scala.inline
    def setReplaceUnhealthyInstances(value: Boolean): Self = StObject.set(x, "ReplaceUnhealthyInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUnhealthyInstancesUndefined: Self = StObject.set(x, "ReplaceUnhealthyInstances", js.undefined)
    
    @scala.inline
    def setSpotOptions(value: SpotOptionsRequest): Self = StObject.set(x, "SpotOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotOptionsUndefined: Self = StObject.set(x, "SpotOptions", js.undefined)
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTargetCapacitySpecification(value: TargetCapacitySpecificationRequest): Self = StObject.set(x, "TargetCapacitySpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateInstancesWithExpiration(value: Boolean): Self = StObject.set(x, "TerminateInstancesWithExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateInstancesWithExpirationUndefined: Self = StObject.set(x, "TerminateInstancesWithExpiration", js.undefined)
    
    @scala.inline
    def setType(value: FleetType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setValidFrom(value: DateTime): Self = StObject.set(x, "ValidFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidFromUndefined: Self = StObject.set(x, "ValidFrom", js.undefined)
    
    @scala.inline
    def setValidUntil(value: DateTime): Self = StObject.set(x, "ValidUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUntilUndefined: Self = StObject.set(x, "ValidUntil", js.undefined)
  }
}
