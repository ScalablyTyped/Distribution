package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vpc extends js.Object {
  /**
    * The primary IPv4 CIDR block for the VPC.
    */
  var CidrBlock: js.UndefOr[String] = js.native
  /**
    * Information about the IPv4 CIDR blocks associated with the VPC.
    */
  var CidrBlockAssociationSet: js.UndefOr[VpcCidrBlockAssociationSet] = js.native
  /**
    * The ID of the set of DHCP options you've associated with the VPC (or default if the default options are associated with the VPC).
    */
  var DhcpOptionsId: js.UndefOr[String] = js.native
  /**
    * The allowed tenancy of instances launched into the VPC.
    */
  var InstanceTenancy: js.UndefOr[Tenancy] = js.native
  /**
    * Information about the IPv6 CIDR blocks associated with the VPC.
    */
  var Ipv6CidrBlockAssociationSet: js.UndefOr[VpcIpv6CidrBlockAssociationSet] = js.native
  /**
    * Indicates whether the VPC is the default VPC.
    */
  var IsDefault: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the AWS account that owns the VPC.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The current state of the VPC.
    */
  var State: js.UndefOr[VpcState] = js.native
  /**
    * Any tags assigned to the VPC.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object Vpc {
  @scala.inline
  def apply(): Vpc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vpc]
  }
  @scala.inline
  implicit class VpcOps[Self <: Vpc] (val x: Self) extends AnyVal {
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
    def setCidrBlock(value: String): Self = this.set("CidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrBlock: Self = this.set("CidrBlock", js.undefined)
    @scala.inline
    def setCidrBlockAssociationSetVarargs(value: VpcCidrBlockAssociation*): Self = this.set("CidrBlockAssociationSet", js.Array(value :_*))
    @scala.inline
    def setCidrBlockAssociationSet(value: VpcCidrBlockAssociationSet): Self = this.set("CidrBlockAssociationSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrBlockAssociationSet: Self = this.set("CidrBlockAssociationSet", js.undefined)
    @scala.inline
    def setDhcpOptionsId(value: String): Self = this.set("DhcpOptionsId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDhcpOptionsId: Self = this.set("DhcpOptionsId", js.undefined)
    @scala.inline
    def setInstanceTenancy(value: Tenancy): Self = this.set("InstanceTenancy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceTenancy: Self = this.set("InstanceTenancy", js.undefined)
    @scala.inline
    def setIpv6CidrBlockAssociationSetVarargs(value: VpcIpv6CidrBlockAssociation*): Self = this.set("Ipv6CidrBlockAssociationSet", js.Array(value :_*))
    @scala.inline
    def setIpv6CidrBlockAssociationSet(value: VpcIpv6CidrBlockAssociationSet): Self = this.set("Ipv6CidrBlockAssociationSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6CidrBlockAssociationSet: Self = this.set("Ipv6CidrBlockAssociationSet", js.undefined)
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("IsDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefault: Self = this.set("IsDefault", js.undefined)
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    @scala.inline
    def setState(value: VpcState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

