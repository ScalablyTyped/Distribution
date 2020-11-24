package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiObserver[T] extends js.Object {
  
  var _observables: js.Any = js.native
  
  var _observers: js.Any = js.native
  
  /**
    * Release associated resources
    */
  def dispose(): Unit = js.native
}
object MultiObserver {
  
  @scala.inline
  def apply[T](_observables: js.Any, _observers: js.Any, dispose: () => Unit): MultiObserver[T] = {
    val __obj = js.Dynamic.literal(_observables = _observables.asInstanceOf[js.Any], _observers = _observers.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[MultiObserver[T]]
  }
  
  @scala.inline
  implicit class MultiObserverOps[Self <: MultiObserver[_], T] (val x: Self with MultiObserver[T]) extends AnyVal {
    
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
    def set_observables(value: js.Any): Self = this.set("_observables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_observers(value: js.Any): Self = this.set("_observers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
  }
}
