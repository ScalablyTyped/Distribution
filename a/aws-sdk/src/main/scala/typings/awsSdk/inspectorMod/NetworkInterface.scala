package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterface extends js.Object {
  /**
    * The IP addresses associated with the network interface.
    */
  var ipv6Addresses: js.UndefOr[Ipv6Addresses] = js.native
  /**
    * The ID of the network interface.
    */
  var networkInterfaceId: js.UndefOr[Text] = js.native
  /**
    * The name of a private DNS associated with the network interface.
    */
  var privateDnsName: js.UndefOr[Text] = js.native
  /**
    * The private IP address associated with the network interface.
    */
  var privateIpAddress: js.UndefOr[Text] = js.native
  /**
    * A list of the private IP addresses associated with the network interface. Includes the privateDnsName and privateIpAddress.
    */
  var privateIpAddresses: js.UndefOr[PrivateIpAddresses] = js.native
  /**
    * The name of a public DNS associated with the network interface.
    */
  var publicDnsName: js.UndefOr[Text] = js.native
  /**
    * The public IP address from which the network interface is reachable.
    */
  var publicIp: js.UndefOr[Text] = js.native
  /**
    * A list of the security groups associated with the network interface. Includes the groupId and groupName.
    */
  var securityGroups: js.UndefOr[SecurityGroups] = js.native
  /**
    * The ID of a subnet associated with the network interface.
    */
  var subnetId: js.UndefOr[Text] = js.native
  /**
    * The ID of a VPC associated with the network interface.
    */
  var vpcId: js.UndefOr[Text] = js.native
}

object NetworkInterface {
  @scala.inline
  def apply(): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterface]
  }
  @scala.inline
  implicit class NetworkInterfaceOps[Self <: NetworkInterface] (val x: Self) extends AnyVal {
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
    def setIpv6AddressesVarargs(value: Text*): Self = this.set("ipv6Addresses", js.Array(value :_*))
    @scala.inline
    def setIpv6Addresses(value: Ipv6Addresses): Self = this.set("ipv6Addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6Addresses: Self = this.set("ipv6Addresses", js.undefined)
    @scala.inline
    def setNetworkInterfaceId(value: Text): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("networkInterfaceId", js.undefined)
    @scala.inline
    def setPrivateDnsName(value: Text): Self = this.set("privateDnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateDnsName: Self = this.set("privateDnsName", js.undefined)
    @scala.inline
    def setPrivateIpAddress(value: Text): Self = this.set("privateIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("privateIpAddress", js.undefined)
    @scala.inline
    def setPrivateIpAddressesVarargs(value: PrivateIp*): Self = this.set("privateIpAddresses", js.Array(value :_*))
    @scala.inline
    def setPrivateIpAddresses(value: PrivateIpAddresses): Self = this.set("privateIpAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddresses: Self = this.set("privateIpAddresses", js.undefined)
    @scala.inline
    def setPublicDnsName(value: Text): Self = this.set("publicDnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicDnsName: Self = this.set("publicDnsName", js.undefined)
    @scala.inline
    def setPublicIp(value: Text): Self = this.set("publicIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicIp: Self = this.set("publicIp", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroup*): Self = this.set("securityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("securityGroups", js.undefined)
    @scala.inline
    def setSubnetId(value: Text): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
    @scala.inline
    def setVpcId(value: Text): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
  
}

