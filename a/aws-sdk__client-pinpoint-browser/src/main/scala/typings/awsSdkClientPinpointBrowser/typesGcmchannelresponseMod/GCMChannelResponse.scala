package typings.awsSdkClientPinpointBrowser.typesGcmchannelresponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GCMChannelResponse extends js.Object {
  /**
    * The ID of the application to which the channel applies.
    */
  var ApplicationId: js.UndefOr[String] = js.undefined
  /**
    * When was this segment created
    */
  var CreationDate: js.UndefOr[String] = js.undefined
  /**
    * The GCM API key from Google.
    */
  var Credential: js.UndefOr[String] = js.undefined
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Not used. Retained for backwards compatibility.
    */
  var HasCredential: js.UndefOr[Boolean] = js.undefined
  /**
    * Channel ID. Not used. Present only for backwards compatibility.
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
    * The platform type. Will be GCM
    */
  var Platform: js.UndefOr[String] = js.undefined
  /**
    * Version of channel
    */
  var Version: js.UndefOr[Double] = js.undefined
}

object GCMChannelResponse {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    CreationDate: String = null,
    Credential: String = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    HasCredential: js.UndefOr[Boolean] = js.undefined,
    Id: String = null,
    IsArchived: js.UndefOr[Boolean] = js.undefined,
    LastModifiedBy: String = null,
    LastModifiedDate: String = null,
    Platform: String = null,
    Version: js.UndefOr[Double] = js.undefined
  ): GCMChannelResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Credential != null) __obj.updateDynamic("Credential")(Credential.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(HasCredential)) __obj.updateDynamic("HasCredential")(HasCredential.get.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (!js.isUndefined(IsArchived)) __obj.updateDynamic("IsArchived")(IsArchived.get.asInstanceOf[js.Any])
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GCMChannelResponse]
  }
}

