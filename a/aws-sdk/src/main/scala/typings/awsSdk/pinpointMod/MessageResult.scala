package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageResult extends js.Object {
  /**
    * The delivery status of the message. Possible values are:  DUPLICATE - The endpoint address is a duplicate of another endpoint address. Amazon Pinpoint won't attempt to send the message again.   OPT_OUT - The user who's associated with the endpoint address has opted out of receiving messages from you. Amazon Pinpoint won't attempt to send the message again. PERMANENT_FAILURE - An error occurred when delivering the message to the endpoint address. Amazon Pinpoint won't attempt to send the message again.   SUCCESSFUL - The message was successfully delivered to the endpoint address. TEMPORARY_FAILURE - A temporary error occurred. Amazon Pinpoint will attempt to deliver the message again later. THROTTLED - Amazon Pinpoint throttled the operation to send the message to the endpoint address. TIMEOUT - The message couldn't be sent within the timeout period. UNKNOWN_FAILURE - An unknown error occurred.
    */
  var DeliveryStatus: typings.awsSdk.pinpointMod.DeliveryStatus = js.native
  /**
    * The unique identifier for the message that was sent.
    */
  var MessageId: js.UndefOr[string] = js.native
  /**
    * The downstream service status code for delivering the message.
    */
  var StatusCode: integer = js.native
  /**
    * The status message for delivering the message.
    */
  var StatusMessage: js.UndefOr[string] = js.native
  /**
    * For push notifications that are sent through the GCM channel, specifies whether the endpoint's device registration token was updated as part of delivering the message.
    */
  var UpdatedToken: js.UndefOr[string] = js.native
}

object MessageResult {
  @scala.inline
  def apply(
    DeliveryStatus: DeliveryStatus,
    StatusCode: integer,
    MessageId: string = null,
    StatusMessage: string = null,
    UpdatedToken: string = null
  ): MessageResult = {
    val __obj = js.Dynamic.literal(DeliveryStatus = DeliveryStatus.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any])
    if (MessageId != null) __obj.updateDynamic("MessageId")(MessageId.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (UpdatedToken != null) __obj.updateDynamic("UpdatedToken")(UpdatedToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageResult]
  }
}

