package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseListbox extends js.Object {
  var value: String = js.native
  def closeListbox(): Unit = js.native
}

object CloseListbox {
  @scala.inline
  def apply(closeListbox: () => Unit, value: String): CloseListbox = {
    val __obj = js.Dynamic.literal(closeListbox = js.Any.fromFunction0(closeListbox), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseListbox]
  }
  @scala.inline
  implicit class CloseListboxOps[Self <: CloseListbox] (val x: Self) extends AnyVal {
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
    def setCloseListbox(value: () => Unit): Self = this.set("closeListbox", js.Any.fromFunction0(value))
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

