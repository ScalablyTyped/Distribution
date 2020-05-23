package typings.cordovaPluginBadge

import typings.cordovaPluginBadge.anon.Badge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var notification: Badge
}

object CordovaPlugins {
  @scala.inline
  def apply(notification: Badge): CordovaPlugins = {
    val __obj = js.Dynamic.literal(notification = notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
}

