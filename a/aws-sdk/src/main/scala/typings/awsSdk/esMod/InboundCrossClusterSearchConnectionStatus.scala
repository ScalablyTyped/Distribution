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
  def apply(): InboundCrossClusterSearchConnectionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InboundCrossClusterSearchConnectionStatus]
  }
  @scala.inline
  implicit class InboundCrossClusterSearchConnectionStatusOps[Self <: InboundCrossClusterSearchConnectionStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessage(value: CrossClusterSearchConnectionStatusMessage): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setStatusCode(value: InboundCrossClusterSearchConnectionStatusCode): Self = this.set("StatusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("StatusCode", js.undefined)
  }
  
}

