package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcEndpointConnectionsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about one or more VPC endpoint connections.
    */
  var VpcEndpointConnections: js.UndefOr[VpcEndpointConnectionSet] = js.native
}

object DescribeVpcEndpointConnectionsResult {
  @scala.inline
  def apply(NextToken: String = null, VpcEndpointConnections: VpcEndpointConnectionSet = null): DescribeVpcEndpointConnectionsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (VpcEndpointConnections != null) __obj.updateDynamic("VpcEndpointConnections")(VpcEndpointConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcEndpointConnectionsResult]
  }
}

