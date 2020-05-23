package typings.awsSdkClientPinpointBrowser.typesEndpointMessageResultMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DUPLICATE
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.OPT_OUT
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PERMANENT_FAILURE
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.SUCCESSFUL
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.TEMPORARY_FAILURE
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.THROTTLED
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.UNKNOWN_FAILURE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointMessageResult extends js.Object {
  /**
    * Address that endpoint message was delivered to.
    */
  var Address: js.UndefOr[String] = js.undefined
  /**
    * The delivery status of the message. Possible values:
    *
    * SUCCESS - The message was successfully delivered to the endpoint.
    *
    * TRANSIENT_FAILURE - A temporary error occurred. Amazon Pinpoint will attempt to deliver the message again later.
    *
    * FAILURE_PERMANENT - An error occurred when delivering the message to the endpoint. Amazon Pinpoint won't attempt to send the message again.
    *
    * TIMEOUT - The message couldn't be sent within the timeout period.
    *
    * QUIET_TIME - The local time for the endpoint was within the Quiet Hours for the campaign.
    *
    * DAILY_CAP - The endpoint has received the maximum number of messages it can receive within a 24-hour period.
    *
    * HOLDOUT - The endpoint was in a hold out treatment for the campaign.
    *
    * THROTTLED - Amazon Pinpoint throttled sending to this endpoint.
    *
    * EXPIRED - The endpoint address is expired.
    *
    * CAMPAIGN_CAP - The endpoint received the maximum number of messages allowed by the campaign.
    *
    * SERVICE_FAILURE - A service-level failure prevented Amazon Pinpoint from delivering the message.
    *
    * UNKNOWN - An unknown error occurred.
    */
  var DeliveryStatus: js.UndefOr[
    SUCCESSFUL | THROTTLED | TEMPORARY_FAILURE | PERMANENT_FAILURE | UNKNOWN_FAILURE | OPT_OUT | DUPLICATE | String
  ] = js.undefined
  /**
    * Unique message identifier associated with the message that was sent.
    */
  var MessageId: js.UndefOr[String] = js.undefined
  /**
    * Downstream service status code.
    */
  var StatusCode: js.UndefOr[Double] = js.undefined
  /**
    * Status message for message delivery.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  /**
    * If token was updated as part of delivery. (This is GCM Specific)
    */
  var UpdatedToken: js.UndefOr[String] = js.undefined
}

object EndpointMessageResult {
  @scala.inline
  def apply(
    Address: String = null,
    DeliveryStatus: SUCCESSFUL | THROTTLED | TEMPORARY_FAILURE | PERMANENT_FAILURE | UNKNOWN_FAILURE | OPT_OUT | DUPLICATE | String = null,
    MessageId: String = null,
    StatusCode: js.UndefOr[Double] = js.undefined,
    StatusMessage: String = null,
    UpdatedToken: String = null
  ): EndpointMessageResult = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (DeliveryStatus != null) __obj.updateDynamic("DeliveryStatus")(DeliveryStatus.asInstanceOf[js.Any])
    if (MessageId != null) __obj.updateDynamic("MessageId")(MessageId.asInstanceOf[js.Any])
    if (!js.isUndefined(StatusCode)) __obj.updateDynamic("StatusCode")(StatusCode.get.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (UpdatedToken != null) __obj.updateDynamic("UpdatedToken")(UpdatedToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointMessageResult]
  }
}

