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
  def apply(): DescribeIpv6PoolsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIpv6PoolsResult]
  }
  @scala.inline
  implicit class DescribeIpv6PoolsResultOps[Self <: DescribeIpv6PoolsResult] (val x: Self) extends AnyVal {
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
    def setIpv6PoolsVarargs(value: Ipv6Pool*): Self = this.set("Ipv6Pools", js.Array(value :_*))
    @scala.inline
    def setIpv6Pools(value: Ipv6PoolSet): Self = this.set("Ipv6Pools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6Pools: Self = this.set("Ipv6Pools", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

