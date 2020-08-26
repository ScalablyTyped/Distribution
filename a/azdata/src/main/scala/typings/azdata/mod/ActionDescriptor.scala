package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionDescriptor extends js.Object {
  /**
    * Name of the clickable action. If not defined then no action will be shown
    */
  var actionTitle: js.UndefOr[String] = js.native
  /**
    * Data sent on callback being run.
    */
  var callbackData: js.UndefOr[js.Any] = js.native
  /**
    * User-visible label to display
    */
  var label: String = js.native
}

object ActionDescriptor {
  @scala.inline
  def apply(label: String): ActionDescriptor = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionDescriptor]
  }
  @scala.inline
  implicit class ActionDescriptorOps[Self <: ActionDescriptor] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionTitle(value: String): Self = this.set("actionTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionTitle: Self = this.set("actionTitle", js.undefined)
    @scala.inline
    def setCallbackData(value: js.Any): Self = this.set("callbackData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbackData: Self = this.set("callbackData", js.undefined)
  }
  
}

