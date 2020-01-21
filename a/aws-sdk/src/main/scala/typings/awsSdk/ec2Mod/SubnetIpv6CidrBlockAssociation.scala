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
  def apply(
    AssociationId: String = null,
    Ipv6CidrBlock: String = null,
    Ipv6CidrBlockState: SubnetCidrBlockState = null
  ): SubnetIpv6CidrBlockAssociation = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId.asInstanceOf[js.Any])
    if (Ipv6CidrBlock != null) __obj.updateDynamic("Ipv6CidrBlock")(Ipv6CidrBlock.asInstanceOf[js.Any])
    if (Ipv6CidrBlockState != null) __obj.updateDynamic("Ipv6CidrBlockState")(Ipv6CidrBlockState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetIpv6CidrBlockAssociation]
  }
}

