package typings.chayns

import typings.chayns.chayns.dialog.buttonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogSelectResult extends js.Object {
  var buttonType: typings.chayns.chayns.dialog.buttonType = js.native
  var selection: js.Array[DialogSelectResultItem] = js.native
}

object DialogSelectResult {
  @scala.inline
  def apply(buttonType: buttonType, selection: js.Array[DialogSelectResultItem]): DialogSelectResult = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSelectResult]
  }
  @scala.inline
  implicit class DialogSelectResultOps[Self <: DialogSelectResult] (val x: Self) extends AnyVal {
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
    def setButtonType(value: buttonType): Self = this.set("buttonType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionVarargs(value: DialogSelectResultItem*): Self = this.set("selection", js.Array(value :_*))
    @scala.inline
    def setSelection(value: js.Array[DialogSelectResultItem]): Self = this.set("selection", value.asInstanceOf[js.Any])
  }
  
}

