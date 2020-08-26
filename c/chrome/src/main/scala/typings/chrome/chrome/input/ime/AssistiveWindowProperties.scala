package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssistiveWindowProperties extends js.Object {
  var announceString: js.UndefOr[String] = js.native
  var `type`: AssistiveWindowType = js.native
  var visible: Boolean = js.native
}

object AssistiveWindowProperties {
  @scala.inline
  def apply(`type`: AssistiveWindowType, visible: Boolean): AssistiveWindowProperties = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssistiveWindowProperties]
  }
  @scala.inline
  implicit class AssistiveWindowPropertiesOps[Self <: AssistiveWindowProperties] (val x: Self) extends AnyVal {
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
    def setType(value: AssistiveWindowType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnnounceString(value: String): Self = this.set("announceString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnounceString: Self = this.set("announceString", js.undefined)
  }
  
}

