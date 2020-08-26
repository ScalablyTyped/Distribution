package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ipv6CidrBlockAssociation extends js.Object {
  /**
    * The association ID for the IPv6 CIDR block.
    */
  var AssociationId: js.UndefOr[NonEmptyString] = js.native
  /**
    * Information about the state of the CIDR block.
    */
  var CidrBlockState: js.UndefOr[NonEmptyString] = js.native
  /**
    * The IPv6 CIDR block.
    */
  var Ipv6CidrBlock: js.UndefOr[NonEmptyString] = js.native
}

object Ipv6CidrBlockAssociation {
  @scala.inline
  def apply(): Ipv6CidrBlockAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipv6CidrBlockAssociation]
  }
  @scala.inline
  implicit class Ipv6CidrBlockAssociationOps[Self <: Ipv6CidrBlockAssociation] (val x: Self) extends AnyVal {
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
    def setAssociationId(value: NonEmptyString): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationId: Self = this.set("AssociationId", js.undefined)
    @scala.inline
    def setCidrBlockState(value: NonEmptyString): Self = this.set("CidrBlockState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrBlockState: Self = this.set("CidrBlockState", js.undefined)
    @scala.inline
    def setIpv6CidrBlock(value: NonEmptyString): Self = this.set("Ipv6CidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6CidrBlock: Self = this.set("Ipv6CidrBlock", js.undefined)
  }
  
}

