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
  def apply(AssociationId: String = null, CidrBlock: String = null, CidrBlockState: VpcCidrBlockState = null): VpcCidrBlockAssociation = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId.asInstanceOf[js.Any])
    if (CidrBlock != null) __obj.updateDynamic("CidrBlock")(CidrBlock.asInstanceOf[js.Any])
    if (CidrBlockState != null) __obj.updateDynamic("CidrBlockState")(CidrBlockState.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcCidrBlockAssociation]
  }
}

