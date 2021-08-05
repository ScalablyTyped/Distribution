package typings.chrome.global.chrome

import typings.chrome.chrome.notifications.NotificationButtonClickedEvent
import typings.chrome.chrome.notifications.NotificationClickedEvent
import typings.chrome.chrome.notifications.NotificationClosedEvent
import typings.chrome.chrome.notifications.NotificationOptions
import typings.chrome.chrome.notifications.NotificationPermissionLevelChangedEvent
import typings.chrome.chrome.notifications.NotificationShowSettingsEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Notifications
// https://developer.chrome.com/extensions/notifications
////////////////////
/**
  * Use the chrome.notifications API to create rich notifications using templates and show these notifications to users in the system tray.
  * Permissions:  "notifications"
  * @since Chrome 28.
  */
object notifications {
  
  @JSGlobal("chrome.notifications")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clear(notificationId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(notificationId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clear(notificationId: String, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clear")(notificationId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def create(notificationId: String, options: NotificationOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(notificationId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def create(
    notificationId: String,
    options: NotificationOptions,
    callback: js.Function1[/* notificationId */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(notificationId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def create(options: NotificationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def create(options: NotificationOptions, callback: js.Function1[/* notificationId */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getAll(callback: js.Function1[/* notifications */ js.Object, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getPermissionLevel(callback: js.Function1[/* level */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPermissionLevel")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("chrome.notifications.onButtonClicked")
  @js.native
  def onButtonClicked: NotificationButtonClickedEvent = js.native
  inline def onButtonClicked_=(x: NotificationButtonClickedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onButtonClicked")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.notifications.onClicked")
  @js.native
  def onClicked: NotificationClickedEvent = js.native
  inline def onClicked_=(x: NotificationClickedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClicked")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.notifications.onClosed")
  @js.native
  def onClosed: NotificationClosedEvent = js.native
  inline def onClosed_=(x: NotificationClosedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClosed")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.notifications.onPermissionLevelChanged")
  @js.native
  def onPermissionLevelChanged: NotificationPermissionLevelChangedEvent = js.native
  inline def onPermissionLevelChanged_=(x: NotificationPermissionLevelChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPermissionLevelChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.notifications.onShowSettings")
  @js.native
  def onShowSettings: NotificationShowSettingsEvent = js.native
  inline def onShowSettings_=(x: NotificationShowSettingsEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onShowSettings")(x.asInstanceOf[js.Any])
  
  inline def update(notificationId: String, options: NotificationOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(notificationId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(
    notificationId: String,
    options: NotificationOptions,
    callback: js.Function1[/* wasUpdated */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(notificationId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
