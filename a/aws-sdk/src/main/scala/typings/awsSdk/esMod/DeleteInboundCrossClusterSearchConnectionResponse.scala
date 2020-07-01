package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInboundCrossClusterSearchConnectionResponse extends js.Object {
  /**
    * Specifies the InboundCrossClusterSearchConnection of deleted inbound connection. 
    */
  var CrossClusterSearchConnection: js.UndefOr[InboundCrossClusterSearchConnection] = js.native
}

object DeleteInboundCrossClusterSearchConnectionResponse {
  @scala.inline
  def apply(CrossClusterSearchConnection: InboundCrossClusterSearchConnection = null): DeleteInboundCrossClusterSearchConnectionResponse = {
    val __obj = js.Dynamic.literal()
    if (CrossClusterSearchConnection != null) __obj.updateDynamic("CrossClusterSearchConnection")(CrossClusterSearchConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInboundCrossClusterSearchConnectionResponse]
  }
}

