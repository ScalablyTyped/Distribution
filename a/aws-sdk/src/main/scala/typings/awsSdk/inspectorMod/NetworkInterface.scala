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
  def apply(
    ipv6Addresses: Ipv6Addresses = null,
    networkInterfaceId: Text = null,
    privateDnsName: Text = null,
    privateIpAddress: Text = null,
    privateIpAddresses: PrivateIpAddresses = null,
    publicDnsName: Text = null,
    publicIp: Text = null,
    securityGroups: SecurityGroups = null,
    subnetId: Text = null,
    vpcId: Text = null
  ): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    if (ipv6Addresses != null) __obj.updateDynamic("ipv6Addresses")(ipv6Addresses.asInstanceOf[js.Any])
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId.asInstanceOf[js.Any])
    if (privateDnsName != null) __obj.updateDynamic("privateDnsName")(privateDnsName.asInstanceOf[js.Any])
    if (privateIpAddress != null) __obj.updateDynamic("privateIpAddress")(privateIpAddress.asInstanceOf[js.Any])
    if (privateIpAddresses != null) __obj.updateDynamic("privateIpAddresses")(privateIpAddresses.asInstanceOf[js.Any])
    if (publicDnsName != null) __obj.updateDynamic("publicDnsName")(publicDnsName.asInstanceOf[js.Any])
    if (publicIp != null) __obj.updateDynamic("publicIp")(publicIp.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterface]
  }
}

