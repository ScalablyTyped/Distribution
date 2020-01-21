package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePublicIpv4PoolsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the address pools.
    */
  var PublicIpv4Pools: js.UndefOr[PublicIpv4PoolSet] = js.native
}

object DescribePublicIpv4PoolsResult {
  @scala.inline
  def apply(NextToken: String = null, PublicIpv4Pools: PublicIpv4PoolSet = null): DescribePublicIpv4PoolsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PublicIpv4Pools != null) __obj.updateDynamic("PublicIpv4Pools")(PublicIpv4Pools.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePublicIpv4PoolsResult]
  }
}

