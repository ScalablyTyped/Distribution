package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptInboundCrossClusterSearchConnectionResponse extends js.Object {
  /**
    * Specifies the InboundCrossClusterSearchConnection of accepted inbound connection. 
    */
  var CrossClusterSearchConnection: js.UndefOr[InboundCrossClusterSearchConnection] = js.native
}

object AcceptInboundCrossClusterSearchConnectionResponse {
  @scala.inline
  def apply(CrossClusterSearchConnection: InboundCrossClusterSearchConnection = null): AcceptInboundCrossClusterSearchConnectionResponse = {
    val __obj = js.Dynamic.literal()
    if (CrossClusterSearchConnection != null) __obj.updateDynamic("CrossClusterSearchConnection")(CrossClusterSearchConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInboundCrossClusterSearchConnectionResponse]
  }
}

