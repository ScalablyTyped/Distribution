package typings.cordovaPluginBadge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var notification: AnonBadge
}

object CordovaPlugins {
  @scala.inline
  def apply(notification: AnonBadge): CordovaPlugins = {
    val __obj = js.Dynamic.literal(notification = notification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

