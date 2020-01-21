package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.chrome_update
import typings.chromeApps.chromeAppsStrings.install
import typings.chromeApps.chromeAppsStrings.shared_module_update
import typings.chromeApps.chromeAppsStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCHROMEUPDATE extends js.Object {
  var CHROME_UPDATE: chrome_update
  var INSTALL: install
  var SHARED_MODULE_UPDATE: shared_module_update
  var UPDATE: update
}

object AnonCHROMEUPDATE {
  @scala.inline
  def apply(
    CHROME_UPDATE: chrome_update,
    INSTALL: install,
    SHARED_MODULE_UPDATE: shared_module_update,
    UPDATE: update
  ): AnonCHROMEUPDATE = {
    val __obj = js.Dynamic.literal(CHROME_UPDATE = CHROME_UPDATE.asInstanceOf[js.Any], INSTALL = INSTALL.asInstanceOf[js.Any], SHARED_MODULE_UPDATE = SHARED_MODULE_UPDATE.asInstanceOf[js.Any], UPDATE = UPDATE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCHROMEUPDATE]
  }
}

