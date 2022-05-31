package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiObserver[T] extends StObject {
  
  /* private */ var _observables: js.Any
  
  /* private */ var _observers: js.Any
  
  /**
    * Release associated resources
    */
  def dispose(): Unit
}
object MultiObserver {
  
  inline def apply[T](_observables: js.Any, _observers: js.Any, dispose: () => Unit): MultiObserver[T] = {
    val __obj = js.Dynamic.literal(_observables = _observables.asInstanceOf[js.Any], _observers = _observers.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[MultiObserver[T]]
  }
  
  extension [Self <: MultiObserver[?], T](x: Self & MultiObserver[T]) {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def set_observables(value: js.Any): Self = StObject.set(x, "_observables", value.asInstanceOf[js.Any])
    
    inline def set_observers(value: js.Any): Self = StObject.set(x, "_observers", value.asInstanceOf[js.Any])
  }
}
