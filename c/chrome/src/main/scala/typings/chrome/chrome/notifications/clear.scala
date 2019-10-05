package typings.chrome.chrome.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.notifications.clear")
@js.native
object clear extends js.Object {
  def apply(notificationId: String): Unit = js.native
  def apply(notificationId: String, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
}

