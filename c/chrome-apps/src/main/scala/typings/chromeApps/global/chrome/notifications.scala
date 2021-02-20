package typings.chromeApps.global.chrome

import org.scalablytyped.runtime.StringDictionary
import typings.chromeApps.anon.DENIED
import typings.chromeApps.anon.PartialNotificationOption
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.integer
import typings.chromeApps.chrome.notifications.NotificationOptions
import typings.chromeApps.chromeAppsBooleans.`true`
import typings.chromeApps.chromeAppsStrings.GRANTED
import typings.chromeApps.chromeAppsStrings.basic_
import typings.chromeApps.chromeAppsStrings.denied_
import typings.chromeApps.chromeAppsStrings.granted_
import typings.chromeApps.chromeAppsStrings.image_
import typings.chromeApps.chromeAppsStrings.list_
import typings.chromeApps.chromeAppsStrings.progress_
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion chrome.networking.*
// #region chrome.notifications
///////////////////
// Notifications //
///////////////////
/**
  * Use the chrome.notifications API to create rich notifications using
  * templates and show these notifications to users in the system tray.
  * @requires Permissions: 'notifications'
  * @since Chrome 28.
  * @see[Docs]{@link https://developer.chrome.com/extensions/notifications}
  */
object notifications {
  
  /**
    * @enum
    * @property GRANTED - User has elected to show notifications from the app . This is the default at install time.
    * @property DENIED - User has elected not to show notifications from the app.
    */
  object PermissionLevel {
    
    @JSGlobal("chrome.notifications.PermissionLevel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.notifications.PermissionLevel.DENIED")
    @js.native
    def DENIED: denied_ = js.native
    @scala.inline
    def DENIED_=(x: denied_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DENIED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.notifications.PermissionLevel.GRANTED")
    @js.native
    def GRANTED: granted_ = js.native
    @scala.inline
    def GRANTED_=(x: granted_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GRANTED")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @enum
    * @prop BASIC - icon, title, message, expandedMessage, up to two buttons.
    * @prop IMAGE - icon, title, message, expandedMessage, image, up to two buttons.
    * @prop LIST - icon, title, message, items, up to two buttons. Users on Mac OS X only see the first item.
    * @prop PROGRESS - icon, title, message, progress, up to two buttons.
    */
  object TemplateType {
    
    @JSGlobal("chrome.notifications.TemplateType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.notifications.TemplateType.BASIC")
    @js.native
    def BASIC: basic_ = js.native
    @scala.inline
    def BASIC_=(x: basic_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASIC")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.notifications.TemplateType.IMAGE")
    @js.native
    def IMAGE: image_ = js.native
    @scala.inline
    def IMAGE_=(x: image_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMAGE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.notifications.TemplateType.LIST")
    @js.native
    def LIST: list_ = js.native
    @scala.inline
    def LIST_=(x: list_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIST")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.notifications.TemplateType.PROGRESS")
    @js.native
    def PROGRESS: progress_ = js.native
    @scala.inline
    def PROGRESS_=(x: progress_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROGRESS")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Clears the specified notification.
    * @param notificationId The id of the notification to be cleared. This is returned by notifications.create method.
    * @param callback Called to indicate whether a matching notification existed.
    */
  @JSGlobal("chrome.notifications.clear")
  @js.native
  def clear(notificationId: String): Unit = js.native
  @JSGlobal("chrome.notifications.clear")
  @js.native
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
  @JSGlobal("chrome.notifications.create")
  @js.native
  def create(notificationId: String, options: NotificationOptions): Unit = js.native
  @JSGlobal("chrome.notifications.create")
  @js.native
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
  @JSGlobal("chrome.notifications.create")
  @js.native
  def create(options: NotificationOptions): Unit = js.native
  @JSGlobal("chrome.notifications.create")
  @js.native
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
  @JSGlobal("chrome.notifications.getAll")
  @js.native
  def getAll_true(callback: js.Function1[/* notifications */ StringDictionary[`true`], Unit]): Unit = js.native
  
  /**
    * Retrieves whether the user has enabled notifications from this app .
    * @since Chrome 32.
    * @param callback Returns the current permission level.
    * @see enum PermissionLevel
    */
  @JSGlobal("chrome.notifications.getPermissionLevel")
  @js.native
  def getPermissionLevel(
    callback: js.Function1[
      /* level */ ToStringLiteral[
        DENIED, 
        /* keyof chrome-apps.anon.DENIED */ GRANTED | typings.chromeApps.chromeAppsStrings.DENIED, 
        Exclude[
          /* keyof chrome-apps.anon.DENIED */ GRANTED | typings.chromeApps.chromeAppsStrings.DENIED, 
          granted_ | denied_
        ]
      ], 
      Unit
    ]
  ): Unit = js.native
  
  /** The user pressed a button in the notification. */
  @JSGlobal("chrome.notifications.onButtonClicked")
  @js.native
  val onButtonClicked: typings.chromeApps.chrome.events.Event[js.Function2[/* notificationId */ String, /* buttonIndex */ integer, Unit]] = js.native
  
  /** The user clicked in a non-button area of the notification. */
  @JSGlobal("chrome.notifications.onClicked")
  @js.native
  val onClicked: typings.chromeApps.chrome.events.Event[js.Function1[/* notificationId */ String, Unit]] = js.native
  
  /** The notification closed, either by the system or by user action. */
  @JSGlobal("chrome.notifications.onClosed")
  @js.native
  val onClosed: typings.chromeApps.chrome.events.Event[js.Function2[/* notificationId */ String, /* byUser */ Boolean, Unit]] = js.native
  
  /**
    * The user changes the permission level.
    * @since Chrome 32.
    */
  @JSGlobal("chrome.notifications.onPermissionLevelChanged")
  @js.native
  val onPermissionLevelChanged: typings.chromeApps.chrome.events.Event[js.Function1[/* level */ String, Unit]] = js.native
  
  /**
    * @deprecated Deprecated since Chrome 65. Custom notification settings button is no longer supported.
    * @description The user clicked on a link for the app's notification settings.
    * As of Chrome 47, only ChromeOS has UI that dispatches this event.
    * As of Chrome 65, that UI has been removed from ChromeOS, too.
    */
  @JSGlobal("chrome.notifications.onShowSettings")
  @js.native
  val onShowSettings: typings.chromeApps.chrome.events.Event[js.Function0[Unit]] = js.native
  
  /**
    * Updates an existing notification.
    * @param notificationId The id of the notification to be updated. This is returned by notifications.create method.
    * @param options Contents of the notification to update to.
    * @param [callback] Called to indicate whether a matching notification existed.
    */
  @JSGlobal("chrome.notifications.update")
  @js.native
  def update(notificationId: String, options: PartialNotificationOption): Unit = js.native
  @JSGlobal("chrome.notifications.update")
  @js.native
  def update(
    notificationId: String,
    options: PartialNotificationOption,
    callback: js.Function1[/* wasUpdated */ Boolean, Unit]
  ): Unit = js.native
}
