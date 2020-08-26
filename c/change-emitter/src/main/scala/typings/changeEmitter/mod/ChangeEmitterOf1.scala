package typings.changeEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEmitterOf1[T] extends js.Object {
  def emit(value: T): Unit = js.native
  def listen(listener: ListenerOf1[T]): Unlisten = js.native
}

object ChangeEmitterOf1 {
  @scala.inline
  def apply[T](emit: T => Unit, listen: ListenerOf1[T] => Unlisten): ChangeEmitterOf1[T] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), listen = js.Any.fromFunction1(listen))
    __obj.asInstanceOf[ChangeEmitterOf1[T]]
  }
  @scala.inline
  implicit class ChangeEmitterOf1Ops[Self <: ChangeEmitterOf1[_], T] (val x: Self with ChangeEmitterOf1[T]) extends AnyVal {
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
    def setEmit(value: T => Unit): Self = this.set("emit", js.Any.fromFunction1(value))
    @scala.inline
    def setListen(value: ListenerOf1[T] => Unlisten): Self = this.set("listen", js.Any.fromFunction1(value))
  }
  
}

