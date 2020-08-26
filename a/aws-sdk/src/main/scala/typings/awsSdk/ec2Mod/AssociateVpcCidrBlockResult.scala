package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateVpcCidrBlockResult extends js.Object {
  /**
    * Information about the IPv4 CIDR block association.
    */
  var CidrBlockAssociation: js.UndefOr[VpcCidrBlockAssociation] = js.native
  /**
    * Information about the IPv6 CIDR block association.
    */
  var Ipv6CidrBlockAssociation: js.UndefOr[VpcIpv6CidrBlockAssociation] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object AssociateVpcCidrBlockResult {
  @scala.inline
  def apply(): AssociateVpcCidrBlockResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateVpcCidrBlockResult]
  }
  @scala.inline
  implicit class AssociateVpcCidrBlockResultOps[Self <: AssociateVpcCidrBlockResult] (val x: Self) extends AnyVal {
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
    def setCidrBlockAssociation(value: VpcCidrBlockAssociation): Self = this.set("CidrBlockAssociation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrBlockAssociation: Self = this.set("CidrBlockAssociation", js.undefined)
    @scala.inline
    def setIpv6CidrBlockAssociation(value: VpcIpv6CidrBlockAssociation): Self = this.set("Ipv6CidrBlockAssociation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6CidrBlockAssociation: Self = this.set("Ipv6CidrBlockAssociation", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

