package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainController extends StObject {
  
  /**
    * The Availability Zone where the domain controller is located.
    */
  var AvailabilityZone: js.UndefOr[typings.awsSdk.directoryserviceMod.AvailabilityZone] = js.native
  
  /**
    * Identifier of the directory where the domain controller resides.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.native
  
  /**
    * The IP address of the domain controller.
    */
  var DnsIpAddr: js.UndefOr[IpAddr] = js.native
  
  /**
    * Identifies a specific domain controller in the directory.
    */
  var DomainControllerId: js.UndefOr[typings.awsSdk.directoryserviceMod.DomainControllerId] = js.native
  
  /**
    * Specifies when the domain controller was created.
    */
  var LaunchTime: js.UndefOr[typings.awsSdk.directoryserviceMod.LaunchTime] = js.native
  
  /**
    * The status of the domain controller.
    */
  var Status: js.UndefOr[DomainControllerStatus] = js.native
  
  /**
    * The date and time that the status was last updated.
    */
  var StatusLastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime] = js.native
  
  /**
    * A description of the domain controller state.
    */
  var StatusReason: js.UndefOr[DomainControllerStatusReason] = js.native
  
  /**
    * Identifier of the subnet in the VPC that contains the domain controller.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.directoryserviceMod.SubnetId] = js.native
  
  /**
    * The identifier of the VPC that contains the domain controller.
    */
  var VpcId: js.UndefOr[typings.awsSdk.directoryserviceMod.VpcId] = js.native
}
object DomainController {
  
  @scala.inline
  def apply(): DomainController = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainController]
  }
  
  @scala.inline
  implicit class DomainControllerMutableBuilder[Self <: DomainController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: AvailabilityZone): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    @scala.inline
    def setDnsIpAddr(value: IpAddr): Self = StObject.set(x, "DnsIpAddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsIpAddrUndefined: Self = StObject.set(x, "DnsIpAddr", js.undefined)
    
    @scala.inline
    def setDomainControllerId(value: DomainControllerId): Self = StObject.set(x, "DomainControllerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainControllerIdUndefined: Self = StObject.set(x, "DomainControllerId", js.undefined)
    
    @scala.inline
    def setLaunchTime(value: LaunchTime): Self = StObject.set(x, "LaunchTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTimeUndefined: Self = StObject.set(x, "LaunchTime", js.undefined)
    
    @scala.inline
    def setStatus(value: DomainControllerStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusLastUpdatedDateTime(value: LastUpdatedDateTime): Self = StObject.set(x, "StatusLastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusLastUpdatedDateTimeUndefined: Self = StObject.set(x, "StatusLastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setStatusReason(value: DomainControllerStatusReason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
