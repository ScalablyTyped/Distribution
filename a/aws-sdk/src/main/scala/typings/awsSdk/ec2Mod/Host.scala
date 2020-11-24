package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Host extends js.Object {
  
  /**
    * The time that the Dedicated Host was allocated.
    */
  var AllocationTime: js.UndefOr[DateTime] = js.native
  
  /**
    * Indicates whether the Dedicated Host supports multiple instance types of the same instance family, or a specific instance type only. one indicates that the Dedicated Host supports multiple instance types in the instance family. off indicates that the Dedicated Host supports a single instance type only.
    */
  var AllowsMultipleInstanceTypes: js.UndefOr[typings.awsSdk.ec2Mod.AllowsMultipleInstanceTypes] = js.native
  
  /**
    * Whether auto-placement is on or off.
    */
  var AutoPlacement: js.UndefOr[typings.awsSdk.ec2Mod.AutoPlacement] = js.native
  
  /**
    * The Availability Zone of the Dedicated Host.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Availability Zone in which the Dedicated Host is allocated.
    */
  var AvailabilityZoneId: js.UndefOr[String] = js.native
  
  /**
    * Information about the instances running on the Dedicated Host.
    */
  var AvailableCapacity: js.UndefOr[typings.awsSdk.ec2Mod.AvailableCapacity] = js.native
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Dedicated Host.
    */
  var HostId: js.UndefOr[String] = js.native
  
  /**
    * The hardware specifications of the Dedicated Host.
    */
  var HostProperties: js.UndefOr[typings.awsSdk.ec2Mod.HostProperties] = js.native
  
  /**
    * Indicates whether host recovery is enabled or disabled for the Dedicated Host.
    */
  var HostRecovery: js.UndefOr[typings.awsSdk.ec2Mod.HostRecovery] = js.native
  
  /**
    * The reservation ID of the Dedicated Host. This returns a null response if the Dedicated Host doesn't have an associated reservation.
    */
  var HostReservationId: js.UndefOr[String] = js.native
  
  /**
    * The IDs and instance type that are currently running on the Dedicated Host.
    */
  var Instances: js.UndefOr[HostInstanceList] = js.native
  
  /**
    * Indicates whether the Dedicated Host is in a host resource group. If memberOfServiceLinkedResourceGroup is true, the host is in a host resource group; otherwise, it is not.
    */
  var MemberOfServiceLinkedResourceGroup: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the AWS account that owns the Dedicated Host.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * The time that the Dedicated Host was released.
    */
  var ReleaseTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The Dedicated Host's state.
    */
  var State: js.UndefOr[AllocationState] = js.native
  
  /**
    * Any tags assigned to the Dedicated Host.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object Host {
  
  @scala.inline
  def apply(): Host = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Host]
  }
  
  @scala.inline
  implicit class HostOps[Self <: Host] (val x: Self) extends AnyVal {
    
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
    def setAllocationTime(value: DateTime): Self = this.set("AllocationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocationTime: Self = this.set("AllocationTime", js.undefined)
    
    @scala.inline
    def setAllowsMultipleInstanceTypes(value: AllowsMultipleInstanceTypes): Self = this.set("AllowsMultipleInstanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowsMultipleInstanceTypes: Self = this.set("AllowsMultipleInstanceTypes", js.undefined)
    
    @scala.inline
    def setAutoPlacement(value: AutoPlacement): Self = this.set("AutoPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPlacement: Self = this.set("AutoPlacement", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setAvailabilityZoneId(value: String): Self = this.set("AvailabilityZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZoneId: Self = this.set("AvailabilityZoneId", js.undefined)
    
    @scala.inline
    def setAvailableCapacity(value: AvailableCapacity): Self = this.set("AvailableCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableCapacity: Self = this.set("AvailableCapacity", js.undefined)
    
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setHostId(value: String): Self = this.set("HostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostId: Self = this.set("HostId", js.undefined)
    
    @scala.inline
    def setHostProperties(value: HostProperties): Self = this.set("HostProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostProperties: Self = this.set("HostProperties", js.undefined)
    
    @scala.inline
    def setHostRecovery(value: HostRecovery): Self = this.set("HostRecovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostRecovery: Self = this.set("HostRecovery", js.undefined)
    
    @scala.inline
    def setHostReservationId(value: String): Self = this.set("HostReservationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostReservationId: Self = this.set("HostReservationId", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: HostInstance*): Self = this.set("Instances", js.Array(value :_*))
    
    @scala.inline
    def setInstances(value: HostInstanceList): Self = this.set("Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstances: Self = this.set("Instances", js.undefined)
    
    @scala.inline
    def setMemberOfServiceLinkedResourceGroup(value: Boolean): Self = this.set("MemberOfServiceLinkedResourceGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberOfServiceLinkedResourceGroup: Self = this.set("MemberOfServiceLinkedResourceGroup", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    
    @scala.inline
    def setReleaseTime(value: DateTime): Self = this.set("ReleaseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseTime: Self = this.set("ReleaseTime", js.undefined)
    
    @scala.inline
    def setState(value: AllocationState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
