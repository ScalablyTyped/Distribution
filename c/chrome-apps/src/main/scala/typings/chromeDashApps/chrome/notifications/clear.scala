package typings.chromeDashApps.chrome.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.notifications.clear")
@js.native
object clear extends js.Object {
  /**
    * Clears the specified notification.
    * @param notificationId The id of the notification to be cleared. This is returned by notifications.create method.
    * @param callback Called to indicate whether a matching notification existed.
    */
  def apply(notificationId: String): Unit = js.native
  def apply(notificationId: String, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
}

