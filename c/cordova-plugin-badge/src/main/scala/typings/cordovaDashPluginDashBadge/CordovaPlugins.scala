package typings.cordovaDashPluginDashBadge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var notification: Anon_Badge
}

object CordovaPlugins {
  @scala.inline
  def apply(notification: Anon_Badge): CordovaPlugins = {
    val __obj = js.Dynamic.literal(notification = notification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

