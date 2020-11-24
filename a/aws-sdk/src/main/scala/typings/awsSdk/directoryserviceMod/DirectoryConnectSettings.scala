package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectoryConnectSettings extends js.Object {
  
  /**
    * A list of one or more IP addresses of DNS servers or domain controllers in the on-premises directory.
    */
  var CustomerDnsIps: DnsIpAddrs = js.native
  
  /**
    * The user name of an account in the on-premises directory that is used to connect to the directory. This account must have the following permissions:   Read users and groups   Create computer objects   Join computers to the domain  
    */
  var CustomerUserName: UserName = js.native
  
  /**
    * A list of subnet identifiers in the VPC in which the AD Connector is created.
    */
  var SubnetIds: typings.awsSdk.directoryserviceMod.SubnetIds = js.native
  
  /**
    * The identifier of the VPC in which the AD Connector is created.
    */
  var VpcId: typings.awsSdk.directoryserviceMod.VpcId = js.native
}
object DirectoryConnectSettings {
  
  @scala.inline
  def apply(CustomerDnsIps: DnsIpAddrs, CustomerUserName: UserName, SubnetIds: SubnetIds, VpcId: VpcId): DirectoryConnectSettings = {
    val __obj = js.Dynamic.literal(CustomerDnsIps = CustomerDnsIps.asInstanceOf[js.Any], CustomerUserName = CustomerUserName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryConnectSettings]
  }
  
  @scala.inline
  implicit class DirectoryConnectSettingsOps[Self <: DirectoryConnectSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomerDnsIpsVarargs(value: IpAddr*): Self = this.set("CustomerDnsIps", js.Array(value :_*))
    
    @scala.inline
    def setCustomerDnsIps(value: DnsIpAddrs): Self = this.set("CustomerDnsIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUserName(value: UserName): Self = this.set("CustomerUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = this.set("SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
  }
}
