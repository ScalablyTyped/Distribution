package typings.chromeDashApps.chrome.notifications

import typings.chromeDashApps.Anon_BASIC
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chrome.double
import typings.chromeDashApps.chrome.integer
import typings.chromeDashApps.chromeDashAppsNumbers.`-1`
import typings.chromeDashApps.chromeDashAppsNumbers.`-2`
import typings.chromeDashApps.chromeDashAppsNumbers.`0`
import typings.chromeDashApps.chromeDashAppsNumbers.`1`
import typings.chromeDashApps.chromeDashAppsNumbers.`2`
import typings.chromeDashApps.chromeDashAppsStrings.basic
import typings.chromeDashApps.chromeDashAppsStrings.image
import typings.chromeDashApps.chromeDashAppsStrings.list
import typings.chromeDashApps.chromeDashAppsStrings.progress
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationOptions extends js.Object {
  /**
    * @deprecated since Chrome 59. The app icon mask is not visible for Mac OS X users.
    * A URL to the app icon mask. URLs have the same restrictions as iconUrl.
    * The app icon mask should be in alpha channel,
    * as only the alpha channel of the image will be considered.
    */
  var appIconMaskUrl: js.UndefOr[String] = js.undefined
  /** Text and icons for up to two notification action buttons. */
  var buttons: js.UndefOr[js.Array[ButtonOptions]] = js.undefined
  /**
    * Alternate notification content with a lower-weight font.
    * @since Chrome 31.
    */
  var contextMessage: js.UndefOr[String] = js.undefined
  /** A timestamp associated with the notification, in milliseconds past the epoch (e.g. Date.now() + n). */
  var eventTime: js.UndefOr[double] = js.undefined
  /**
    * Optional.
    * A URL to the sender's avatar, app icon, or a thumbnail for image notifications.
    * URLs can be a data URL, a blob URL, or a URL relative to a resource within this app's .crx file Required for notifications.create method.
    */
  var iconUrl: String
  /**
    * @deprecated Deprecated since Chrome 59. The image is not visible for Mac OS X users.
    * A URL to the image thumbnail for image-type notifications.
    * URLs have the same restrictions as iconUrl.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /**
    * @deprecated Deprecated since Chrome 67. This UI hint is ignored as of Chrome 67
    * @description Whether to show UI indicating that the app will visibly respond to clicks on the body of a notification.
    */
  var isClickable: js.UndefOr[Boolean] = js.undefined
  /**
    * Items for multi-item notifications.
    * Items for multi-item notifications. Users on Mac OS X only see the first item.
    */
  var items: js.UndefOr[js.Array[ItemOptions]] = js.undefined
  /** Main notification content. Required for notifications.create method. */
  var message: String
  /**
    * Priority ranges from -2 to 2. -2 is lowest priority. 2 is highest.
    * On platforms that don't support a notification center (Windows, Linux & Mac),
    * -2 and -1 result in an error as notifications with those priorities will not be shown at all.
    * @default 0
    */
  var priority: js.UndefOr[`-2` | `-1` | `0` | `1` | `2`] = js.undefined
  /**
    * Current progress ranges from 0 to 100.
    * @since Chrome 30.
    */
  var progress: js.UndefOr[integer] = js.undefined
  /**
    * Indicates that the notification should remain visible
    * on screen until the user activates or dismisses the notification.
    * This defaults to false.
    * @since Chrome 50
    */
  var requireInteraction: js.UndefOr[Boolean] = js.undefined
  /**
    * @since Chrome 70.
    * @description Indicates that no sounds or vibrations should be made when the notification is being shown.
    * @default false
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /** Title of the notification (e.g. sender name for email). Required for notifications.create method. */
  var title: String
  /**
    * Which type of notification to display. Required for notifications.create method.
    * @see enum TemplateType
    */
  var `type`: ToStringLiteral[Anon_BASIC, String, Exclude[String, basic | image | list | progress]]
}

object NotificationOptions {
  @scala.inline
  def apply(
    iconUrl: String,
    message: String,
    title: String,
    `type`: ToStringLiteral[Anon_BASIC, String, Exclude[String, basic | image | list | progress]],
    appIconMaskUrl: String = null,
    buttons: js.Array[ButtonOptions] = null,
    contextMessage: String = null,
    eventTime: Int | Double = null,
    imageUrl: String = null,
    isClickable: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[ItemOptions] = null,
    priority: `-2` | `-1` | `0` | `1` | `2` = null,
    progress: Int | Double = null,
    requireInteraction: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined
  ): NotificationOptions = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (appIconMaskUrl != null) __obj.updateDynamic("appIconMaskUrl")(appIconMaskUrl.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (contextMessage != null) __obj.updateDynamic("contextMessage")(contextMessage.asInstanceOf[js.Any])
    if (eventTime != null) __obj.updateDynamic("eventTime")(eventTime.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(isClickable)) __obj.updateDynamic("isClickable")(isClickable.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (!js.isUndefined(requireInteraction)) __obj.updateDynamic("requireInteraction")(requireInteraction.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationOptions]
  }
}

