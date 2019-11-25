package typings.chromeDashApps.chrome.runtime

import typings.chromeDashApps.chromeDashAppsNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutomationDesktop extends _AutomationOptions {
  var desktop: `true`
  var interact: js.UndefOr[`true`] = js.undefined
}

object AutomationDesktop {
  @scala.inline
  def apply(desktop: `true`, interact: `true` = null): AutomationDesktop = {
    val __obj = js.Dynamic.literal(desktop = desktop.asInstanceOf[js.Any])
    if (interact != null) __obj.updateDynamic("interact")(interact.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomationDesktop]
  }
}

