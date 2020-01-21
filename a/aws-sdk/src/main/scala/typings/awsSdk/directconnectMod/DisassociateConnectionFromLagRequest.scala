package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateConnectionFromLagRequest extends js.Object {
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId = js.native
  /**
    * The ID of the LAG.
    */
  var lagId: LagId = js.native
}

object DisassociateConnectionFromLagRequest {
  @scala.inline
  def apply(connectionId: ConnectionId, lagId: LagId): DisassociateConnectionFromLagRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], lagId = lagId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociateConnectionFromLagRequest]
  }
}

