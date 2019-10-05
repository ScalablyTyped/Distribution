package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus

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
    val __obj = js.Dynamic.literal(RegistrationId = RegistrationId)
    if (BodyTemplate != null) __obj.updateDynamic("BodyTemplate")(BodyTemplate)
    if (ChannelUri != null) __obj.updateDynamic("ChannelUri")(ChannelUri)
    if (DeviceToken != null) __obj.updateDynamic("DeviceToken")(DeviceToken)
    if (Expiry != null) __obj.updateDynamic("Expiry")(Expiry)
    if (MpnsHeaders != null) __obj.updateDynamic("MpnsHeaders")(MpnsHeaders)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (WnsHeaders != null) __obj.updateDynamic("WnsHeaders")(WnsHeaders)
    if (gcmRegistrationId != null) __obj.updateDynamic("gcmRegistrationId")(gcmRegistrationId)
    __obj.asInstanceOf[NotificationHubRegistration]
  }
}

