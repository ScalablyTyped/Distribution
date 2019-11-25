package typings.cordovaDashPluginDashBadge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPluginBadgeOptions extends js.Object {
  var autoClear: Boolean
}

object CordovaPluginBadgeOptions {
  @scala.inline
  def apply(autoClear: Boolean): CordovaPluginBadgeOptions = {
    val __obj = js.Dynamic.literal(autoClear = autoClear.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CordovaPluginBadgeOptions]
  }
}

