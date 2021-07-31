package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryConnectSettingsDescription extends StObject {
  
  /**
    * A list of the Availability Zones that the directory is in.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.directoryserviceMod.AvailabilityZones] = js.undefined
  
  /**
    * The IP addresses of the AD Connector servers.
    */
  var ConnectIps: js.UndefOr[IpAddrs] = js.undefined
  
  /**
    * The user name of the service account in the on-premises directory.
    */
  var CustomerUserName: js.UndefOr[UserName] = js.undefined
  
  /**
    * The security group identifier for the AD Connector directory.
    */
  var SecurityGroupId: js.UndefOr[typings.awsSdk.directoryserviceMod.SecurityGroupId] = js.undefined
  
  /**
    * A list of subnet identifiers in the VPC that the AD Connector is in.
    */
  var SubnetIds: js.UndefOr[typings.awsSdk.directoryserviceMod.SubnetIds] = js.undefined
  
  /**
    * The identifier of the VPC that the AD Connector is in.
    */
  var VpcId: js.UndefOr[typings.awsSdk.directoryserviceMod.VpcId] = js.undefined
}
object DirectoryConnectSettingsDescription {
  
  @scala.inline
  def apply(): DirectoryConnectSettingsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryConnectSettingsDescription]
  }
  
  @scala.inline
  implicit class DirectoryConnectSettingsDescriptionMutableBuilder[Self <: DirectoryConnectSettingsDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setConnectIps(value: IpAddrs): Self = StObject.set(x, "ConnectIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectIpsUndefined: Self = StObject.set(x, "ConnectIps", js.undefined)
    
    @scala.inline
    def setConnectIpsVarargs(value: IpAddr*): Self = StObject.set(x, "ConnectIps", js.Array(value :_*))
    
    @scala.inline
    def setCustomerUserName(value: UserName): Self = StObject.set(x, "CustomerUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUserNameUndefined: Self = StObject.set(x, "CustomerUserName", js.undefined)
    
    @scala.inline
    def setSecurityGroupId(value: SecurityGroupId): Self = StObject.set(x, "SecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdUndefined: Self = StObject.set(x, "SecurityGroupId", js.undefined)
    
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
