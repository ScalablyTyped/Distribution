package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.chrome_update
import typings.chromeDashApps.chromeDashAppsStrings.install
import typings.chromeDashApps.chromeDashAppsStrings.shared_module_update
import typings.chromeDashApps.chromeDashAppsStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CHROMEUPDATE extends js.Object {
  var CHROME_UPDATE: chrome_update
  var INSTALL: install
  var SHARED_MODULE_UPDATE: shared_module_update
  var UPDATE: update
}

object Anon_CHROMEUPDATE {
  @scala.inline
  def apply(
    CHROME_UPDATE: chrome_update,
    INSTALL: install,
    SHARED_MODULE_UPDATE: shared_module_update,
    UPDATE: update
  ): Anon_CHROMEUPDATE = {
    val __obj = js.Dynamic.literal(CHROME_UPDATE = CHROME_UPDATE, INSTALL = INSTALL, SHARED_MODULE_UPDATE = SHARED_MODULE_UPDATE, UPDATE = UPDATE)
  
    __obj.asInstanceOf[Anon_CHROMEUPDATE]
  }
}

