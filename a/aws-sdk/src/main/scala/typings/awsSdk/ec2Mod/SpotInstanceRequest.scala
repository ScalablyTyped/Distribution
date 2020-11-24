package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotInstanceRequest extends js.Object {
  
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
  implicit class SpotInstanceRequestOps[Self <: SpotInstanceRequest] (val x: Self) extends AnyVal {
    
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
    def setActualBlockHourlyPrice(value: String): Self = this.set("ActualBlockHourlyPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActualBlockHourlyPrice: Self = this.set("ActualBlockHourlyPrice", js.undefined)
    
    @scala.inline
    def setAvailabilityZoneGroup(value: String): Self = this.set("AvailabilityZoneGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZoneGroup: Self = this.set("AvailabilityZoneGroup", js.undefined)
    
    @scala.inline
    def setBlockDurationMinutes(value: Integer): Self = this.set("BlockDurationMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockDurationMinutes: Self = this.set("BlockDurationMinutes", js.undefined)
    
    @scala.inline
    def setCreateTime(value: DateTime): Self = this.set("CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("CreateTime", js.undefined)
    
    @scala.inline
    def setFault(value: SpotInstanceStateFault): Self = this.set("Fault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFault: Self = this.set("Fault", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setInstanceInterruptionBehavior(value: InstanceInterruptionBehavior): Self = this.set("InstanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceInterruptionBehavior: Self = this.set("InstanceInterruptionBehavior", js.undefined)
    
    @scala.inline
    def setLaunchGroup(value: String): Self = this.set("LaunchGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchGroup: Self = this.set("LaunchGroup", js.undefined)
    
    @scala.inline
    def setLaunchSpecification(value: LaunchSpecification): Self = this.set("LaunchSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchSpecification: Self = this.set("LaunchSpecification", js.undefined)
    
    @scala.inline
    def setLaunchedAvailabilityZone(value: String): Self = this.set("LaunchedAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchedAvailabilityZone: Self = this.set("LaunchedAvailabilityZone", js.undefined)
    
    @scala.inline
    def setProductDescription(value: RIProductDescription): Self = this.set("ProductDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductDescription: Self = this.set("ProductDescription", js.undefined)
    
    @scala.inline
    def setSpotInstanceRequestId(value: String): Self = this.set("SpotInstanceRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotInstanceRequestId: Self = this.set("SpotInstanceRequestId", js.undefined)
    
    @scala.inline
    def setSpotPrice(value: String): Self = this.set("SpotPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotPrice: Self = this.set("SpotPrice", js.undefined)
    
    @scala.inline
    def setState(value: SpotInstanceState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setStatus(value: SpotInstanceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setType(value: SpotInstanceType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setValidFrom(value: DateTime): Self = this.set("ValidFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidFrom: Self = this.set("ValidFrom", js.undefined)
    
    @scala.inline
    def setValidUntil(value: DateTime): Self = this.set("ValidUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidUntil: Self = this.set("ValidUntil", js.undefined)
  }
}
