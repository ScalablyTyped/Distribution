package typings
package chromeLib.chromeNs.notificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.notifications")
@js.native
object ^ extends js.Object {
  var onButtonClicked: chromeLib.chromeNs.notificationsNs.NotificationButtonClickedEvent = js.native
  var onClicked: chromeLib.chromeNs.notificationsNs.NotificationClickedEvent = js.native
  var onClosed: chromeLib.chromeNs.notificationsNs.NotificationClosedEvent = js.native
  var onPermissionLevelChanged: chromeLib.chromeNs.notificationsNs.NotificationPermissionLevelChangedEvent = js.native
  var onShowSettings: chromeLib.chromeNs.notificationsNs.NotificationShowSettingsEvent = js.native
  def clear(notificationId: java.lang.String): scala.Unit = js.native
  def clear(
    notificationId: java.lang.String,
    callback: js.Function1[/* wasCleared */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def create(notificationId: java.lang.String, options: chromeLib.chromeNs.notificationsNs.NotificationOptions): scala.Unit = js.native
  def create(
    notificationId: java.lang.String,
    options: chromeLib.chromeNs.notificationsNs.NotificationOptions,
    callback: js.Function1[/* notificationId */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def create(options: chromeLib.chromeNs.notificationsNs.NotificationOptions): scala.Unit = js.native
  def create(
    options: chromeLib.chromeNs.notificationsNs.NotificationOptions,
    callback: js.Function1[/* notificationId */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def getAll(callback: js.Function1[/* notifications */ js.Object, scala.Unit]): scala.Unit = js.native
  def getPermissionLevel(callback: js.Function1[/* level */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def update(notificationId: java.lang.String, options: chromeLib.chromeNs.notificationsNs.NotificationOptions): scala.Unit = js.native
  def update(
    notificationId: java.lang.String,
    options: chromeLib.chromeNs.notificationsNs.NotificationOptions,
    callback: js.Function1[/* wasUpdated */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
}

