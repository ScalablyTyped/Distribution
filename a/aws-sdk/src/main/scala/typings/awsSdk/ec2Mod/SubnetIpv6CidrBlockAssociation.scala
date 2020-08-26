package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetIpv6CidrBlockAssociation extends js.Object {
  /**
    * The association ID for the CIDR block.
    */
  var AssociationId: js.UndefOr[String] = js.native
  /**
    * The IPv6 CIDR block.
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * Information about the state of the CIDR block.
    */
  var Ipv6CidrBlockState: js.UndefOr[SubnetCidrBlockState] = js.native
}

object SubnetIpv6CidrBlockAssociation {
  @scala.inline
  def apply(): SubnetIpv6CidrBlockAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetIpv6CidrBlockAssociation]
  }
  @scala.inline
  implicit class SubnetIpv6CidrBlockAssociationOps[Self <: SubnetIpv6CidrBlockAssociation] (val x: Self) extends AnyVal {
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
    def setAssociationId(value: String): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationId: Self = this.set("AssociationId", js.undefined)
    @scala.inline
    def setIpv6CidrBlock(value: String): Self = this.set("Ipv6CidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6CidrBlock: Self = this.set("Ipv6CidrBlock", js.undefined)
    @scala.inline
    def setIpv6CidrBlockState(value: SubnetCidrBlockState): Self = this.set("Ipv6CidrBlockState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6CidrBlockState: Self = this.set("Ipv6CidrBlockState", js.undefined)
  }
  
}

