package typings.chromeApps

import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.integer
import typings.chromeApps.chrome.notifications.ButtonOptions
import typings.chromeApps.chrome.notifications.ItemOptions
import typings.chromeApps.chromeAppsNumbers.`-1`
import typings.chromeApps.chromeAppsNumbers.`-2`
import typings.chromeApps.chromeAppsNumbers.`0`
import typings.chromeApps.chromeAppsNumbers.`1`
import typings.chromeApps.chromeAppsNumbers.`2`
import typings.chromeApps.chromeAppsStrings.basic
import typings.chromeApps.chromeAppsStrings.image
import typings.chromeApps.chromeAppsStrings.list
import typings.chromeApps.chromeAppsStrings.progress
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<chrome-apps.chrome.notifications.NotificationOptions> */
trait PartialNotificationOption extends js.Object {
  var appIconMaskUrl: js.UndefOr[String] = js.undefined
  var buttons: js.UndefOr[js.Array[ButtonOptions]] = js.undefined
  var contextMessage: js.UndefOr[String] = js.undefined
  var eventTime: js.UndefOr[double] = js.undefined
  var iconUrl: js.UndefOr[String] = js.undefined
  var imageUrl: js.UndefOr[String] = js.undefined
  var isClickable: js.UndefOr[Boolean] = js.undefined
  var items: js.UndefOr[js.Array[ItemOptions]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var priority: js.UndefOr[`-2` | `-1` | `0` | `1` | `2`] = js.undefined
  var progress: js.UndefOr[integer] = js.undefined
  var requireInteraction: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[
    ToStringLiteral[AnonBASIC, String, Exclude[String, basic | image | list | progress]]
  ] = js.undefined
}

object PartialNotificationOption {
  @scala.inline
  def apply(
    appIconMaskUrl: String = null,
    buttons: js.Array[ButtonOptions] = null,
    contextMessage: String = null,
    eventTime: Int | Double = null,
    iconUrl: String = null,
    imageUrl: String = null,
    isClickable: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[ItemOptions] = null,
    message: String = null,
    priority: `-2` | `-1` | `0` | `1` | `2` = null,
    progress: Int | Double = null,
    requireInteraction: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    `type`: ToStringLiteral[AnonBASIC, String, Exclude[String, basic | image | list | progress]] = null
  ): PartialNotificationOption = {
    val __obj = js.Dynamic.literal()
    if (appIconMaskUrl != null) __obj.updateDynamic("appIconMaskUrl")(appIconMaskUrl.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (contextMessage != null) __obj.updateDynamic("contextMessage")(contextMessage.asInstanceOf[js.Any])
    if (eventTime != null) __obj.updateDynamic("eventTime")(eventTime.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(isClickable)) __obj.updateDynamic("isClickable")(isClickable.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (!js.isUndefined(requireInteraction)) __obj.updateDynamic("requireInteraction")(requireInteraction.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialNotificationOption]
  }
}

