package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineWidget extends js.Object {
  /** Call this if you made some change to the widget's DOM node that might affect its height.
    It'll force CodeMirror to update the height of the line that contains the widget. */
  def changed(): Unit = js.native
  /** Removes the widget. */
  def clear(): Unit = js.native
}

object LineWidget {
  @scala.inline
  def apply(changed: () => Unit, clear: () => Unit): LineWidget = {
    val __obj = js.Dynamic.literal(changed = js.Any.fromFunction0(changed), clear = js.Any.fromFunction0(clear))
    __obj.asInstanceOf[LineWidget]
  }
  @scala.inline
  implicit class LineWidgetOps[Self <: LineWidget] (val x: Self) extends AnyVal {
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
    def setChanged(value: () => Unit): Self = this.set("changed", js.Any.fromFunction0(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
  }
  
}

