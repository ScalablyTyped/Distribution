package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateHostedConnectionRequest extends js.Object {
  /**
    * The ID of the hosted connection.
    */
  var connectionId: ConnectionId = js.native
  /**
    * The ID of the interconnect or the LAG.
    */
  var parentConnectionId: ConnectionId = js.native
}

object AssociateHostedConnectionRequest {
  @scala.inline
  def apply(connectionId: ConnectionId, parentConnectionId: ConnectionId): AssociateHostedConnectionRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], parentConnectionId = parentConnectionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociateHostedConnectionRequest]
  }
}

