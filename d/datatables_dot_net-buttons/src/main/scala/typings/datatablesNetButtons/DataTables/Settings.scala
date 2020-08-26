package typings.datatablesNetButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  /**
    * Buttons extension options
    */
  var buttons: js.UndefOr[Boolean | (js.Array[ButtonSettings | String]) | ButtonsSettings] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
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
    def setButtonsVarargs(value: (ButtonSettings | String)*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: Boolean | (js.Array[ButtonSettings | String]) | ButtonsSettings): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
  }
  
}

