package typings.changeEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeEmitterOf3[T1, T2, T3] extends js.Object {
  
  def emit(value1: T1, value2: T2, value3: T3): Unit = js.native
  
  def listen(listener: ListenerOf3[T1, T2, T3]): Unlisten = js.native
}
object ChangeEmitterOf3 {
  
  @scala.inline
  def apply[T1, T2, T3](emit: (T1, T2, T3) => Unit, listen: ListenerOf3[T1, T2, T3] => Unlisten): ChangeEmitterOf3[T1, T2, T3] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction3(emit), listen = js.Any.fromFunction1(listen))
    __obj.asInstanceOf[ChangeEmitterOf3[T1, T2, T3]]
  }
  
  @scala.inline
  implicit class ChangeEmitterOf3Ops[Self <: ChangeEmitterOf3[_, _, _], T1, T2, T3] (val x: Self with (ChangeEmitterOf3[T1, T2, T3])) extends AnyVal {
    
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
    def setEmit(value: (T1, T2, T3) => Unit): Self = this.set("emit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setListen(value: ListenerOf3[T1, T2, T3] => Unlisten): Self = this.set("listen", js.Any.fromFunction1(value))
  }
}
