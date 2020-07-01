package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteOutboundCrossClusterSearchConnectionResponse extends js.Object {
  /**
    * Specifies the OutboundCrossClusterSearchConnection of deleted outbound connection. 
    */
  var CrossClusterSearchConnection: js.UndefOr[OutboundCrossClusterSearchConnection] = js.native
}

object DeleteOutboundCrossClusterSearchConnectionResponse {
  @scala.inline
  def apply(CrossClusterSearchConnection: OutboundCrossClusterSearchConnection = null): DeleteOutboundCrossClusterSearchConnectionResponse = {
    val __obj = js.Dynamic.literal()
    if (CrossClusterSearchConnection != null) __obj.updateDynamic("CrossClusterSearchConnection")(CrossClusterSearchConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOutboundCrossClusterSearchConnectionResponse]
  }
}

