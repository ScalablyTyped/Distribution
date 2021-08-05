package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotInstanceRequest extends StObject {
  
  /**
    * If you specified a duration and your Spot Instance request was fulfilled, this is the fixed hourly price in effect for the Spot Instance while it runs.
    */
  var ActualBlockHourlyPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The Availability Zone group. If you specify the same Availability Zone group for all Spot Instance requests, all Spot Instances are launched in the same Availability Zone.
    */
  var AvailabilityZoneGroup: js.UndefOr[String] = js.undefined
  
  /**
    * The duration for the Spot Instance, in minutes.
    */
  var BlockDurationMinutes: js.UndefOr[Integer] = js.undefined
  
  /**
    * The date and time when the Spot Instance request was created, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var CreateTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The fault codes for the Spot Instance request, if any.
    */
  var Fault: js.UndefOr[SpotInstanceStateFault] = js.undefined
  
  /**
    * The instance ID, if an instance has been launched to fulfill the Spot Instance request.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ec2Mod.InstanceId] = js.undefined
  
  /**
    * The behavior when a Spot Instance is interrupted.
    */
  var InstanceInterruptionBehavior: js.UndefOr[typings.awsSdk.ec2Mod.InstanceInterruptionBehavior] = js.undefined
  
  /**
    * The instance launch group. Launch groups are Spot Instances that launch together and terminate together.
    */
  var LaunchGroup: js.UndefOr[String] = js.undefined
  
  /**
    * Additional information for launching instances.
    */
  var LaunchSpecification: js.UndefOr[typings.awsSdk.ec2Mod.LaunchSpecification] = js.undefined
  
  /**
    * The Availability Zone in which the request is launched.
    */
  var LaunchedAvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The product description associated with the Spot Instance.
    */
  var ProductDescription: js.UndefOr[RIProductDescription] = js.undefined
  
  /**
    * The ID of the Spot Instance request.
    */
  var SpotInstanceRequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum price per hour that you are willing to pay for a Spot Instance.
    */
  var SpotPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the Spot Instance request. Spot status information helps track your Spot Instance requests. For more information, see Spot status in the Amazon EC2 User Guide for Linux Instances.
    */
  var State: js.UndefOr[SpotInstanceState] = js.undefined
  
  /**
    * The status code and status message describing the Spot Instance request.
    */
  var Status: js.UndefOr[SpotInstanceStatus] = js.undefined
  
  /**
    * Any tags assigned to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The Spot Instance request type.
    */
  var Type: js.UndefOr[SpotInstanceType] = js.undefined
  
  /**
    * The start date of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). The request becomes active at this date and time.
    */
  var ValidFrom: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The end date of the request, in UTC format (YYYY-MM-DDTHH:MM:SSZ).   For a persistent request, the request remains active until the validUntil date and time is reached. Otherwise, the request remains active until you cancel it.    For a one-time request, the request remains active until all instances launch, the request is canceled, or the validUntil date and time is reached. By default, the request is valid for 7 days from the date the request was created.  
    */
  var ValidUntil: js.UndefOr[DateTime] = js.undefined
}
object SpotInstanceRequest {
  
  inline def apply(): SpotInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotInstanceRequest]
  }
  
  extension [Self <: SpotInstanceRequest](x: Self) {
    
    inline def setActualBlockHourlyPrice(value: String): Self = StObject.set(x, "ActualBlockHourlyPrice", value.asInstanceOf[js.Any])
    
    inline def setActualBlockHourlyPriceUndefined: Self = StObject.set(x, "ActualBlockHourlyPrice", js.undefined)
    
    inline def setAvailabilityZoneGroup(value: String): Self = StObject.set(x, "AvailabilityZoneGroup", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneGroupUndefined: Self = StObject.set(x, "AvailabilityZoneGroup", js.undefined)
    
    inline def setBlockDurationMinutes(value: Integer): Self = StObject.set(x, "BlockDurationMinutes", value.asInstanceOf[js.Any])
    
    inline def setBlockDurationMinutesUndefined: Self = StObject.set(x, "BlockDurationMinutes", js.undefined)
    
    inline def setCreateTime(value: DateTime): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setFault(value: SpotInstanceStateFault): Self = StObject.set(x, "Fault", value.asInstanceOf[js.Any])
    
    inline def setFaultUndefined: Self = StObject.set(x, "Fault", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setInstanceInterruptionBehavior(value: InstanceInterruptionBehavior): Self = StObject.set(x, "InstanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    inline def setInstanceInterruptionBehaviorUndefined: Self = StObject.set(x, "InstanceInterruptionBehavior", js.undefined)
    
    inline def setLaunchGroup(value: String): Self = StObject.set(x, "LaunchGroup", value.asInstanceOf[js.Any])
    
    inline def setLaunchGroupUndefined: Self = StObject.set(x, "LaunchGroup", js.undefined)
    
    inline def setLaunchSpecification(value: LaunchSpecification): Self = StObject.set(x, "LaunchSpecification", value.asInstanceOf[js.Any])
    
    inline def setLaunchSpecificationUndefined: Self = StObject.set(x, "LaunchSpecification", js.undefined)
    
    inline def setLaunchedAvailabilityZone(value: String): Self = StObject.set(x, "LaunchedAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setLaunchedAvailabilityZoneUndefined: Self = StObject.set(x, "LaunchedAvailabilityZone", js.undefined)
    
    inline def setProductDescription(value: RIProductDescription): Self = StObject.set(x, "ProductDescription", value.asInstanceOf[js.Any])
    
    inline def setProductDescriptionUndefined: Self = StObject.set(x, "ProductDescription", js.undefined)
    
    inline def setSpotInstanceRequestId(value: String): Self = StObject.set(x, "SpotInstanceRequestId", value.asInstanceOf[js.Any])
    
    inline def setSpotInstanceRequestIdUndefined: Self = StObject.set(x, "SpotInstanceRequestId", js.undefined)
    
    inline def setSpotPrice(value: String): Self = StObject.set(x, "SpotPrice", value.asInstanceOf[js.Any])
    
    inline def setSpotPriceUndefined: Self = StObject.set(x, "SpotPrice", js.undefined)
    
    inline def setState(value: SpotInstanceState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setStatus(value: SpotInstanceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setType(value: SpotInstanceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValidFrom(value: DateTime): Self = StObject.set(x, "ValidFrom", value.asInstanceOf[js.Any])
    
    inline def setValidFromUndefined: Self = StObject.set(x, "ValidFrom", js.undefined)
    
    inline def setValidUntil(value: DateTime): Self = StObject.set(x, "ValidUntil", value.asInstanceOf[js.Any])
    
    inline def setValidUntilUndefined: Self = StObject.set(x, "ValidUntil", js.undefined)
  }
}
