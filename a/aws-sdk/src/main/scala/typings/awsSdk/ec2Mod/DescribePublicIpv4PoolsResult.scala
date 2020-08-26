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
  def apply(): DescribePublicIpv4PoolsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePublicIpv4PoolsResult]
  }
  @scala.inline
  implicit class DescribePublicIpv4PoolsResultOps[Self <: DescribePublicIpv4PoolsResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPublicIpv4PoolsVarargs(value: PublicIpv4Pool*): Self = this.set("PublicIpv4Pools", js.Array(value :_*))
    @scala.inline
    def setPublicIpv4Pools(value: PublicIpv4PoolSet): Self = this.set("PublicIpv4Pools", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicIpv4Pools: Self = this.set("PublicIpv4Pools", js.undefined)
  }
  
}

