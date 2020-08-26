package typings.browserSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormsOptions extends js.Object {
  var inputs: Boolean = js.native
  var submit: Boolean = js.native
  var toggles: Boolean = js.native
}

object FormsOptions {
  @scala.inline
  def apply(inputs: Boolean, submit: Boolean, toggles: Boolean): FormsOptions = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], toggles = toggles.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormsOptions]
  }
  @scala.inline
  implicit class FormsOptionsOps[Self <: FormsOptions] (val x: Self) extends AnyVal {
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
    def setInputs(value: Boolean): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmit(value: Boolean): Self = this.set("submit", value.asInstanceOf[js.Any])
    @scala.inline
    def setToggles(value: Boolean): Self = this.set("toggles", value.asInstanceOf[js.Any])
  }
  
}

