package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectInboundCrossClusterSearchConnectionResponse extends js.Object {
  /**
    * Specifies the InboundCrossClusterSearchConnection of rejected inbound connection. 
    */
  var CrossClusterSearchConnection: js.UndefOr[InboundCrossClusterSearchConnection] = js.native
}

object RejectInboundCrossClusterSearchConnectionResponse {
  @scala.inline
  def apply(CrossClusterSearchConnection: InboundCrossClusterSearchConnection = null): RejectInboundCrossClusterSearchConnectionResponse = {
    val __obj = js.Dynamic.literal()
    if (CrossClusterSearchConnection != null) __obj.updateDynamic("CrossClusterSearchConnection")(CrossClusterSearchConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectInboundCrossClusterSearchConnectionResponse]
  }
}

