package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UI Functions
  * Floating Button
  * chayns
  * interfaces
  */
// chayns.showFloatingButton()
@js.native
trait FloatingConfig extends js.Object {
  var color: js.UndefOr[String] = js.native
  var colorText: js.UndefOr[String] = js.native
  var icon: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
}

object FloatingConfig {
  @scala.inline
  def apply(): FloatingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloatingConfig]
  }
  @scala.inline
  implicit class FloatingConfigOps[Self <: FloatingConfig] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColorText(value: String): Self = this.set("colorText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorText: Self = this.set("colorText", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

