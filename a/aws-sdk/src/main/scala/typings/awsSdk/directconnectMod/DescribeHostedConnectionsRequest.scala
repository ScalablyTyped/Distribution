package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHostedConnectionsRequest extends js.Object {
  /**
    * The ID of the interconnect or LAG.
    */
  var connectionId: ConnectionId = js.native
}

object DescribeHostedConnectionsRequest {
  @scala.inline
  def apply(connectionId: ConnectionId): DescribeHostedConnectionsRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHostedConnectionsRequest]
  }
}

