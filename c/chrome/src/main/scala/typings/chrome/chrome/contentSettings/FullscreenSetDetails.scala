package typings.chrome.chrome.contentSettings

import typings.chrome.chromeStrings.allow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullscreenSetDetails extends SetDetails {
  @JSName("setting")
  var setting_FullscreenSetDetails: allow = js.native
}

object FullscreenSetDetails {
  @scala.inline
  def apply(primaryPattern: String, setting: allow): FullscreenSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullscreenSetDetails]
  }
  @scala.inline
  implicit class FullscreenSetDetailsOps[Self <: FullscreenSetDetails] (val x: Self) extends AnyVal {
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
    def setSetting(value: allow): Self = this.set("setting", value.asInstanceOf[js.Any])
  }
  
}

