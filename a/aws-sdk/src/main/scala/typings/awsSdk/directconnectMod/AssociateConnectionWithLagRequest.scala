package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateConnectionWithLagRequest extends js.Object {
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId = js.native
  /**
    * The ID of the LAG with which to associate the connection.
    */
  var lagId: LagId = js.native
}

object AssociateConnectionWithLagRequest {
  @scala.inline
  def apply(connectionId: ConnectionId, lagId: LagId): AssociateConnectionWithLagRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], lagId = lagId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociateConnectionWithLagRequest]
  }
}

