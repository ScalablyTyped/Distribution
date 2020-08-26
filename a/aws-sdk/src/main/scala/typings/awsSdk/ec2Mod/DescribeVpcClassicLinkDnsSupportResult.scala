package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcClassicLinkDnsSupportResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[DescribeVpcClassicLinkDnsSupportNextToken] = js.native
  /**
    * Information about the ClassicLink DNS support status of the VPCs.
    */
  var Vpcs: js.UndefOr[ClassicLinkDnsSupportList] = js.native
}

object DescribeVpcClassicLinkDnsSupportResult {
  @scala.inline
  def apply(): DescribeVpcClassicLinkDnsSupportResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcClassicLinkDnsSupportResult]
  }
  @scala.inline
  implicit class DescribeVpcClassicLinkDnsSupportResultOps[Self <: DescribeVpcClassicLinkDnsSupportResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: DescribeVpcClassicLinkDnsSupportNextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setVpcsVarargs(value: ClassicLinkDnsSupport*): Self = this.set("Vpcs", js.Array(value :_*))
    @scala.inline
    def setVpcs(value: ClassicLinkDnsSupportList): Self = this.set("Vpcs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcs: Self = this.set("Vpcs", js.undefined)
  }
  
}

