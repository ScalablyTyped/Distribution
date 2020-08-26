package typings.changeEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEmitter extends js.Object {
  def emit(args: js.Any*): Unit = js.native
  def listen(listener: Listener): Unlisten = js.native
}

object ChangeEmitter {
  @scala.inline
  def apply(emit: /* repeated */ js.Any => Unit, listen: Listener => Unlisten): ChangeEmitter = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), listen = js.Any.fromFunction1(listen))
    __obj.asInstanceOf[ChangeEmitter]
  }
  @scala.inline
  implicit class ChangeEmitterOps[Self <: ChangeEmitter] (val x: Self) extends AnyVal {
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
    def setEmit(value: /* repeated */ js.Any => Unit): Self = this.set("emit", js.Any.fromFunction1(value))
    @scala.inline
    def setListen(value: Listener => Unlisten): Self = this.set("listen", js.Any.fromFunction1(value))
  }
  
}

