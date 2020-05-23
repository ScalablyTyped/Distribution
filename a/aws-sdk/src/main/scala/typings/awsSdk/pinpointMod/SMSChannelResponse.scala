package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMSChannelResponse extends js.Object {
  /**
    * The unique identifier for the application that the SMS channel applies to.
    */
  var ApplicationId: js.UndefOr[string] = js.native
  /**
    * The date and time, in ISO 8601 format, when the SMS channel was enabled.
    */
  var CreationDate: js.UndefOr[string] = js.native
  /**
    * Specifies whether the SMS channel is enabled for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[boolean] = js.native
  /**
    * (Deprecated) An identifier for the SMS channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * Specifies whether the SMS channel is archived.
    */
  var IsArchived: js.UndefOr[boolean] = js.native
  /**
    * The user who last modified the SMS channel.
    */
  var LastModifiedBy: js.UndefOr[string] = js.native
  /**
    * The date and time, in ISO 8601 format, when the SMS channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.native
  /**
    * The type of messaging or notification platform for the channel. For the SMS channel, this value is SMS.
    */
  var Platform: string = js.native
  /**
    * The maximum number of promotional messages that you can send through the SMS channel each second.
    */
  var PromotionalMessagesPerSecond: js.UndefOr[integer] = js.native
  /**
    * The identity that displays on recipients' devices when they receive messages from the SMS channel.
    */
  var SenderId: js.UndefOr[string] = js.native
  /**
    * The registered short code to use when you send messages through the SMS channel.
    */
  var ShortCode: js.UndefOr[string] = js.native
  /**
    * The maximum number of transactional messages that you can send through the SMS channel each second.
    */
  var TransactionalMessagesPerSecond: js.UndefOr[integer] = js.native
  /**
    * The current version of the SMS channel.
    */
  var Version: js.UndefOr[integer] = js.native
}

object SMSChannelResponse {
  @scala.inline
  def apply(
    Platform: string,
    ApplicationId: string = null,
    CreationDate: string = null,
    Enabled: js.UndefOr[boolean] = js.undefined,
    HasCredential: js.UndefOr[boolean] = js.undefined,
    Id: string = null,
    IsArchived: js.UndefOr[boolean] = js.undefined,
    LastModifiedBy: string = null,
    LastModifiedDate: string = null,
    PromotionalMessagesPerSecond: js.UndefOr[integer] = js.undefined,
    SenderId: string = null,
    ShortCode: string = null,
    TransactionalMessagesPerSecond: js.UndefOr[integer] = js.undefined,
    Version: js.UndefOr[integer] = js.undefined
  ): SMSChannelResponse = {
    val __obj = js.Dynamic.literal(Platform = Platform.asInstanceOf[js.Any])
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(HasCredential)) __obj.updateDynamic("HasCredential")(HasCredential.get.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (!js.isUndefined(IsArchived)) __obj.updateDynamic("IsArchived")(IsArchived.get.asInstanceOf[js.Any])
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (!js.isUndefined(PromotionalMessagesPerSecond)) __obj.updateDynamic("PromotionalMessagesPerSecond")(PromotionalMessagesPerSecond.get.asInstanceOf[js.Any])
    if (SenderId != null) __obj.updateDynamic("SenderId")(SenderId.asInstanceOf[js.Any])
    if (ShortCode != null) __obj.updateDynamic("ShortCode")(ShortCode.asInstanceOf[js.Any])
    if (!js.isUndefined(TransactionalMessagesPerSecond)) __obj.updateDynamic("TransactionalMessagesPerSecond")(TransactionalMessagesPerSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMSChannelResponse]
  }
}

