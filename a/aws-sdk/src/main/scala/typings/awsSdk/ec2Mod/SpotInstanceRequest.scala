package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotInstanceRequest extends StObject {
  
  /**
    * If you specified a duration and your Spot Instance request was fulfilled, this is the fixed hourly price in effect for the Spot Instance while it runs.
    */
  var ActualBlockHourlyPrice: js.UndefOr[String] = js.native
  
  /**
    * The Availability Zone group. If you specify the same Availability Zone group for all Spot Instance requests, all Spot Instances are launched in the same Availability Zone.
    */
  var AvailabilityZoneGroup: js.UndefOr[String] = js.native
  
  /**
    * The duration for the Spot Instance, in minutes.
    */
  var BlockDurationMinutes: js.UndefOr[Integer] = js.native
  
  /**
    * The date and time when the Spot Instance request was created, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var CreateTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The fault codes for the Spot Instance request, if any.
    */
  var Fault: js.UndefOr[SpotInstanceStateFault] = js.native
  
  /**
    * The instance ID, if an instance has been launched to fulfill the Spot Instance request.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ec2Mod.InstanceId] = js.native
  
  /**
    * The behavior when a Spot Instance is interrupted.
    */
  var InstanceInterruptionBehavior: js.UndefOr[typings.awsSdk.ec2Mod.InstanceInterruptionBehavior] = js.native
  
  /**
    * The instance launch group. Launch groups are Spot Instances that launch together and terminate together.
    */
  var LaunchGroup: js.UndefOr[String] = js.native
  
  /**
    * Additional information for launching instances.
    */
  var LaunchSpecification: js.UndefOr[typings.awsSdk.ec2Mod.LaunchSpecification] = js.native
  
  /**
    * The Availability Zone in which the request is launched.
    */
  var LaunchedAvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The product description associated with the Spot Instance.
    */
  var ProductDescription: js.UndefOr[RIProductDescription] = js.native
  
  /**
    * The ID of the Spot Instance request.
    */
  var SpotInstanceRequestId: js.UndefOr[String] = js.native
  
  /**
    * The maximum price per hour that you are willing to pay for a Spot Instance.
    */
  var SpotPrice: js.UndefOr[String] = js.native
  
  /**
    * The state of the Spot Instance request. Spot status information helps track your Spot Instance requests. For more information, see Spot status in the Amazon EC2 User Guide for Linux Instances.
    */
  var State: js.UndefOr[SpotInstanceState] = js.native
  
  /**
    * The status code and status message describing the Spot Instance request.
    */
  var Status: js.UndefOr[SpotInstanceStatus] = js.native
  
  /**
    * Any tags assigned to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The Spot Instance request type.
    */
  var Type: js.UndefOr[SpotInstanceType] = js.native
  
  /**
    * The start date of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). The request becomes active at this date and time.
    */
  var ValidFrom: js.UndefOr[DateTime] = js.native
  
  /**
    * The end date of the request, in UTC format (YYYY-MM-DDTHH:MM:SSZ).   For a persistent request, the request remains active until the validUntil date and time is reached. Otherwise, the request remains active until you cancel it.    For a one-time request, the request remains active until all instances launch, the request is canceled, or the validUntil date and time is reached. By default, the request is valid for 7 days from the date the request was created.  
    */
  var ValidUntil: js.UndefOr[DateTime] = js.native
}
object SpotInstanceRequest {
  
  @scala.inline
  def apply(): SpotInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotInstanceRequest]
  }
  
  @scala.inline
  implicit class SpotInstanceRequestMutableBuilder[Self <: SpotInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualBlockHourlyPrice(value: String): Self = StObject.set(x, "ActualBlockHourlyPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualBlockHourlyPriceUndefined: Self = StObject.set(x, "ActualBlockHourlyPrice", js.undefined)
    
    @scala.inline
    def setAvailabilityZoneGroup(value: String): Self = StObject.set(x, "AvailabilityZoneGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneGroupUndefined: Self = StObject.set(x, "AvailabilityZoneGroup", js.undefined)
    
    @scala.inline
    def setBlockDurationMinutes(value: Integer): Self = StObject.set(x, "BlockDurationMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDurationMinutesUndefined: Self = StObject.set(x, "BlockDurationMinutes", js.undefined)
    
    @scala.inline
    def setCreateTime(value: DateTime): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    @scala.inline
    def setFault(value: SpotInstanceStateFault): Self = StObject.set(x, "Fault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaultUndefined: Self = StObject.set(x, "Fault", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setInstanceInterruptionBehavior(value: InstanceInterruptionBehavior): Self = StObject.set(x, "InstanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceInterruptionBehaviorUndefined: Self = StObject.set(x, "InstanceInterruptionBehavior", js.undefined)
    
    @scala.inline
    def setLaunchGroup(value: String): Self = StObject.set(x, "LaunchGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchGroupUndefined: Self = StObject.set(x, "LaunchGroup", js.undefined)
    
    @scala.inline
    def setLaunchSpecification(value: LaunchSpecification): Self = StObject.set(x, "LaunchSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchSpecificationUndefined: Self = StObject.set(x, "LaunchSpecification", js.undefined)
    
    @scala.inline
    def setLaunchedAvailabilityZone(value: String): Self = StObject.set(x, "LaunchedAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchedAvailabilityZoneUndefined: Self = StObject.set(x, "LaunchedAvailabilityZone", js.undefined)
    
    @scala.inline
    def setProductDescription(value: RIProductDescription): Self = StObject.set(x, "ProductDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductDescriptionUndefined: Self = StObject.set(x, "ProductDescription", js.undefined)
    
    @scala.inline
    def setSpotInstanceRequestId(value: String): Self = StObject.set(x, "SpotInstanceRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotInstanceRequestIdUndefined: Self = StObject.set(x, "SpotInstanceRequestId", js.undefined)
    
    @scala.inline
    def setSpotPrice(value: String): Self = StObject.set(x, "SpotPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotPriceUndefined: Self = StObject.set(x, "SpotPrice", js.undefined)
    
    @scala.inline
    def setState(value: SpotInstanceState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setStatus(value: SpotInstanceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setType(value: SpotInstanceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
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
