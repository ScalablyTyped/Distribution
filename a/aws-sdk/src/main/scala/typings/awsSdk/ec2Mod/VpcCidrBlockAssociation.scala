package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcCidrBlockAssociation extends js.Object {
  /**
    * The association ID for the IPv4 CIDR block.
    */
  var AssociationId: js.UndefOr[String] = js.native
  /**
    * The IPv4 CIDR block.
    */
  var CidrBlock: js.UndefOr[String] = js.native
  /**
    * Information about the state of the CIDR block.
    */
  var CidrBlockState: js.UndefOr[VpcCidrBlockState] = js.native
}

object VpcCidrBlockAssociation {
  @scala.inline
  def apply(): VpcCidrBlockAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcCidrBlockAssociation]
  }
  @scala.inline
  implicit class VpcCidrBlockAssociationOps[Self <: VpcCidrBlockAssociation] (val x: Self) extends AnyVal {
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
    def setCidrBlock(value: String): Self = this.set("CidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrBlock: Self = this.set("CidrBlock", js.undefined)
    @scala.inline
    def setCidrBlockState(value: VpcCidrBlockState): Self = this.set("CidrBlockState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrBlockState: Self = this.set("CidrBlockState", js.undefined)
  }
  
}

