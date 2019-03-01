package typings
package cordovaDashPluginDashBadgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var notification: Anon_Badge
}

object CordovaPlugins {
  @scala.inline
  def apply(notification: Anon_Badge): CordovaPlugins = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("notification")(notification)
    __obj.asInstanceOf[CordovaPlugins]
  }
}

