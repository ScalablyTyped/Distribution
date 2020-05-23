package typings.chrome.chrome.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationOptions extends js.Object {
  /**
    * Optional.
    * A URL to the app icon mask. URLs have the same restrictions as iconUrl. The app icon mask should be in alpha channel, as only the alpha channel of the image will be considered.
    * @since Chrome 38.
    */
  var appIconMaskUrl: js.UndefOr[String] = js.undefined
  /** Optional. Text and icons for up to two notification action buttons. */
  var buttons: js.UndefOr[js.Array[ButtonOptions]] = js.undefined
  /**
    * Optional.
    * Alternate notification content with a lower-weight font.
    * @since Chrome 31.
    */
  var contextMessage: js.UndefOr[String] = js.undefined
  /** Optional. A timestamp associated with the notification, in milliseconds past the epoch (e.g. Date.now() + n). */
  var eventTime: js.UndefOr[Double] = js.undefined
  /**
    * Optional.
    * A URL to the sender's avatar, app icon, or a thumbnail for image notifications.
    * URLs can be a data URL, a blob URL, or a URL relative to a resource within this extension's .crx file Required for notifications.create method.
    */
  var iconUrl: js.UndefOr[String] = js.undefined
  /** Optional. A URL to the image thumbnail for image-type notifications. URLs have the same restrictions as iconUrl. */
  var imageUrl: js.UndefOr[String] = js.undefined
  /**
    * Optional.
    * Whether to show UI indicating that the app will visibly respond to clicks on the body of a notification.
    * @since Chrome 32.
    */
  var isClickable: js.UndefOr[Boolean] = js.undefined
  /** Optional. Items for multi-item notifications. */
  var items: js.UndefOr[js.Array[ItemOptions]] = js.undefined
  /** Optional. Main notification content. Required for notifications.create method. */
  var message: js.UndefOr[String] = js.undefined
  /** Optional. Priority ranges from -2 to 2. -2 is lowest priority. 2 is highest. Zero is default. */
  var priority: js.UndefOr[Double] = js.undefined
  /**
    * Optional.
    * Current progress ranges from 0 to 100.
    * @since Chrome 30.
    */
  var progress: js.UndefOr[Double] = js.undefined
  /**
    * Indicates that the notification should remain visible on screen until the user activates or dismisses the notification.
    * This defaults to false.
    * @since Chrome 50
    */
  var requireInteraction: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional.
    * Indicates that no sounds or vibrations should be made when the notification is being shown. This defaults to false.
    * @since Chrome 70
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /** Optional. Title of the notification (e.g. sender name for email). Required for notifications.create method. */
  var title: js.UndefOr[String] = js.undefined
  /** Optional. Which type of notification to display. Required for notifications.create method. */
  var `type`: js.UndefOr[String] = js.undefined
}

object NotificationOptions {
  @scala.inline
  def apply(
    appIconMaskUrl: String = null,
    buttons: js.Array[ButtonOptions] = null,
    contextMessage: String = null,
    eventTime: js.UndefOr[Double] = js.undefined,
    iconUrl: String = null,
    imageUrl: String = null,
    isClickable: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[ItemOptions] = null,
    message: String = null,
    priority: js.UndefOr[Double] = js.undefined,
    progress: js.UndefOr[Double] = js.undefined,
    requireInteraction: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    `type`: String = null
  ): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (appIconMaskUrl != null) __obj.updateDynamic("appIconMaskUrl")(appIconMaskUrl.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (contextMessage != null) __obj.updateDynamic("contextMessage")(contextMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(eventTime)) __obj.updateDynamic("eventTime")(eventTime.get.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(isClickable)) __obj.updateDynamic("isClickable")(isClickable.get.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(progress)) __obj.updateDynamic("progress")(progress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requireInteraction)) __obj.updateDynamic("requireInteraction")(requireInteraction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationOptions]
  }
}

