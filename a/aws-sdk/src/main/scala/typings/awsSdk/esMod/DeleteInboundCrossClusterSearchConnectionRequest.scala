package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInboundCrossClusterSearchConnectionRequest extends js.Object {
  /**
    * The id of the inbound connection that you want to permanently delete.
    */
  var CrossClusterSearchConnectionId: typings.awsSdk.esMod.CrossClusterSearchConnectionId = js.native
}

object DeleteInboundCrossClusterSearchConnectionRequest {
  @scala.inline
  def apply(CrossClusterSearchConnectionId: CrossClusterSearchConnectionId): DeleteInboundCrossClusterSearchConnectionRequest = {
    val __obj = js.Dynamic.literal(CrossClusterSearchConnectionId = CrossClusterSearchConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInboundCrossClusterSearchConnectionRequest]
  }
}

