package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.app_update_
import typings.chromeApps.chromeAppsStrings.os_update_
import typings.chromeApps.chromeAppsStrings.periodic_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAPPUPDATE extends js.Object {
  var APP_UPDATE: app_update_
  var OS_UPDATE: os_update_
  var PERIODIC: periodic_
}

object AnonAPPUPDATE {
  @scala.inline
  def apply(APP_UPDATE: app_update_, OS_UPDATE: os_update_, PERIODIC: periodic_): AnonAPPUPDATE = {
    val __obj = js.Dynamic.literal(APP_UPDATE = APP_UPDATE.asInstanceOf[js.Any], OS_UPDATE = OS_UPDATE.asInstanceOf[js.Any], PERIODIC = PERIODIC.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAPPUPDATE]
  }
}

