package typings
package cordovaDashPluginDashBadgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Badge extends js.Object {
  var badge: CordovaPluginBadge
}

object Anon_Badge {
  @scala.inline
  def apply(badge: CordovaPluginBadge): Anon_Badge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("badge")(badge)
    __obj.asInstanceOf[Anon_Badge]
  }
}

