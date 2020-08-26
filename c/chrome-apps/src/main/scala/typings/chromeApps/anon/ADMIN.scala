package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.admin_
import typings.chromeApps.chromeAppsStrings.development_
import typings.chromeApps.chromeAppsStrings.normal_
import typings.chromeApps.chromeAppsStrings.other_
import typings.chromeApps.chromeAppsStrings.sideload_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ADMIN extends js.Object {
  var ADMIN: admin_ = js.native
  var DEVELOPMENT: development_ = js.native
  var NORMAL: normal_ = js.native
  var OTHER: other_ = js.native
  var SIDELOAD: sideload_ = js.native
}

object ADMIN {
  @scala.inline
  def apply(ADMIN: admin_, DEVELOPMENT: development_, NORMAL: normal_, OTHER: other_, SIDELOAD: sideload_): ADMIN = {
    val __obj = js.Dynamic.literal(ADMIN = ADMIN.asInstanceOf[js.Any], DEVELOPMENT = DEVELOPMENT.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], OTHER = OTHER.asInstanceOf[js.Any], SIDELOAD = SIDELOAD.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADMIN]
  }
  @scala.inline
  implicit class ADMINOps[Self <: ADMIN] (val x: Self) extends AnyVal {
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
    def setADMIN(value: admin_): Self = this.set("ADMIN", value.asInstanceOf[js.Any])
    @scala.inline
    def setDEVELOPMENT(value: development_): Self = this.set("DEVELOPMENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setNORMAL(value: normal_): Self = this.set("NORMAL", value.asInstanceOf[js.Any])
    @scala.inline
    def setOTHER(value: other_): Self = this.set("OTHER", value.asInstanceOf[js.Any])
    @scala.inline
    def setSIDELOAD(value: sideload_): Self = this.set("SIDELOAD", value.asInstanceOf[js.Any])
  }
  
}

