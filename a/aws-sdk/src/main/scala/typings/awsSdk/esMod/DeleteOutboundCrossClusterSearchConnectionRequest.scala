package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteOutboundCrossClusterSearchConnectionRequest extends js.Object {
  /**
    * The id of the outbound connection that you want to permanently delete.
    */
  var CrossClusterSearchConnectionId: typings.awsSdk.esMod.CrossClusterSearchConnectionId = js.native
}

object DeleteOutboundCrossClusterSearchConnectionRequest {
  @scala.inline
  def apply(CrossClusterSearchConnectionId: CrossClusterSearchConnectionId): DeleteOutboundCrossClusterSearchConnectionRequest = {
    val __obj = js.Dynamic.literal(CrossClusterSearchConnectionId = CrossClusterSearchConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOutboundCrossClusterSearchConnectionRequest]
  }
}

