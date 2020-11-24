package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCapacityReservationRequest extends js.Object {
  
  /**
    * The Availability Zone in which to create the Capacity Reservation.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Availability Zone in which to create the Capacity Reservation.
    */
  var AvailabilityZoneId: js.UndefOr[String] = js.native
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the Capacity Reservation supports EBS-optimized instances. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS- optimized instance.
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.native
  
  /**
    * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. The Capacity Reservation's state changes to expired when it reaches its end date and time. You must provide an EndDate value if EndDateType is limited. Omit EndDate if EndDateType is unlimited. If the EndDateType is limited, the Capacity Reservation is cancelled within an hour from the specified time. For example, if you specify 5/31/2019, 13:30:55, the Capacity Reservation is guaranteed to end between 13:30:55 and 14:30:55 on 5/31/2019.
    */
  var EndDate: js.UndefOr[DateTime] = js.native
  
  /**
    * Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the following end types:    unlimited - The Capacity Reservation remains active until you explicitly cancel it. Do not provide an EndDate if the EndDateType is unlimited.    limited - The Capacity Reservation expires automatically at a specified date and time. You must provide an EndDate value if the EndDateType value is limited.  
    */
  var EndDateType: js.UndefOr[typings.awsSdk.ec2Mod.EndDateType] = js.native
  
  /**
    * Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
    */
  var EphemeralStorage: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of instances for which to reserve capacity.
    */
  var InstanceCount: Integer = js.native
  
  /**
    * Indicates the type of instance launches that the Capacity Reservation accepts. The options include:    open - The Capacity Reservation automatically matches all instances that have matching attributes (instance type, platform, and Availability Zone). Instances that have matching attributes run in the Capacity Reservation automatically without specifying any additional parameters.    targeted - The Capacity Reservation only accepts instances that have matching attributes (instance type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This ensures that only permitted instances can use the reserved capacity.    Default: open 
    */
  var InstanceMatchCriteria: js.UndefOr[typings.awsSdk.ec2Mod.InstanceMatchCriteria] = js.native
  
  /**
    * The type of operating system for which to reserve capacity.
    */
  var InstancePlatform: CapacityReservationInstancePlatform = js.native
  
  /**
    * The instance type for which to reserve capacity. For more information, see Instance Types in the Amazon Elastic Compute Cloud User Guide.
    */
  var InstanceType: String = js.native
  
  /**
    * The tags to apply to the Capacity Reservation during launch.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  
  /**
    * Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of the following tenancy settings:    default - The Capacity Reservation is created on hardware that is shared with other AWS accounts.    dedicated - The Capacity Reservation is created on single-tenant hardware that is dedicated to a single AWS account.  
    */
  var Tenancy: js.UndefOr[CapacityReservationTenancy] = js.native
}
object CreateCapacityReservationRequest {
  
  @scala.inline
  def apply(
    InstanceCount: Integer,
    InstancePlatform: CapacityReservationInstancePlatform,
    InstanceType: String
  ): CreateCapacityReservationRequest = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], InstancePlatform = InstancePlatform.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCapacityReservationRequest]
  }
  
  @scala.inline
  implicit class CreateCapacityReservationRequestOps[Self <: CreateCapacityReservationRequest] (val x: Self) extends AnyVal {
    
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
    def setInstanceCount(value: Integer): Self = this.set("InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancePlatform(value: CapacityReservationInstancePlatform): Self = this.set("InstancePlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: String): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setAvailabilityZoneId(value: String): Self = this.set("AvailabilityZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZoneId: Self = this.set("AvailabilityZoneId", js.undefined)
    
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setEbsOptimized(value: Boolean): Self = this.set("EbsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsOptimized: Self = this.set("EbsOptimized", js.undefined)
    
    @scala.inline
    def setEndDate(value: DateTime): Self = this.set("EndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("EndDate", js.undefined)
    
    @scala.inline
    def setEndDateType(value: EndDateType): Self = this.set("EndDateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateType: Self = this.set("EndDateType", js.undefined)
    
    @scala.inline
    def setEphemeralStorage(value: Boolean): Self = this.set("EphemeralStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEphemeralStorage: Self = this.set("EphemeralStorage", js.undefined)
    
    @scala.inline
    def setInstanceMatchCriteria(value: InstanceMatchCriteria): Self = this.set("InstanceMatchCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceMatchCriteria: Self = this.set("InstanceMatchCriteria", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
    
    @scala.inline
    def setTenancy(value: CapacityReservationTenancy): Self = this.set("Tenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenancy: Self = this.set("Tenancy", js.undefined)
  }
}
