package typings.changeEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeEmitterOf4[T1, T2, T3, T4] extends js.Object {
  
  def emit(value1: T1, value2: T2, value3: T3, value4: T4): Unit = js.native
  
  def listen(listener: ListenerOf4[T1, T2, T3, T4]): Unlisten = js.native
}
object ChangeEmitterOf4 {
  
  @scala.inline
  def apply[T1, T2, T3, T4](emit: (T1, T2, T3, T4) => Unit, listen: ListenerOf4[T1, T2, T3, T4] => Unlisten): ChangeEmitterOf4[T1, T2, T3, T4] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction4(emit), listen = js.Any.fromFunction1(listen))
    __obj.asInstanceOf[ChangeEmitterOf4[T1, T2, T3, T4]]
  }
  
  @scala.inline
  implicit class ChangeEmitterOf4Ops[Self <: ChangeEmitterOf4[_, _, _, _], T1, T2, T3, T4] (val x: Self with (ChangeEmitterOf4[T1, T2, T3, T4])) extends AnyVal {
    
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
    def setEmit(value: (T1, T2, T3, T4) => Unit): Self = this.set("emit", js.Any.fromFunction4(value))
    
    @scala.inline
    def setListen(value: ListenerOf4[T1, T2, T3, T4] => Unlisten): Self = this.set("listen", js.Any.fromFunction1(value))
  }
}
