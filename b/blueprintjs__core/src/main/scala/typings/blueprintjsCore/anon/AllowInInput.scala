package typings.blueprintjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowInInput extends js.Object {
  var allowInInput: Boolean = js.native
  var disabled: Boolean = js.native
  var global: Boolean = js.native
  var preventDefault: Boolean = js.native
  var stopPropagation: Boolean = js.native
}

object AllowInInput {
  @scala.inline
  def apply(
    allowInInput: Boolean,
    disabled: Boolean,
    global: Boolean,
    preventDefault: Boolean,
    stopPropagation: Boolean
  ): AllowInInput = {
    val __obj = js.Dynamic.literal(allowInInput = allowInInput.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowInInput]
  }
  @scala.inline
  implicit class AllowInInputOps[Self <: AllowInInput] (val x: Self) extends AnyVal {
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
    def setAllowInInput(value: Boolean): Self = this.set("allowInInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventDefault(value: Boolean): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopPropagation(value: Boolean): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
  }
  
}

