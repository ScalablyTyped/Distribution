package typings.azureSb.mod.Azure.ServiceBus

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationHubRegistration extends js.Object {
  var BodyTemplate: js.UndefOr[js.Any] = js.undefined
  var ChannelUri: js.UndefOr[String] = js.undefined
  var DeviceToken: js.UndefOr[String] = js.undefined
  var Expiry: js.UndefOr[Date] = js.undefined
  var MpnsHeaders: js.UndefOr[js.Any] = js.undefined
  var RegistrationId: String
  var Tags: js.UndefOr[String] = js.undefined
  var WnsHeaders: js.UndefOr[js.Any] = js.undefined
  var gcmRegistrationId: js.UndefOr[String] = js.undefined
}

object NotificationHubRegistration {
  @scala.inline
  def apply(
    RegistrationId: String,
    BodyTemplate: js.Any = null,
    ChannelUri: String = null,
    DeviceToken: String = null,
    Expiry: Date = null,
    MpnsHeaders: js.Any = null,
    Tags: String = null,
    WnsHeaders: js.Any = null,
    gcmRegistrationId: String = null
  ): NotificationHubRegistration = {
    val __obj = js.Dynamic.literal(RegistrationId = RegistrationId.asInstanceOf[js.Any])
    if (BodyTemplate != null) __obj.updateDynamic("BodyTemplate")(BodyTemplate.asInstanceOf[js.Any])
    if (ChannelUri != null) __obj.updateDynamic("ChannelUri")(ChannelUri.asInstanceOf[js.Any])
    if (DeviceToken != null) __obj.updateDynamic("DeviceToken")(DeviceToken.asInstanceOf[js.Any])
    if (Expiry != null) __obj.updateDynamic("Expiry")(Expiry.asInstanceOf[js.Any])
    if (MpnsHeaders != null) __obj.updateDynamic("MpnsHeaders")(MpnsHeaders.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (WnsHeaders != null) __obj.updateDynamic("WnsHeaders")(WnsHeaders.asInstanceOf[js.Any])
    if (gcmRegistrationId != null) __obj.updateDynamic("gcmRegistrationId")(gcmRegistrationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationHubRegistration]
  }
}

