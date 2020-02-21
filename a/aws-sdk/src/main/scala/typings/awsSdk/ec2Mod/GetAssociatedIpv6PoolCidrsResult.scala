package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssociatedIpv6PoolCidrsResult extends js.Object {
  /**
    * Information about the IPv6 CIDR block associations.
    */
  var Ipv6CidrAssociations: js.UndefOr[Ipv6CidrAssociationSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object GetAssociatedIpv6PoolCidrsResult {
  @scala.inline
  def apply(Ipv6CidrAssociations: Ipv6CidrAssociationSet = null, NextToken: String = null): GetAssociatedIpv6PoolCidrsResult = {
    val __obj = js.Dynamic.literal()
    if (Ipv6CidrAssociations != null) __obj.updateDynamic("Ipv6CidrAssociations")(Ipv6CidrAssociations.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssociatedIpv6PoolCidrsResult]
  }
}

