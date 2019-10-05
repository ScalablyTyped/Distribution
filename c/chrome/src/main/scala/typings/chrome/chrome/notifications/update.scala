package typings.chrome.chrome.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.notifications.update")
@js.native
object update extends js.Object {
  def apply(notificationId: String, options: NotificationOptions): Unit = js.native
  def apply(
    notificationId: String,
    options: NotificationOptions,
    callback: js.Function1[/* wasUpdated */ Boolean, Unit]
  ): Unit = js.native
}

