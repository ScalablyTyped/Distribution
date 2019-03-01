package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_APPUPDATE extends js.Object {
  var APP_UPDATE: chromeDashAppsLib.chromeDashAppsLibStrings.app_update
  var OS_UPDATE: chromeDashAppsLib.chromeDashAppsLibStrings.os_update
  var PERIODIC: chromeDashAppsLib.chromeDashAppsLibStrings.periodic
}

object Anon_APPUPDATE {
  @scala.inline
  def apply(
    APP_UPDATE: chromeDashAppsLib.chromeDashAppsLibStrings.app_update,
    OS_UPDATE: chromeDashAppsLib.chromeDashAppsLibStrings.os_update,
    PERIODIC: chromeDashAppsLib.chromeDashAppsLibStrings.periodic
  ): Anon_APPUPDATE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("APP_UPDATE")(APP_UPDATE)
    __obj.updateDynamic("OS_UPDATE")(OS_UPDATE)
    __obj.updateDynamic("PERIODIC")(PERIODIC)
    __obj.asInstanceOf[Anon_APPUPDATE]
  }
}

