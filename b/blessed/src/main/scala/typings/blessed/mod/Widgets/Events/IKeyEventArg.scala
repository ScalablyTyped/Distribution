package typings.blessed.mod.Widgets.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyEventArg extends js.Object {
  var ctrl: Boolean = js.native
  var full: String = js.native
  var meta: Boolean = js.native
  var name: String = js.native
  var sequence: String = js.native
  var shift: Boolean = js.native
}

object IKeyEventArg {
  @scala.inline
  def apply(ctrl: Boolean, full: String, meta: Boolean, name: String, sequence: String, shift: Boolean): IKeyEventArg = {
    val __obj = js.Dynamic.literal(ctrl = ctrl.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyEventArg]
  }
  @scala.inline
  implicit class IKeyEventArgOps[Self <: IKeyEventArg] (val x: Self) extends AnyVal {
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
    def setCtrl(value: Boolean): Self = this.set("ctrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setFull(value: String): Self = this.set("full", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: Boolean): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequence(value: String): Self = this.set("sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def setShift(value: Boolean): Self = this.set("shift", value.asInstanceOf[js.Any])
  }
  
}

