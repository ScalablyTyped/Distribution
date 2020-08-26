package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.chrome_update_
import typings.chromeApps.chromeAppsStrings.install_
import typings.chromeApps.chromeAppsStrings.shared_module_update_
import typings.chromeApps.chromeAppsStrings.update_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CHROMEUPDATE extends js.Object {
  var CHROME_UPDATE: chrome_update_ = js.native
  var INSTALL: install_ = js.native
  var SHARED_MODULE_UPDATE: shared_module_update_ = js.native
  var UPDATE: update_ = js.native
}

object CHROMEUPDATE {
  @scala.inline
  def apply(
    CHROME_UPDATE: chrome_update_,
    INSTALL: install_,
    SHARED_MODULE_UPDATE: shared_module_update_,
    UPDATE: update_
  ): CHROMEUPDATE = {
    val __obj = js.Dynamic.literal(CHROME_UPDATE = CHROME_UPDATE.asInstanceOf[js.Any], INSTALL = INSTALL.asInstanceOf[js.Any], SHARED_MODULE_UPDATE = SHARED_MODULE_UPDATE.asInstanceOf[js.Any], UPDATE = UPDATE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CHROMEUPDATE]
  }
  @scala.inline
  implicit class CHROMEUPDATEOps[Self <: CHROMEUPDATE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCHROME_UPDATE(value: chrome_update_): Self = this.set("CHROME_UPDATE", value.asInstanceOf[js.Any])
    @scala.inline
    def setINSTALL(value: install_): Self = this.set("INSTALL", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHARED_MODULE_UPDATE(value: shared_module_update_): Self = this.set("SHARED_MODULE_UPDATE", value.asInstanceOf[js.Any])
    @scala.inline
    def setUPDATE(value: update_): Self = this.set("UPDATE", value.asInstanceOf[js.Any])
  }
  
}

