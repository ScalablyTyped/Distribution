package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Host extends StObject {
  
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
  implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationTime(value: DateTime): Self = StObject.set(x, "AllocationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationTimeUndefined: Self = StObject.set(x, "AllocationTime", js.undefined)
    
    @scala.inline
    def setAllowsMultipleInstanceTypes(value: AllowsMultipleInstanceTypes): Self = StObject.set(x, "AllowsMultipleInstanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowsMultipleInstanceTypesUndefined: Self = StObject.set(x, "AllowsMultipleInstanceTypes", js.undefined)
    
    @scala.inline
    def setAutoPlacement(value: AutoPlacement): Self = StObject.set(x, "AutoPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlacementUndefined: Self = StObject.set(x, "AutoPlacement", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneId(value: String): Self = StObject.set(x, "AvailabilityZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "AvailabilityZoneId", js.undefined)
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setAvailableCapacity(value: AvailableCapacity): Self = StObject.set(x, "AvailableCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableCapacityUndefined: Self = StObject.set(x, "AvailableCapacity", js.undefined)
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setHostId(value: String): Self = StObject.set(x, "HostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostIdUndefined: Self = StObject.set(x, "HostId", js.undefined)
    
    @scala.inline
    def setHostProperties(value: HostProperties): Self = StObject.set(x, "HostProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPropertiesUndefined: Self = StObject.set(x, "HostProperties", js.undefined)
    
    @scala.inline
    def setHostRecovery(value: HostRecovery): Self = StObject.set(x, "HostRecovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostRecoveryUndefined: Self = StObject.set(x, "HostRecovery", js.undefined)
    
    @scala.inline
    def setHostReservationId(value: String): Self = StObject.set(x, "HostReservationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostReservationIdUndefined: Self = StObject.set(x, "HostReservationId", js.undefined)
    
    @scala.inline
    def setInstances(value: HostInstanceList): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: HostInstance*): Self = StObject.set(x, "Instances", js.Array(value :_*))
    
    @scala.inline
    def setMemberOfServiceLinkedResourceGroup(value: Boolean): Self = StObject.set(x, "MemberOfServiceLinkedResourceGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberOfServiceLinkedResourceGroupUndefined: Self = StObject.set(x, "MemberOfServiceLinkedResourceGroup", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setReleaseTime(value: DateTime): Self = StObject.set(x, "ReleaseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseTimeUndefined: Self = StObject.set(x, "ReleaseTime", js.undefined)
    
    @scala.inline
    def setState(value: AllocationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
