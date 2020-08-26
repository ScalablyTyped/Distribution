package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogFacebookResult extends js.Object {
  var buttonType: Double = js.native
  var selection: js.Array[DialogFacebookResultSelection] = js.native
}

object DialogFacebookResult {
  @scala.inline
  def apply(buttonType: Double, selection: js.Array[DialogFacebookResultSelection]): DialogFacebookResult = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogFacebookResult]
  }
  @scala.inline
  implicit class DialogFacebookResultOps[Self <: DialogFacebookResult] (val x: Self) extends AnyVal {
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
    def setButtonType(value: Double): Self = this.set("buttonType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionVarargs(value: DialogFacebookResultSelection*): Self = this.set("selection", js.Array(value :_*))
    @scala.inline
    def setSelection(value: js.Array[DialogFacebookResultSelection]): Self = this.set("selection", value.asInstanceOf[js.Any])
  }
  
}

