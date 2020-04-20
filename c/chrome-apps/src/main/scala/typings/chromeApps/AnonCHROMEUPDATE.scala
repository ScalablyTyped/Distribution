package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.chrome_update_
import typings.chromeApps.chromeAppsStrings.install_
import typings.chromeApps.chromeAppsStrings.shared_module_update_
import typings.chromeApps.chromeAppsStrings.update_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCHROMEUPDATE extends js.Object {
  var CHROME_UPDATE: chrome_update_
  var INSTALL: install_
  var SHARED_MODULE_UPDATE: shared_module_update_
  var UPDATE: update_
}

object AnonCHROMEUPDATE {
  @scala.inline
  def apply(
    CHROME_UPDATE: chrome_update_,
    INSTALL: install_,
    SHARED_MODULE_UPDATE: shared_module_update_,
    UPDATE: update_
  ): AnonCHROMEUPDATE = {
    val __obj = js.Dynamic.literal(CHROME_UPDATE = CHROME_UPDATE.asInstanceOf[js.Any], INSTALL = INSTALL.asInstanceOf[js.Any], SHARED_MODULE_UPDATE = SHARED_MODULE_UPDATE.asInstanceOf[js.Any], UPDATE = UPDATE.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCHROMEUPDATE]
  }
}

