package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcClassicLinkDnsSupportRequest extends js.Object {
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeVpcClassicLinkDnsSupportMaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[DescribeVpcClassicLinkDnsSupportNextToken] = js.native
  /**
    * One or more VPC IDs.
    */
  var VpcIds: js.UndefOr[VpcClassicLinkIdList] = js.native
}

object DescribeVpcClassicLinkDnsSupportRequest {
  @scala.inline
  def apply(): DescribeVpcClassicLinkDnsSupportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcClassicLinkDnsSupportRequest]
  }
  @scala.inline
  implicit class DescribeVpcClassicLinkDnsSupportRequestOps[Self <: DescribeVpcClassicLinkDnsSupportRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: DescribeVpcClassicLinkDnsSupportMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: DescribeVpcClassicLinkDnsSupportNextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setVpcIdsVarargs(value: VpcId*): Self = this.set("VpcIds", js.Array(value :_*))
    @scala.inline
    def setVpcIds(value: VpcClassicLinkIdList): Self = this.set("VpcIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcIds: Self = this.set("VpcIds", js.undefined)
  }
  
}

