package typings
package chromeDashAppsLib.chromeNs.notificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.notifications")
@js.native
object ^ extends js.Object {
  /**
    * @enum
    * @property GRANTED - User has elected to show notifications from the app . This is the default at install time.
    * @property DENIED - User has elected not to show notifications from the app.
    */
  val PermissionLevel: chromeDashAppsLib.Anon_DENIED = js.native
  /**
    * @enum
    * @prop BASIC - icon, title, message, expandedMessage, up to two buttons.
    * @prop IMAGE - icon, title, message, expandedMessage, image, up to two buttons.
    * @prop LIST - icon, title, message, items, up to two buttons. Users on Mac OS X only see the first item.
    * @prop PROGRESS - icon, title, message, progress, up to two buttons.
    */
  val TemplateType: chromeDashAppsLib.Anon_BASIC = js.native
  /** The user pressed a button in the notification. */
  val onButtonClicked: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* notificationId */ java.lang.String, 
      /* buttonIndex */ chromeDashAppsLib.chromeNs.integer, 
      scala.Unit
    ]
  ] = js.native
  /** The user clicked in a non-button area of the notification. */
  val onClicked: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* notificationId */ java.lang.String, scala.Unit]] = js.native
  /** The notification closed, either by the system or by user action. */
  val onClosed: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function2[/* notificationId */ java.lang.String, /* byUser */ scala.Boolean, scala.Unit]
  ] = js.native
  /**
    * The user changes the permission level.
    * @since Chrome 32.
    */
  val onPermissionLevelChanged: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* level */ java.lang.String, scala.Unit]] = js.native
  /**
    * @deprecated Deprecated since Chrome 65. Custom notification settings button is no longer supported.
    * @description The user clicked on a link for the app's notification settings.
    * As of Chrome 47, only ChromeOS has UI that dispatches this event.
    * As of Chrome 65, that UI has been removed from ChromeOS, too.
    */
  val onShowSettings: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]] = js.native
  /**
    * Clears the specified notification.
    * @param notificationId The id of the notification to be cleared. This is returned by notifications.create method.
    * @param callback Called to indicate whether a matching notification existed.
    */
  def clear(notificationId: java.lang.String): scala.Unit = js.native
  def clear(
    notificationId: java.lang.String,
    callback: js.Function1[/* wasCleared */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Creates and displays a notification.
    * @param notificationId Identifier of the notification.
    * If not set or empty, an ID will automatically be generated.
    * If it matches an existing notification, this method first
    * clears that notification before proceeding with the create operation.
    * The notificationId parameter is required before Chrome 42.
    * @param options Contents of the notification.
    * @param [callback] Returns the notification id (either supplied or generated) that represents the created notification.
    */
  def create(notificationId: java.lang.String, options: NotificationOptions): scala.Unit = js.native
  def create(
    notificationId: java.lang.String,
    options: NotificationOptions,
    callback: js.Function1[/* notificationId */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Creates and displays a notification.
    * @param notificationId Identifier of the notification.
    * @param options Contents of the notification.
    * @param [callback] Returns the notification id (either supplied or generated) that represents the created notification.
    */
  def create(options: NotificationOptions): scala.Unit = js.native
  def create(
    options: NotificationOptions,
    callback: js.Function1[/* notificationId */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Retrieves all the active notifications.
    * @since Chrome 29.
    * @param callback Returns the set of notification_ids currently in the system.
    * Get list of notifications ids using Object.keys();
    * @example
    * getAll((result) => {
    *  console.log('Active notifications:', Object.keys(result));
    * });
    */
  def getAll(
    callback: js.Function1[
      /* notifications */ org.scalablytyped.runtime.StringDictionary[chromeDashAppsLib.chromeDashAppsLibNumbers.`true`], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Retrieves whether the user has enabled notifications from this app .
    * @since Chrome 32.
    * @param callback Returns the current permission level.
    * @see enum PermissionLevel
    */
  def getPermissionLevel(
    callback: js.Function1[
      /* level */ chromeDashAppsLib.chromeNs.ToStringLiteral[
        chromeDashAppsLib.Anon_DENIED, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_DENIED[keyof chrome-apps.Anon_DENIED] */ js.Any
        ]
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Updates an existing notification.
    * @param notificationId The id of the notification to be updated. This is returned by notifications.create method.
    * @param options Contents of the notification to update to.
    * @param [callback] Called to indicate whether a matching notification existed.
    */
  def update(notificationId: java.lang.String, options: stdLib.Partial[NotificationOptions]): scala.Unit = js.native
  def update(
    notificationId: java.lang.String,
    options: stdLib.Partial[NotificationOptions],
    callback: js.Function1[/* wasUpdated */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
}

