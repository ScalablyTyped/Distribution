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
  def apply(
    NextToken: DescribeVpcClassicLinkDnsSupportNextToken = null,
    Vpcs: ClassicLinkDnsSupportList = null
  ): DescribeVpcClassicLinkDnsSupportResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Vpcs != null) __obj.updateDynamic("Vpcs")(Vpcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcClassicLinkDnsSupportResult]
  }
}

