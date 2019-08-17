package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAPNSChannelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _APNSChannelResponse extends js.Object {
  /**
    * The ID of the application that the channel applies to.
    */
  var ApplicationId: js.UndefOr[String] = js.undefined
  /**
    * The date and time when this channel was created.
    */
  var CreationDate: js.UndefOr[String] = js.undefined
  /**
    * The default authentication method used for APNs.
    */
  var DefaultAuthenticationMethod: js.UndefOr[String] = js.undefined
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Not used. Retained for backwards compatibility.
    */
  var HasCredential: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the channel is configured with a key for APNs token authentication. Provide a token key by setting the TokenKey attribute.
    */
  var HasTokenKey: js.UndefOr[Boolean] = js.undefined
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

object _APNSChannelResponse {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    CreationDate: String = null,
    DefaultAuthenticationMethod: String = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    HasCredential: js.UndefOr[Boolean] = js.undefined,
    HasTokenKey: js.UndefOr[Boolean] = js.undefined,
    Id: String = null,
    IsArchived: js.UndefOr[Boolean] = js.undefined,
    LastModifiedBy: String = null,
    LastModifiedDate: String = null,
    Platform: String = null,
    Version: Int | Double = null
  ): _APNSChannelResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (DefaultAuthenticationMethod != null) __obj.updateDynamic("DefaultAuthenticationMethod")(DefaultAuthenticationMethod)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (!js.isUndefined(HasCredential)) __obj.updateDynamic("HasCredential")(HasCredential)
    if (!js.isUndefined(HasTokenKey)) __obj.updateDynamic("HasTokenKey")(HasTokenKey)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(IsArchived)) __obj.updateDynamic("IsArchived")(IsArchived)
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (Platform != null) __obj.updateDynamic("Platform")(Platform)
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[_APNSChannelResponse]
  }
}

