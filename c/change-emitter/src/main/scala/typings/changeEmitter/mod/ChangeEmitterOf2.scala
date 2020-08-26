package typings.changeEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEmitterOf2[T1, T2] extends js.Object {
  def emit(value1: T1, value2: T2): Unit = js.native
  def listen(listener: ListenerOf2[T1, T2]): Unlisten = js.native
}

object ChangeEmitterOf2 {
  @scala.inline
  def apply[T1, T2](emit: (T1, T2) => Unit, listen: ListenerOf2[T1, T2] => Unlisten): ChangeEmitterOf2[T1, T2] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), listen = js.Any.fromFunction1(listen))
    __obj.asInstanceOf[ChangeEmitterOf2[T1, T2]]
  }
  @scala.inline
  implicit class ChangeEmitterOf2Ops[Self <: ChangeEmitterOf2[_, _], T1, T2] (val x: Self with (ChangeEmitterOf2[T1, T2])) extends AnyVal {
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
    def setEmit(value: (T1, T2) => Unit): Self = this.set("emit", js.Any.fromFunction2(value))
    @scala.inline
    def setListen(value: ListenerOf2[T1, T2] => Unlisten): Self = this.set("listen", js.Any.fromFunction1(value))
  }
  
}

