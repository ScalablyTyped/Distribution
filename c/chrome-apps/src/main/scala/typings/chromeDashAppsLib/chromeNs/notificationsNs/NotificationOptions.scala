package typings
package chromeDashAppsLib.chromeNs.notificationsNs

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
  var appIconMaskUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Text and icons for up to two notification action buttons. */
  var buttons: js.UndefOr[js.Array[ButtonOptions]] = js.undefined
  /**
    * Alternate notification content with a lower-weight font.
    * @since Chrome 31.
    */
  var contextMessage: js.UndefOr[java.lang.String] = js.undefined
  /** A timestamp associated with the notification, in milliseconds past the epoch (e.g. Date.now() + n). */
  var eventTime: js.UndefOr[chromeDashAppsLib.chromeNs.double] = js.undefined
  /**
    * Optional.
    * A URL to the sender's avatar, app icon, or a thumbnail for image notifications.
    * URLs can be a data URL, a blob URL, or a URL relative to a resource within this app's .crx file Required for notifications.create method.
    */
  var iconUrl: java.lang.String
  /**
    * @deprecated Deprecated since Chrome 59. The image is not visible for Mac OS X users.
    * A URL to the image thumbnail for image-type notifications.
    * URLs have the same restrictions as iconUrl.
    */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @deprecated Deprecated since Chrome 67. This UI hint is ignored as of Chrome 67
    * @description Whether to show UI indicating that the app will visibly respond to clicks on the body of a notification.
    */
  var isClickable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Items for multi-item notifications.
    * Items for multi-item notifications. Users on Mac OS X only see the first item.
    */
  var items: js.UndefOr[js.Array[ItemOptions]] = js.undefined
  /** Main notification content. Required for notifications.create method. */
  var message: java.lang.String
  /**
    * Priority ranges from -2 to 2. -2 is lowest priority. 2 is highest.
    * On platforms that don't support a notification center (Windows, Linux & Mac),
    * -2 and -1 result in an error as notifications with those priorities will not be shown at all.
    * @default 0
    */
  var priority: js.UndefOr[
    chromeDashAppsLib.chromeDashAppsLibNumbers.`-2` | chromeDashAppsLib.chromeDashAppsLibNumbers.`-1` | chromeDashAppsLib.chromeDashAppsLibNumbers.`0` | chromeDashAppsLib.chromeDashAppsLibNumbers.`1` | chromeDashAppsLib.chromeDashAppsLibNumbers.`2`
  ] = js.undefined
  /**
    * Current progress ranges from 0 to 100.
    * @since Chrome 30.
    */
  var progress: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /**
    * Indicates that the notification should remain visible
    * on screen until the user activates or dismisses the notification.
    * This defaults to false.
    * @since Chrome 50
    */
  var requireInteraction: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @since Chrome 70.
    * @description Indicates that no sounds or vibrations should be made when the notification is being shown.
    * @default false
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /** Title of the notification (e.g. sender name for email). Required for notifications.create method. */
  var title: java.lang.String
  /**
    * Which type of notification to display. Required for notifications.create method.
    * @see enum TemplateType
    */
  var `type`: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_BASIC, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_BASIC[keyof chrome-apps.Anon_BASIC] */ js.Any
    ]
  ]
}

