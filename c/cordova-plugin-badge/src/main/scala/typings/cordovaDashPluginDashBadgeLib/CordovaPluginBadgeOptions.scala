package typings
package cordovaDashPluginDashBadgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPluginBadgeOptions extends js.Object {
  var autoClear: scala.Boolean
}

object CordovaPluginBadgeOptions {
  @scala.inline
  def apply(autoClear: scala.Boolean): CordovaPluginBadgeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoClear")(autoClear)
    __obj.asInstanceOf[CordovaPluginBadgeOptions]
  }
}

