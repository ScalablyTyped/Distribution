package typings.changeEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEmitterOf5[T1, T2, T3, T4, T5] extends js.Object {
  def emit(value1: T1, value2: T2, value3: T3, value4: T4, value5: T5): Unit = js.native
  def listen(listener: ListenerOf5[T1, T2, T3, T4, T5]): Unlisten = js.native
}

object ChangeEmitterOf5 {
  @scala.inline
  def apply[T1, T2, T3, T4, T5](emit: (T1, T2, T3, T4, T5) => Unit, listen: ListenerOf5[T1, T2, T3, T4, T5] => Unlisten): ChangeEmitterOf5[T1, T2, T3, T4, T5] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction5(emit), listen = js.Any.fromFunction1(listen))
    __obj.asInstanceOf[ChangeEmitterOf5[T1, T2, T3, T4, T5]]
  }
  @scala.inline
  implicit class ChangeEmitterOf5Ops[Self <: ChangeEmitterOf5[_, _, _, _, _], T1, T2, T3, T4, T5] (val x: Self with (ChangeEmitterOf5[T1, T2, T3, T4, T5])) extends AnyVal {
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
    def setEmit(value: (T1, T2, T3, T4, T5) => Unit): Self = this.set("emit", js.Any.fromFunction5(value))
    @scala.inline
    def setListen(value: ListenerOf5[T1, T2, T3, T4, T5] => Unlisten): Self = this.set("listen", js.Any.fromFunction1(value))
  }
  
}

