package typings.awsSdkClientPinpointBrowser.typesSmschannelresponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMSChannelResponse extends js.Object {
  /**
    * The unique ID of the application to which the SMS channel belongs.
    */
  var ApplicationId: js.UndefOr[String] = js.undefined
  /**
    * The date that the settings were last updated in ISO 8601 format.
    */
  var CreationDate: js.UndefOr[String] = js.undefined
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Not used. Retained for backwards compatibility.
    */
  var HasCredential: js.UndefOr[Boolean] = js.undefined
  /**
    * Channel ID. Not used, only for backwards compatibility.
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * Is this channel archived
    */
  var IsArchived: js.UndefOr[Boolean] = js.undefined
  /**
    * Who last updated this entry
    */
  var LastModifiedBy: js.UndefOr[String] = js.undefined
  /**
    * Last date this was updated
    */
  var LastModifiedDate: js.UndefOr[String] = js.undefined
  /**
    * Platform type. Will be "SMS"
    */
  var Platform: js.UndefOr[String] = js.undefined
  /**
    * Promotional messages per second that can be sent
    */
  var PromotionalMessagesPerSecond: js.UndefOr[Double] = js.undefined
  /**
    * Sender identifier of your messages.
    */
  var SenderId: js.UndefOr[String] = js.undefined
  /**
    * The short code registered with the phone provider.
    */
  var ShortCode: js.UndefOr[String] = js.undefined
  /**
    * Transactional messages per second that can be sent
    */
  var TransactionalMessagesPerSecond: js.UndefOr[Double] = js.undefined
  /**
    * Version of channel
    */
  var Version: js.UndefOr[Double] = js.undefined
}

object SMSChannelResponse {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    CreationDate: String = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    HasCredential: js.UndefOr[Boolean] = js.undefined,
    Id: String = null,
    IsArchived: js.UndefOr[Boolean] = js.undefined,
    LastModifiedBy: String = null,
    LastModifiedDate: String = null,
    Platform: String = null,
    PromotionalMessagesPerSecond: Int | Double = null,
    SenderId: String = null,
    ShortCode: String = null,
    TransactionalMessagesPerSecond: Int | Double = null,
    Version: Int | Double = null
  ): SMSChannelResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(HasCredential)) __obj.updateDynamic("HasCredential")(HasCredential.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (!js.isUndefined(IsArchived)) __obj.updateDynamic("IsArchived")(IsArchived.asInstanceOf[js.Any])
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (PromotionalMessagesPerSecond != null) __obj.updateDynamic("PromotionalMessagesPerSecond")(PromotionalMessagesPerSecond.asInstanceOf[js.Any])
    if (SenderId != null) __obj.updateDynamic("SenderId")(SenderId.asInstanceOf[js.Any])
    if (ShortCode != null) __obj.updateDynamic("ShortCode")(ShortCode.asInstanceOf[js.Any])
    if (TransactionalMessagesPerSecond != null) __obj.updateDynamic("TransactionalMessagesPerSecond")(TransactionalMessagesPerSecond.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMSChannelResponse]
  }
}

