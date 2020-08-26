package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterface extends js.Object {
  /**
    * A list of IPv6 addresses for the EC2 instance.
    */
  var Ipv6Addresses: js.UndefOr[typings.awsSdk.guarddutyMod.Ipv6Addresses] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The private DNS name of the EC2 instance.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * The private IP address of the EC2 instance.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  /**
    * Other private IP address information of the EC2 instance.
    */
  var PrivateIpAddresses: js.UndefOr[typings.awsSdk.guarddutyMod.PrivateIpAddresses] = js.native
  /**
    * The public DNS name of the EC2 instance.
    */
  var PublicDnsName: js.UndefOr[String] = js.native
  /**
    * The public IP address of the EC2 instance.
    */
  var PublicIp: js.UndefOr[String] = js.native
  /**
    * The security groups associated with the EC2 instance.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.guarddutyMod.SecurityGroups] = js.native
  /**
    * The subnet ID of the EC2 instance.
    */
  var SubnetId: js.UndefOr[String] = js.native
  /**
    * The VPC ID of the EC2 instance.
    */
  var VpcId: js.UndefOr[String] = js.native
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIpv6AddressesVarargs(value: String*): Self = this.set("Ipv6Addresses", js.Array(value :_*))
    @scala.inline
    def setIpv6Addresses(value: Ipv6Addresses): Self = this.set("Ipv6Addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6Addresses: Self = this.set("Ipv6Addresses", js.undefined)
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
    @scala.inline
    def setPrivateDnsName(value: String): Self = this.set("PrivateDnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateDnsName: Self = this.set("PrivateDnsName", js.undefined)
    @scala.inline
    def setPrivateIpAddress(value: String): Self = this.set("PrivateIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("PrivateIpAddress", js.undefined)
    @scala.inline
    def setPrivateIpAddressesVarargs(value: PrivateIpAddressDetails*): Self = this.set("PrivateIpAddresses", js.Array(value :_*))
    @scala.inline
    def setPrivateIpAddresses(value: PrivateIpAddresses): Self = this.set("PrivateIpAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddresses: Self = this.set("PrivateIpAddresses", js.undefined)
    @scala.inline
    def setPublicDnsName(value: String): Self = this.set("PublicDnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicDnsName: Self = this.set("PublicDnsName", js.undefined)
    @scala.inline
    def setPublicIp(value: String): Self = this.set("PublicIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicIp: Self = this.set("PublicIp", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroup*): Self = this.set("SecurityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
    @scala.inline
    def setSubnetId(value: String): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

