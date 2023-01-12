package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiObserver[T] extends StObject {
  
  /* private */ var _observables: Any
  
  /* private */ var _observers: Any
  
  /**
    * Release associated resources
    */
  def dispose(): Unit
}
object MultiObserver {
  
  inline def apply[T](_observables: Any, _observers: Any, dispose: () => Unit): MultiObserver[T] = {
    val __obj = js.Dynamic.literal(_observables = _observables.asInstanceOf[js.Any], _observers = _observers.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[MultiObserver[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiObserver[?], T] (val x: Self & MultiObserver[T]) extends AnyVal {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def set_observables(value: Any): Self = StObject.set(x, "_observables", value.asInstanceOf[js.Any])
    
    inline def set_observers(value: Any): Self = StObject.set(x, "_observers", value.asInstanceOf[js.Any])
  }
}
