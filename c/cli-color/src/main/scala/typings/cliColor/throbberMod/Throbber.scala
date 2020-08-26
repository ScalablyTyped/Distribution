package typings.cliColor.throbberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Throbber extends js.Object {
  def restart(): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

object Throbber {
  @scala.inline
  def apply(restart: () => Unit, start: () => Unit, stop: () => Unit): Throbber = {
    val __obj = js.Dynamic.literal(restart = js.Any.fromFunction0(restart), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Throbber]
  }
  @scala.inline
  implicit class ThrobberOps[Self <: Throbber] (val x: Self) extends AnyVal {
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
    def setRestart(value: () => Unit): Self = this.set("restart", js.Any.fromFunction0(value))
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}

