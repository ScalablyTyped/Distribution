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
  var Ipv6Pool: js.UndefOr[Ipv6PoolEc2Id] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: typings.awsSdk.ec2Mod.VpcId = js.native
}

object AssociateVpcCidrBlockRequest {
  @scala.inline
  def apply(VpcId: VpcId): AssociateVpcCidrBlockRequest = {
    val __obj = js.Dynamic.literal(VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateVpcCidrBlockRequest]
  }
  @scala.inline
  implicit class AssociateVpcCidrBlockRequestOps[Self <: AssociateVpcCidrBlockRequest] (val x: Self) extends AnyVal {
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
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmazonProvidedIpv6CidrBlock(value: Boolean): Self = this.set("AmazonProvidedIpv6CidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmazonProvidedIpv6CidrBlock: Self = this.set("AmazonProvidedIpv6CidrBlock", js.undefined)
    @scala.inline
    def setCidrBlock(value: String): Self = this.set("CidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrBlock: Self = this.set("CidrBlock", js.undefined)
    @scala.inline
    def setIpv6CidrBlock(value: String): Self = this.set("Ipv6CidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6CidrBlock: Self = this.set("Ipv6CidrBlock", js.undefined)
    @scala.inline
    def setIpv6CidrBlockNetworkBorderGroup(value: String): Self = this.set("Ipv6CidrBlockNetworkBorderGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6CidrBlockNetworkBorderGroup: Self = this.set("Ipv6CidrBlockNetworkBorderGroup", js.undefined)
    @scala.inline
    def setIpv6Pool(value: Ipv6PoolEc2Id): Self = this.set("Ipv6Pool", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6Pool: Self = this.set("Ipv6Pool", js.undefined)
  }
  
}

