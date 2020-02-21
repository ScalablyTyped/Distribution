package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIpv6PoolsResult extends js.Object {
  /**
    * Information about the IPv6 address pools.
    */
  var Ipv6Pools: js.UndefOr[Ipv6PoolSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}

object DescribeIpv6PoolsResult {
  @scala.inline
  def apply(Ipv6Pools: Ipv6PoolSet = null, NextToken: NextToken = null): DescribeIpv6PoolsResult = {
    val __obj = js.Dynamic.literal()
    if (Ipv6Pools != null) __obj.updateDynamic("Ipv6Pools")(Ipv6Pools.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIpv6PoolsResult]
  }
}

