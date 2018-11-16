package typings
package chromeLib.chromeNs.notificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NotificationOptions extends js.Object {
  /**
           * Optional.
           * A URL to the app icon mask. URLs have the same restrictions as iconUrl. The app icon mask should be in alpha channel, as only the alpha channel of the image will be considered.
           * @since Chrome 38.
           */
  var appIconMaskUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Text and icons for up to two notification action buttons. */
  var buttons: js.UndefOr[js.Array[ButtonOptions]] = js.undefined
  /**
           * Optional.
           * Alternate notification content with a lower-weight font.
           * @since Chrome 31.
           */
  var contextMessage: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. A timestamp associated with the notification, in milliseconds past the epoch (e.g. Date.now() + n). */
  var eventTime: js.UndefOr[scala.Double] = js.undefined
  /**
           * Optional.
           * A URL to the sender's avatar, app icon, or a thumbnail for image notifications.
           * URLs can be a data URL, a blob URL, or a URL relative to a resource within this extension's .crx file Required for notifications.create method.
           */
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. A URL to the image thumbnail for image-type notifications. URLs have the same restrictions as iconUrl. */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Optional.
           * Whether to show UI indicating that the app will visibly respond to clicks on the body of a notification.
           * @since Chrome 32.
           */
  var isClickable: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. Items for multi-item notifications. */
  var items: js.UndefOr[js.Array[ItemOptions]] = js.undefined
  /** Optional. Main notification content. Required for notifications.create method. */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Priority ranges from -2 to 2. -2 is lowest priority. 2 is highest. Zero is default. */
  var priority: js.UndefOr[scala.Double] = js.undefined
  /**
           * Optional.
           * Current progress ranges from 0 to 100.
           * @since Chrome 30.
           */
  var progress: js.UndefOr[scala.Double] = js.undefined
  /**
           * Indicates that the notification should remain visible on screen until the user activates or dismisses the notification.
           * This defaults to false.
           * @since Chrome 50
           */
  var requireInteraction: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. Title of the notification (e.g. sender name for email). Required for notifications.create method. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Which type of notification to display. Required for notifications.create method. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

