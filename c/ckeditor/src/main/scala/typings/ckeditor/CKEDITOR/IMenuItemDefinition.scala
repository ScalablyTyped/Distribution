package typings.ckeditor.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMenuItemDefinition extends js.Object {
  var command: String = js.native
  var group: String = js.native
  var icon: String = js.native
  var label: String = js.native
  var order: Double = js.native
}

object IMenuItemDefinition {
  @scala.inline
  def apply(command: String, group: String, icon: String, label: String, order: Double): IMenuItemDefinition = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMenuItemDefinition]
  }
  @scala.inline
  implicit class IMenuItemDefinitionOps[Self <: IMenuItemDefinition] (val x: Self) extends AnyVal {
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
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
  }
  
}

