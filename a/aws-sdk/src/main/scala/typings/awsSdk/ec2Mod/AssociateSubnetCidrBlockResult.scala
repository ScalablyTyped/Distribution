package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateSubnetCidrBlockResult extends js.Object {
  /**
    * Information about the IPv6 CIDR block association.
    */
  var Ipv6CidrBlockAssociation: js.UndefOr[SubnetIpv6CidrBlockAssociation] = js.native
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.native
}

object AssociateSubnetCidrBlockResult {
  @scala.inline
  def apply(Ipv6CidrBlockAssociation: SubnetIpv6CidrBlockAssociation = null, SubnetId: String = null): AssociateSubnetCidrBlockResult = {
    val __obj = js.Dynamic.literal()
    if (Ipv6CidrBlockAssociation != null) __obj.updateDynamic("Ipv6CidrBlockAssociation")(Ipv6CidrBlockAssociation.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateSubnetCidrBlockResult]
  }
}

