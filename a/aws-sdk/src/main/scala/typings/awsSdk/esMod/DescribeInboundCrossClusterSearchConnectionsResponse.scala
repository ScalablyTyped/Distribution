package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInboundCrossClusterSearchConnectionsResponse extends js.Object {
  /**
    * Consists of list of InboundCrossClusterSearchConnection matching the specified filter criteria.
    */
  var CrossClusterSearchConnections: js.UndefOr[InboundCrossClusterSearchConnections] = js.native
  /**
    * If more results are available and NextToken is present, make the next request to the same API with the received NextToken to paginate the remaining results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.native
}

object DescribeInboundCrossClusterSearchConnectionsResponse {
  @scala.inline
  def apply(
    CrossClusterSearchConnections: InboundCrossClusterSearchConnections = null,
    NextToken: NextToken = null
  ): DescribeInboundCrossClusterSearchConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    if (CrossClusterSearchConnections != null) __obj.updateDynamic("CrossClusterSearchConnections")(CrossClusterSearchConnections.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInboundCrossClusterSearchConnectionsResponse]
  }
}

