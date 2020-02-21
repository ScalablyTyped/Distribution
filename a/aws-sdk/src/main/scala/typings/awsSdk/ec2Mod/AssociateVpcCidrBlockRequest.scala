package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateVpcCidrBlockRequest extends js.Object {
  /**
    * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of IPv6 addresses, or the size of the CIDR block.
    */
  var AmazonProvidedIpv6CidrBlock: js.UndefOr[Boolean] = js.native
  /**
    * An IPv4 CIDR block to associate with the VPC.
    */
  var CidrBlock: js.UndefOr[String] = js.native
  /**
    * An IPv6 CIDR block from the IPv6 address pool. You must also specify Ipv6Pool in the request. To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * The name of the location from which we advertise the IPV6 CIDR block. Use this parameter to limit the CiDR block to this location.  You must set AmazonProvidedIpv6CidrBlock to true to use this parameter.  You can have one IPv6 CIDR block association per network border group.
    */
  var Ipv6CidrBlockNetworkBorderGroup: js.UndefOr[String] = js.native
  /**
    * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
    */
  var Ipv6Pool: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: typings.awsSdk.ec2Mod.VpcId = js.native
}

object AssociateVpcCidrBlockRequest {
  @scala.inline
  def apply(
    VpcId: VpcId,
    AmazonProvidedIpv6CidrBlock: js.UndefOr[scala.Boolean] = js.undefined,
    CidrBlock: String = null,
    Ipv6CidrBlock: String = null,
    Ipv6CidrBlockNetworkBorderGroup: String = null,
    Ipv6Pool: String = null
  ): AssociateVpcCidrBlockRequest = {
    val __obj = js.Dynamic.literal(VpcId = VpcId.asInstanceOf[js.Any])
    if (!js.isUndefined(AmazonProvidedIpv6CidrBlock)) __obj.updateDynamic("AmazonProvidedIpv6CidrBlock")(AmazonProvidedIpv6CidrBlock.asInstanceOf[js.Any])
    if (CidrBlock != null) __obj.updateDynamic("CidrBlock")(CidrBlock.asInstanceOf[js.Any])
    if (Ipv6CidrBlock != null) __obj.updateDynamic("Ipv6CidrBlock")(Ipv6CidrBlock.asInstanceOf[js.Any])
    if (Ipv6CidrBlockNetworkBorderGroup != null) __obj.updateDynamic("Ipv6CidrBlockNetworkBorderGroup")(Ipv6CidrBlockNetworkBorderGroup.asInstanceOf[js.Any])
    if (Ipv6Pool != null) __obj.updateDynamic("Ipv6Pool")(Ipv6Pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateVpcCidrBlockRequest]
  }
}

