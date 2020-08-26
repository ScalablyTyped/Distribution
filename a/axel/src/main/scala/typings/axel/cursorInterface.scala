package typings.axel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cursorInterface extends js.Object {
  def off(): Unit = js.native
  def on(): Unit = js.native
  def reset(): Unit = js.native
  def restore(): Unit = js.native
}

object cursorInterface {
  @scala.inline
  def apply(off: () => Unit, on: () => Unit, reset: () => Unit, restore: () => Unit): cursorInterface = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction0(off), on = js.Any.fromFunction0(on), reset = js.Any.fromFunction0(reset), restore = js.Any.fromFunction0(restore))
    __obj.asInstanceOf[cursorInterface]
  }
  @scala.inline
  implicit class cursorInterfaceOps[Self <: cursorInterface] (val x: Self) extends AnyVal {
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
    def setOff(value: () => Unit): Self = this.set("off", js.Any.fromFunction0(value))
    @scala.inline
    def setOn(value: () => Unit): Self = this.set("on", js.Any.fromFunction0(value))
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setRestore(value: () => Unit): Self = this.set("restore", js.Any.fromFunction0(value))
  }
  
}

