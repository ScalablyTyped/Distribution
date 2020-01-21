package typings.awsSdkClientPinpointBrowser.typesAdmchannelresponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ADMChannelResponse extends js.Object {
  /**
    * The ID of the application to which the channel applies.
    */
  var ApplicationId: js.UndefOr[String] = js.undefined
  /**
    * The date and time when this channel was created.
    */
  var CreationDate: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether or not the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Not used. Retained for backwards compatibility.
    */
  var HasCredential: js.UndefOr[Boolean] = js.undefined
  /**
    * (Deprecated) An identifier for the channel. Retained for backwards compatibility.
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether or not the channel is archived.
    */
  var IsArchived: js.UndefOr[Boolean] = js.undefined
  /**
    * The user who last updated this channel.
    */
  var LastModifiedBy: js.UndefOr[String] = js.undefined
  /**
    * The date and time when this channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[String] = js.undefined
  /**
    * The platform type. For this channel, the value is always "ADM."
    */
  var Platform: js.UndefOr[String] = js.undefined
  /**
    * The channel version.
    */
  var Version: js.UndefOr[Double] = js.undefined
}

object ADMChannelResponse {
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
    Version: Int | Double = null
  ): ADMChannelResponse = {
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
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADMChannelResponse]
  }
}

