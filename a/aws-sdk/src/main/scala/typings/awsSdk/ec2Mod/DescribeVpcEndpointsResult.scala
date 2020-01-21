package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcEndpointsResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the endpoints.
    */
  var VpcEndpoints: js.UndefOr[VpcEndpointSet] = js.native
}

object DescribeVpcEndpointsResult {
  @scala.inline
  def apply(NextToken: String = null, VpcEndpoints: VpcEndpointSet = null): DescribeVpcEndpointsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (VpcEndpoints != null) __obj.updateDynamic("VpcEndpoints")(VpcEndpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcEndpointsResult]
  }
}

