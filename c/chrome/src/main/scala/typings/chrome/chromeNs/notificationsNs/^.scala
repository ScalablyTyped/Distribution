package typings.chrome.chromeNs.notificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.notifications")
@js.native
object ^ extends js.Object {
  var onButtonClicked: NotificationButtonClickedEvent = js.native
  var onClicked: NotificationClickedEvent = js.native
  var onClosed: NotificationClosedEvent = js.native
  var onPermissionLevelChanged: NotificationPermissionLevelChangedEvent = js.native
  var onShowSettings: NotificationShowSettingsEvent = js.native
  def clear(notificationId: String): Unit = js.native
  def clear(notificationId: String, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  def create(notificationId: String, options: NotificationOptions): Unit = js.native
  def create(
    notificationId: String,
    options: NotificationOptions,
    callback: js.Function1[/* notificationId */ String, Unit]
  ): Unit = js.native
  def create(options: NotificationOptions): Unit = js.native
  def create(options: NotificationOptions, callback: js.Function1[/* notificationId */ String, Unit]): Unit = js.native
  def getAll(callback: js.Function1[/* notifications */ js.Object, Unit]): Unit = js.native
  def getPermissionLevel(callback: js.Function1[/* level */ String, Unit]): Unit = js.native
  def update(notificationId: String, options: NotificationOptions): Unit = js.native
  def update(
    notificationId: String,
    options: NotificationOptions,
    callback: js.Function1[/* wasUpdated */ Boolean, Unit]
  ): Unit = js.native
}

