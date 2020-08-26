package typings.ckeditor.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait buttonDefinition extends js.Object {
  var command: String = js.native
  var icon: js.UndefOr[String] = js.native
  var iconOffset: js.UndefOr[Double] = js.native
  var label: String = js.native
  var toolbar: String = js.native
}

object buttonDefinition {
  @scala.inline
  def apply(command: String, label: String, toolbar: String): buttonDefinition = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[buttonDefinition]
  }
  @scala.inline
  implicit class buttonDefinitionOps[Self <: buttonDefinition] (val x: Self) extends AnyVal {
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
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolbar(value: String): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconOffset(value: Double): Self = this.set("iconOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconOffset: Self = this.set("iconOffset", js.undefined)
  }
  
}

