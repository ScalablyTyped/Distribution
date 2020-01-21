package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about one or more VPCs.
    */
  var Vpcs: js.UndefOr[VpcList] = js.native
}

object DescribeVpcsResult {
  @scala.inline
  def apply(NextToken: String = null, Vpcs: VpcList = null): DescribeVpcsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Vpcs != null) __obj.updateDynamic("Vpcs")(Vpcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcsResult]
  }
}

