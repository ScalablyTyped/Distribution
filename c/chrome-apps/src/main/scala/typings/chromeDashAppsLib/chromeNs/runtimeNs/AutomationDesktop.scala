package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutomationDesktop extends _AutomationOptions {
  var desktop: chromeDashAppsLib.chromeDashAppsLibNumbers.`true`
  var interact: js.UndefOr[chromeDashAppsLib.chromeDashAppsLibNumbers.`true`] = js.undefined
}

object AutomationDesktop {
  @scala.inline
  def apply(
    desktop: chromeDashAppsLib.chromeDashAppsLibNumbers.`true`,
    interact: chromeDashAppsLib.chromeDashAppsLibNumbers.`true` = null
  ): AutomationDesktop = {
    val __obj = js.Dynamic.literal(desktop = desktop)
    if (interact != null) __obj.updateDynamic("interact")(interact)
    __obj.asInstanceOf[AutomationDesktop]
  }
}

