package typings.chrome.global.chrome

import typings.chrome.chrome.notifications.NotificationButtonClickedEvent
import typings.chrome.chrome.notifications.NotificationClickedEvent
import typings.chrome.chrome.notifications.NotificationClosedEvent
import typings.chrome.chrome.notifications.NotificationOptions
import typings.chrome.chrome.notifications.NotificationPermissionLevelChangedEvent
import typings.chrome.chrome.notifications.NotificationShowSettingsEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @JSGlobal("chrome.notifications.clear")
  @js.native
  def clear(notificationId: String): Unit = js.native
  @JSGlobal("chrome.notifications.clear")
  @js.native
  def clear(notificationId: String, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  
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
  @JSGlobal("chrome.notifications.create")
  @js.native
  def create(options: NotificationOptions): Unit = js.native
  @JSGlobal("chrome.notifications.create")
  @js.native
  def create(options: NotificationOptions, callback: js.Function1[/* notificationId */ String, Unit]): Unit = js.native
  
  @JSGlobal("chrome.notifications.getAll")
  @js.native
  def getAll(callback: js.Function1[/* notifications */ js.Object, Unit]): Unit = js.native
  
  @JSGlobal("chrome.notifications.getPermissionLevel")
  @js.native
  def getPermissionLevel(callback: js.Function1[/* level */ String, Unit]): Unit = js.native
  
  @JSGlobal("chrome.notifications.onButtonClicked")
  @js.native
  def onButtonClicked: NotificationButtonClickedEvent = js.native
  @scala.inline
  def onButtonClicked_=(x: NotificationButtonClickedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onButtonClicked")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.notifications.onClicked")
  @js.native
  def onClicked: NotificationClickedEvent = js.native
  @scala.inline
  def onClicked_=(x: NotificationClickedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClicked")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.notifications.onClosed")
  @js.native
  def onClosed: NotificationClosedEvent = js.native
  @scala.inline
  def onClosed_=(x: NotificationClosedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClosed")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.notifications.onPermissionLevelChanged")
  @js.native
  def onPermissionLevelChanged: NotificationPermissionLevelChangedEvent = js.native
  @scala.inline
  def onPermissionLevelChanged_=(x: NotificationPermissionLevelChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPermissionLevelChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.notifications.onShowSettings")
  @js.native
  def onShowSettings: NotificationShowSettingsEvent = js.native
  @scala.inline
  def onShowSettings_=(x: NotificationShowSettingsEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onShowSettings")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.notifications.update")
  @js.native
  def update(notificationId: String, options: NotificationOptions): Unit = js.native
  @JSGlobal("chrome.notifications.update")
  @js.native
  def update(
    notificationId: String,
    options: NotificationOptions,
    callback: js.Function1[/* wasUpdated */ Boolean, Unit]
  ): Unit = js.native
}
