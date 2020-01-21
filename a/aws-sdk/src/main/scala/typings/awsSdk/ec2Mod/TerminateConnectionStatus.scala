package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateConnectionStatus extends js.Object {
  /**
    * The ID of the client connection.
    */
  var ConnectionId: js.UndefOr[String] = js.native
  /**
    * A message about the status of the client connection, if applicable.
    */
  var CurrentStatus: js.UndefOr[ClientVpnConnectionStatus] = js.native
  /**
    * The state of the client connection.
    */
  var PreviousStatus: js.UndefOr[ClientVpnConnectionStatus] = js.native
}

object TerminateConnectionStatus {
  @scala.inline
  def apply(
    ConnectionId: String = null,
    CurrentStatus: ClientVpnConnectionStatus = null,
    PreviousStatus: ClientVpnConnectionStatus = null
  ): TerminateConnectionStatus = {
    val __obj = js.Dynamic.literal()
    if (ConnectionId != null) __obj.updateDynamic("ConnectionId")(ConnectionId.asInstanceOf[js.Any])
    if (CurrentStatus != null) __obj.updateDynamic("CurrentStatus")(CurrentStatus.asInstanceOf[js.Any])
    if (PreviousStatus != null) __obj.updateDynamic("PreviousStatus")(PreviousStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateConnectionStatus]
  }
}

