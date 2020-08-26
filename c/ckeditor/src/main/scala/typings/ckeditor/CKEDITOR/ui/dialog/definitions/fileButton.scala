package typings.ckeditor.CKEDITOR.ui.dialog.definitions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait fileButton extends js.Object {
  var `for`: String = js.native
  var validate: js.UndefOr[js.Function0[Boolean]] = js.native
}

object fileButton {
  @scala.inline
  def apply(`for`: String): fileButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    __obj.asInstanceOf[fileButton]
  }
  @scala.inline
  implicit class fileButtonOps[Self <: fileButton] (val x: Self) extends AnyVal {
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
    def setFor(value: String): Self = this.set("for", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidate(value: () => Boolean): Self = this.set("validate", js.Any.fromFunction0(value))
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
  
}

