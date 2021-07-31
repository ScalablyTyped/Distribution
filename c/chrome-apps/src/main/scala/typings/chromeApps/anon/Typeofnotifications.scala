package typings.chromeApps.anon

import org.scalablytyped.runtime.StringDictionary
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chrome.integer
import typings.chromeApps.chrome.notifications.NotificationOptions
import typings.chromeApps.chromeAppsBooleans.`true`
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofnotifications extends StObject {
  
  /**
    * @enum
    * @property GRANTED - User has elected to show notifications from the app . This is the default at install time.
    * @property DENIED - User has elected not to show notifications from the app.
    */
  val PermissionLevel: DENIED = js.native
  
  /**
    * @enum
    * @prop BASIC - icon, title, message, expandedMessage, up to two buttons.
    * @prop IMAGE - icon, title, message, expandedMessage, image, up to two buttons.
    * @prop LIST - icon, title, message, items, up to two buttons. Users on Mac OS X only see the first item.
    * @prop PROGRESS - icon, title, message, progress, up to two buttons.
    */
  val TemplateType: BASIC = js.native
  
  /**
    * Clears the specified notification.
    * @param notificationId The id of the notification to be cleared. This is returned by notifications.create method.
    * @param callback Called to indicate whether a matching notification existed.
    */
  def clear(notificationId: String): Unit = js.native
  def clear(notificationId: String, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  
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
  def create(notificationId: String, options: NotificationOptions): Unit = js.native
  def create(
    notificationId: String,
    options: NotificationOptions,
    callback: js.Function1[/* notificationId */ String, Unit]
  ): Unit = js.native
  /**
    * Creates and displays a notification.
    * @param notificationId Identifier of the notification.
    * @param options Contents of the notification.
    * @param [callback] Returns the notification id (either supplied or generated) that represents the created notification.
    */
  def create(options: NotificationOptions): Unit = js.native
  def create(options: NotificationOptions, callback: js.Function1[/* notificationId */ String, Unit]): Unit = js.native
  
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
  @JSName("getAll")
  def getAll_true(callback: js.Function1[/* notifications */ StringDictionary[`true`], Unit]): Unit = js.native
  
  /**
    * Retrieves whether the user has enabled notifications from this app .
    * @since Chrome 32.
    * @param callback Returns the current permission level.
    * @see enum PermissionLevel
    */
  def getPermissionLevel(
    callback: js.Function1[
      /* level */ ToStringLiteral[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PermissionLevel */ js.Any, 
        /* keyof typeof PermissionLevel */ String, 
        Exclude[
          /* keyof typeof PermissionLevel */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PermissionLevel[keyof typeof PermissionLevel] */ js.Any
        ]
      ], 
      Unit
    ]
  ): Unit = js.native
  
  /** The user pressed a button in the notification. */
  val onButtonClicked: Event[js.Function2[/* notificationId */ String, /* buttonIndex */ integer, Unit]] = js.native
  
  /** The user clicked in a non-button area of the notification. */
  val onClicked: Event[js.Function1[/* notificationId */ String, Unit]] = js.native
  
  /** The notification closed, either by the system or by user action. */
  val onClosed: Event[js.Function2[/* notificationId */ String, /* byUser */ Boolean, Unit]] = js.native
  
  /**
    * The user changes the permission level.
    * @since Chrome 32.
    */
  val onPermissionLevelChanged: Event[js.Function1[/* level */ String, Unit]] = js.native
  
  /**
    * @deprecated Deprecated since Chrome 65. Custom notification settings button is no longer supported.
    * @description The user clicked on a link for the app's notification settings.
    * As of Chrome 47, only ChromeOS has UI that dispatches this event.
    * As of Chrome 65, that UI has been removed from ChromeOS, too.
    */
  val onShowSettings: Event[js.Function0[Unit]] = js.native
  
  /**
    * Updates an existing notification.
    * @param notificationId The id of the notification to be updated. This is returned by notifications.create method.
    * @param options Contents of the notification to update to.
    * @param [callback] Called to indicate whether a matching notification existed.
    */
  def update(notificationId: String, options: PartialNotificationOption): Unit = js.native
  def update(
    notificationId: String,
    options: PartialNotificationOption,
    callback: js.Function1[/* wasUpdated */ Boolean, Unit]
  ): Unit = js.native
}
