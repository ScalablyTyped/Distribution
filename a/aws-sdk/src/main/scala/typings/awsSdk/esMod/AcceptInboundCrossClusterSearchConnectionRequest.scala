package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptInboundCrossClusterSearchConnectionRequest extends js.Object {
  /**
    * The id of the inbound connection that you want to accept.
    */
  var CrossClusterSearchConnectionId: typings.awsSdk.esMod.CrossClusterSearchConnectionId = js.native
}

object AcceptInboundCrossClusterSearchConnectionRequest {
  @scala.inline
  def apply(CrossClusterSearchConnectionId: CrossClusterSearchConnectionId): AcceptInboundCrossClusterSearchConnectionRequest = {
    val __obj = js.Dynamic.literal(CrossClusterSearchConnectionId = CrossClusterSearchConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInboundCrossClusterSearchConnectionRequest]
  }
}

