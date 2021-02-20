package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiObserver[T] extends StObject {
  
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
  implicit class MultiObserverMutableBuilder[Self <: MultiObserver[_], T] (val x: Self with MultiObserver[T]) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_observables(value: js.Any): Self = StObject.set(x, "_observables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_observers(value: js.Any): Self = StObject.set(x, "_observers", value.asInstanceOf[js.Any])
  }
}
