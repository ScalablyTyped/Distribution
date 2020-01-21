package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NatGatewayAddress extends js.Object {
  /**
    * The allocation ID of the Elastic IP address that's associated with the NAT gateway.
    */
  var AllocationId: js.UndefOr[String] = js.native
  /**
    * The ID of the network interface associated with the NAT gateway.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The private IP address associated with the Elastic IP address.
    */
  var PrivateIp: js.UndefOr[String] = js.native
  /**
    * The Elastic IP address associated with the NAT gateway.
    */
  var PublicIp: js.UndefOr[String] = js.native
}

object NatGatewayAddress {
  @scala.inline
  def apply(
    AllocationId: String = null,
    NetworkInterfaceId: String = null,
    PrivateIp: String = null,
    PublicIp: String = null
  ): NatGatewayAddress = {
    val __obj = js.Dynamic.literal()
    if (AllocationId != null) __obj.updateDynamic("AllocationId")(AllocationId.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (PrivateIp != null) __obj.updateDynamic("PrivateIp")(PrivateIp.asInstanceOf[js.Any])
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[NatGatewayAddress]
  }
}

