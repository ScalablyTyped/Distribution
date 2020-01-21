package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcRequest extends js.Object {
  /**
    * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of IP addresses, or the size of the CIDR block.
    */
  var AmazonProvidedIpv6CidrBlock: js.UndefOr[Boolean] = js.native
  /**
    * The IPv4 network range for the VPC, in CIDR notation. For example, 10.0.0.0/16.
    */
  var CidrBlock: String = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The tenancy options for instances launched into the VPC. For default, instances are launched with shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For dedicated, instances are launched as dedicated tenancy instances by default. You can only launch instances with a tenancy of dedicated or host into a dedicated tenancy VPC.   Important: The host value cannot be used with this parameter. Use the default or dedicated values only. Default: default 
    */
  var InstanceTenancy: js.UndefOr[Tenancy] = js.native
  /**
    * The name of the location from which we advertise the IPV6 CIDR block. Use this parameter to limit the address to this location.  You must set AmazonProvidedIpv6CidrBlock to true to use this parameter.
    */
  var Ipv6CidrBlockNetworkBorderGroup: js.UndefOr[String] = js.native
}

object CreateVpcRequest {
  @scala.inline
  def apply(
    CidrBlock: String,
    AmazonProvidedIpv6CidrBlock: js.UndefOr[scala.Boolean] = js.undefined,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    InstanceTenancy: Tenancy = null,
    Ipv6CidrBlockNetworkBorderGroup: String = null
  ): CreateVpcRequest = {
    val __obj = js.Dynamic.literal(CidrBlock = CidrBlock.asInstanceOf[js.Any])
    if (!js.isUndefined(AmazonProvidedIpv6CidrBlock)) __obj.updateDynamic("AmazonProvidedIpv6CidrBlock")(AmazonProvidedIpv6CidrBlock.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (InstanceTenancy != null) __obj.updateDynamic("InstanceTenancy")(InstanceTenancy.asInstanceOf[js.Any])
    if (Ipv6CidrBlockNetworkBorderGroup != null) __obj.updateDynamic("Ipv6CidrBlockNetworkBorderGroup")(Ipv6CidrBlockNetworkBorderGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcRequest]
  }
}

