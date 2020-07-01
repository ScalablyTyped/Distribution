package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutboundCrossClusterSearchConnectionStatus extends js.Object {
  /**
    * Specifies verbose information for the outbound connection status.
    */
  var Message: js.UndefOr[CrossClusterSearchConnectionStatusMessage] = js.native
  /**
    * The state code for outbound connection. This can be one of the following:  VALIDATING: The outbound connection request is being validated. VALIDATION_FAILED: Validation failed for the connection request. PENDING_ACCEPTANCE: Outbound connection request is validated and is not yet accepted by destination domain owner. PROVISIONING: Outbound connection request is in process. ACTIVE: Outbound connection is active and ready to use. REJECTED: Outbound connection request is rejected by destination domain owner. DELETING: Outbound connection deletion is in progress. DELETED: Outbound connection is deleted and cannot be used further. 
    */
  var StatusCode: js.UndefOr[OutboundCrossClusterSearchConnectionStatusCode] = js.native
}

object OutboundCrossClusterSearchConnectionStatus {
  @scala.inline
  def apply(
    Message: CrossClusterSearchConnectionStatusMessage = null,
    StatusCode: OutboundCrossClusterSearchConnectionStatusCode = null
  ): OutboundCrossClusterSearchConnectionStatus = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (StatusCode != null) __obj.updateDynamic("StatusCode")(StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutboundCrossClusterSearchConnectionStatus]
  }
}

