package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CHROMEUPDATE extends js.Object {
  var CHROME_UPDATE: chromeDashAppsLib.chromeDashAppsLibStrings.chrome_update
  var INSTALL: chromeDashAppsLib.chromeDashAppsLibStrings.install
  var SHARED_MODULE_UPDATE: chromeDashAppsLib.chromeDashAppsLibStrings.shared_module_update
  var UPDATE: chromeDashAppsLib.chromeDashAppsLibStrings.update
}

object Anon_CHROMEUPDATE {
  @scala.inline
  def apply(
    CHROME_UPDATE: chromeDashAppsLib.chromeDashAppsLibStrings.chrome_update,
    INSTALL: chromeDashAppsLib.chromeDashAppsLibStrings.install,
    SHARED_MODULE_UPDATE: chromeDashAppsLib.chromeDashAppsLibStrings.shared_module_update,
    UPDATE: chromeDashAppsLib.chromeDashAppsLibStrings.update
  ): Anon_CHROMEUPDATE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CHROME_UPDATE")(CHROME_UPDATE)
    __obj.updateDynamic("INSTALL")(INSTALL)
    __obj.updateDynamic("SHARED_MODULE_UPDATE")(SHARED_MODULE_UPDATE)
    __obj.updateDynamic("UPDATE")(UPDATE)
    __obj.asInstanceOf[Anon_CHROMEUPDATE]
  }
}

