package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateNotificationHubOptions> */
trait CreateNotificationHubOptions extends js.Object {
  var apns: js.UndefOr[Dictionary[String]] = js.undefined
  var gcm: js.UndefOr[Dictionary[String]] = js.undefined
  var mpns: js.UndefOr[Dictionary[String]] = js.undefined
  var wns: js.UndefOr[Dictionary[String]] = js.undefined
}

object CreateNotificationHubOptions {
  @scala.inline
  def apply(
    apns: Dictionary[String] = null,
    gcm: Dictionary[String] = null,
    mpns: Dictionary[String] = null,
    wns: Dictionary[String] = null
  ): CreateNotificationHubOptions = {
    val __obj = js.Dynamic.literal()
    if (apns != null) __obj.updateDynamic("apns")(apns.asInstanceOf[js.Any])
    if (gcm != null) __obj.updateDynamic("gcm")(gcm.asInstanceOf[js.Any])
    if (mpns != null) __obj.updateDynamic("mpns")(mpns.asInstanceOf[js.Any])
    if (wns != null) __obj.updateDynamic("wns")(wns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNotificationHubOptions]
  }
}

