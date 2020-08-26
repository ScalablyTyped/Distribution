package typings.ckeditor.CKEDITOR.dialog.definition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait textInput extends labeledElement {
  var bidi: js.UndefOr[Boolean] = js.native
  var default: js.UndefOr[String] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
  var validate: js.UndefOr[js.Function0[Boolean]] = js.native
}

object textInput {
  @scala.inline
  def apply(): textInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[textInput]
  }
  @scala.inline
  implicit class textInputOps[Self <: textInput] (val x: Self) extends AnyVal {
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
    def setBidi(value: Boolean): Self = this.set("bidi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBidi: Self = this.set("bidi", js.undefined)
    @scala.inline
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setValidate(value: () => Boolean): Self = this.set("validate", js.Any.fromFunction0(value))
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
  
}

