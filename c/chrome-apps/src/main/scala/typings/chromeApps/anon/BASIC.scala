package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.basic_
import typings.chromeApps.chromeAppsStrings.image_
import typings.chromeApps.chromeAppsStrings.list_
import typings.chromeApps.chromeAppsStrings.progress_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BASIC extends js.Object {
  var BASIC: basic_ = js.native
  var IMAGE: image_ = js.native
  var LIST: list_ = js.native
  var PROGRESS: progress_ = js.native
}

object BASIC {
  @scala.inline
  def apply(BASIC: basic_, IMAGE: image_, LIST: list_, PROGRESS: progress_): BASIC = {
    val __obj = js.Dynamic.literal(BASIC = BASIC.asInstanceOf[js.Any], IMAGE = IMAGE.asInstanceOf[js.Any], LIST = LIST.asInstanceOf[js.Any], PROGRESS = PROGRESS.asInstanceOf[js.Any])
    __obj.asInstanceOf[BASIC]
  }
  @scala.inline
  implicit class BASICOps[Self <: BASIC] (val x: Self) extends AnyVal {
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
    def setBASIC(value: basic_): Self = this.set("BASIC", value.asInstanceOf[js.Any])
    @scala.inline
    def setIMAGE(value: image_): Self = this.set("IMAGE", value.asInstanceOf[js.Any])
    @scala.inline
    def setLIST(value: list_): Self = this.set("LIST", value.asInstanceOf[js.Any])
    @scala.inline
    def setPROGRESS(value: progress_): Self = this.set("PROGRESS", value.asInstanceOf[js.Any])
  }
  
}

