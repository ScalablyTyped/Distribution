package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InboundCrossClusterSearchConnectionStatus extends js.Object {
  /**
    * Specifies verbose information for the inbound connection status.
    */
  var Message: js.UndefOr[CrossClusterSearchConnectionStatusMessage] = js.native
  /**
    * The state code for inbound connection. This can be one of the following:  PENDING_ACCEPTANCE: Inbound connection is not yet accepted by destination domain owner. APPROVED: Inbound connection is pending acceptance by destination domain owner. REJECTING: Inbound connection rejection is in process. REJECTED: Inbound connection is rejected. DELETING: Inbound connection deletion is in progress. DELETED: Inbound connection is deleted and cannot be used further. 
    */
  var StatusCode: js.UndefOr[InboundCrossClusterSearchConnectionStatusCode] = js.native
}

object InboundCrossClusterSearchConnectionStatus {
  @scala.inline
  def apply(
    Message: CrossClusterSearchConnectionStatusMessage = null,
    StatusCode: InboundCrossClusterSearchConnectionStatusCode = null
  ): InboundCrossClusterSearchConnectionStatus = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (StatusCode != null) __obj.updateDynamic("StatusCode")(StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundCrossClusterSearchConnectionStatus]
  }
}

