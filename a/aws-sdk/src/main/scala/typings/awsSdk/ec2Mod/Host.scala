package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Host extends StObject {
  
  /**
    * The time that the Dedicated Host was allocated.
    */
  var AllocationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether the Dedicated Host supports multiple instance types of the same instance family. If the value is on, the Dedicated Host supports multiple instance types in the instance family. If the value is off, the Dedicated Host supports a single instance type only.
    */
  var AllowsMultipleInstanceTypes: js.UndefOr[typings.awsSdk.ec2Mod.AllowsMultipleInstanceTypes] = js.undefined
  
  /**
    * Whether auto-placement is on or off.
    */
  var AutoPlacement: js.UndefOr[typings.awsSdk.ec2Mod.AutoPlacement] = js.undefined
  
  /**
    * The Availability Zone of the Dedicated Host.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Availability Zone in which the Dedicated Host is allocated.
    */
  var AvailabilityZoneId: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the instances running on the Dedicated Host.
    */
  var AvailableCapacity: js.UndefOr[typings.awsSdk.ec2Mod.AvailableCapacity] = js.undefined
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Dedicated Host.
    */
  var HostId: js.UndefOr[String] = js.undefined
  
  /**
    * The hardware specifications of the Dedicated Host.
    */
  var HostProperties: js.UndefOr[typings.awsSdk.ec2Mod.HostProperties] = js.undefined
  
  /**
    * Indicates whether host recovery is enabled or disabled for the Dedicated Host.
    */
  var HostRecovery: js.UndefOr[typings.awsSdk.ec2Mod.HostRecovery] = js.undefined
  
  /**
    * The reservation ID of the Dedicated Host. This returns a null response if the Dedicated Host doesn't have an associated reservation.
    */
  var HostReservationId: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs and instance type that are currently running on the Dedicated Host.
    */
  var Instances: js.UndefOr[HostInstanceList] = js.undefined
  
  /**
    * Indicates whether the Dedicated Host is in a host resource group. If memberOfServiceLinkedResourceGroup is true, the host is in a host resource group; otherwise, it is not.
    */
  var MemberOfServiceLinkedResourceGroup: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Web Services Outpost on which the Dedicated Host is allocated.
    */
  var OutpostArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the Dedicated Host.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The time that the Dedicated Host was released.
    */
  var ReleaseTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Dedicated Host's state.
    */
  var State: js.UndefOr[AllocationState] = js.undefined
  
  /**
    * Any tags assigned to the Dedicated Host.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object Host {
  
  inline def apply(): Host = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Host]
  }
  
  extension [Self <: Host](x: Self) {
    
    inline def setAllocationTime(value: js.Date): Self = StObject.set(x, "AllocationTime", value.asInstanceOf[js.Any])
    
    inline def setAllocationTimeUndefined: Self = StObject.set(x, "AllocationTime", js.undefined)
    
    inline def setAllowsMultipleInstanceTypes(value: AllowsMultipleInstanceTypes): Self = StObject.set(x, "AllowsMultipleInstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setAllowsMultipleInstanceTypesUndefined: Self = StObject.set(x, "AllowsMultipleInstanceTypes", js.undefined)
    
    inline def setAutoPlacement(value: AutoPlacement): Self = StObject.set(x, "AutoPlacement", value.asInstanceOf[js.Any])
    
    inline def setAutoPlacementUndefined: Self = StObject.set(x, "AutoPlacement", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneId(value: String): Self = StObject.set(x, "AvailabilityZoneId", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "AvailabilityZoneId", js.undefined)
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setAvailableCapacity(value: AvailableCapacity): Self = StObject.set(x, "AvailableCapacity", value.asInstanceOf[js.Any])
    
    inline def setAvailableCapacityUndefined: Self = StObject.set(x, "AvailableCapacity", js.undefined)
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setHostId(value: String): Self = StObject.set(x, "HostId", value.asInstanceOf[js.Any])
    
    inline def setHostIdUndefined: Self = StObject.set(x, "HostId", js.undefined)
    
    inline def setHostProperties(value: HostProperties): Self = StObject.set(x, "HostProperties", value.asInstanceOf[js.Any])
    
    inline def setHostPropertiesUndefined: Self = StObject.set(x, "HostProperties", js.undefined)
    
    inline def setHostRecovery(value: HostRecovery): Self = StObject.set(x, "HostRecovery", value.asInstanceOf[js.Any])
    
    inline def setHostRecoveryUndefined: Self = StObject.set(x, "HostRecovery", js.undefined)
    
    inline def setHostReservationId(value: String): Self = StObject.set(x, "HostReservationId", value.asInstanceOf[js.Any])
    
    inline def setHostReservationIdUndefined: Self = StObject.set(x, "HostReservationId", js.undefined)
    
    inline def setInstances(value: HostInstanceList): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: HostInstance*): Self = StObject.set(x, "Instances", js.Array(value*))
    
    inline def setMemberOfServiceLinkedResourceGroup(value: Boolean): Self = StObject.set(x, "MemberOfServiceLinkedResourceGroup", value.asInstanceOf[js.Any])
    
    inline def setMemberOfServiceLinkedResourceGroupUndefined: Self = StObject.set(x, "MemberOfServiceLinkedResourceGroup", js.undefined)
    
    inline def setOutpostArn(value: String): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    inline def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setReleaseTime(value: js.Date): Self = StObject.set(x, "ReleaseTime", value.asInstanceOf[js.Any])
    
    inline def setReleaseTimeUndefined: Self = StObject.set(x, "ReleaseTime", js.undefined)
    
    inline def setState(value: AllocationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
