package typings.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManifestAction extends js.Object {
  var default_icon: js.UndefOr[ManifestIcons] = js.native
  var default_popup: js.UndefOr[String] = js.native
  var default_title: js.UndefOr[String] = js.native
}

object ManifestAction {
  @scala.inline
  def apply(): ManifestAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManifestAction]
  }
  @scala.inline
  implicit class ManifestActionOps[Self <: ManifestAction] (val x: Self) extends AnyVal {
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
    def setDefault_icon(value: ManifestIcons): Self = this.set("default_icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_icon: Self = this.set("default_icon", js.undefined)
    @scala.inline
    def setDefault_popup(value: String): Self = this.set("default_popup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_popup: Self = this.set("default_popup", js.undefined)
    @scala.inline
    def setDefault_title(value: String): Self = this.set("default_title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_title: Self = this.set("default_title", js.undefined)
  }
  
}

