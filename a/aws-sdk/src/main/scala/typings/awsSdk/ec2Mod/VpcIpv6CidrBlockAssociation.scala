package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcIpv6CidrBlockAssociation extends js.Object {
  /**
    * The association ID for the IPv6 CIDR block.
    */
  var AssociationId: js.UndefOr[String] = js.native
  /**
    * The IPv6 CIDR block.
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * Information about the state of the CIDR block.
    */
  var Ipv6CidrBlockState: js.UndefOr[VpcCidrBlockState] = js.native
  /**
    * The ID of the IPv6 address pool from which the IPv6 CIDR block is allocated.
    */
  var Ipv6Pool: js.UndefOr[String] = js.native
  /**
    * The name of the location from which we advertise the IPV6 CIDR block.
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.native
}

object VpcIpv6CidrBlockAssociation {
  @scala.inline
  def apply(
    AssociationId: String = null,
    Ipv6CidrBlock: String = null,
    Ipv6CidrBlockState: VpcCidrBlockState = null,
    Ipv6Pool: String = null,
    NetworkBorderGroup: String = null
  ): VpcIpv6CidrBlockAssociation = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId.asInstanceOf[js.Any])
    if (Ipv6CidrBlock != null) __obj.updateDynamic("Ipv6CidrBlock")(Ipv6CidrBlock.asInstanceOf[js.Any])
    if (Ipv6CidrBlockState != null) __obj.updateDynamic("Ipv6CidrBlockState")(Ipv6CidrBlockState.asInstanceOf[js.Any])
    if (Ipv6Pool != null) __obj.updateDynamic("Ipv6Pool")(Ipv6Pool.asInstanceOf[js.Any])
    if (NetworkBorderGroup != null) __obj.updateDynamic("NetworkBorderGroup")(NetworkBorderGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcIpv6CidrBlockAssociation]
  }
}

