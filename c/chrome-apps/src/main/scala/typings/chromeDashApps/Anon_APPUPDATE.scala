package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.app_update
import typings.chromeDashApps.chromeDashAppsStrings.os_update
import typings.chromeDashApps.chromeDashAppsStrings.periodic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_APPUPDATE extends js.Object {
  var APP_UPDATE: app_update
  var OS_UPDATE: os_update
  var PERIODIC: periodic
}

object Anon_APPUPDATE {
  @scala.inline
  def apply(APP_UPDATE: app_update, OS_UPDATE: os_update, PERIODIC: periodic): Anon_APPUPDATE = {
    val __obj = js.Dynamic.literal(APP_UPDATE = APP_UPDATE.asInstanceOf[js.Any], OS_UPDATE = OS_UPDATE.asInstanceOf[js.Any], PERIODIC = PERIODIC.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_APPUPDATE]
  }
}

