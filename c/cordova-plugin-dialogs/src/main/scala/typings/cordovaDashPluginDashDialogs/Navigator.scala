package typings.cordovaDashPluginDashDialogs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  /** This plugin provides access to some native dialog UI elements. */
  var notification: Notification
}

object Navigator {
  @scala.inline
  def apply(notification: Notification): Navigator = {
    val __obj = js.Dynamic.literal(notification = notification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Navigator]
  }
}

