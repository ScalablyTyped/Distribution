package typings.babylonjs.BABYLON

import typings.babylonjs.PressureRecord
import typings.babylonjs.PressureSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressureObserverWrapper extends StObject {
  
  /* private */ var _currentState: Any
  
  /* private */ var _observer: Any
  
  /**
    * Release the associated resources.
    */
  def dispose(): Unit
  
  /**
    * Method that must be called to begin observing changes, and triggering callbacks.
    * @param source defines the source to observe
    */
  def observe(source: PressureSource): Unit
  
  /**
    * An event triggered when the cpu usage/speed meets certain thresholds.
    * Note: pressure is an experimental API.
    */
  var onPressureChanged: Observable[js.Array[PressureRecord]]
  
  /**
    * Method that must be called to stop observing changes and triggering callbacks (cleanup function).
    * @param source defines the source to unobserve
    */
  def unobserve(source: PressureSource): Unit
}
object PressureObserverWrapper {
  
  inline def apply(
    _currentState: Any,
    _observer: Any,
    dispose: () => Unit,
    observe: PressureSource => Unit,
    onPressureChanged: Observable[js.Array[PressureRecord]],
    unobserve: PressureSource => Unit
  ): PressureObserverWrapper = {
    val __obj = js.Dynamic.literal(_currentState = _currentState.asInstanceOf[js.Any], _observer = _observer.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), observe = js.Any.fromFunction1(observe), onPressureChanged = onPressureChanged.asInstanceOf[js.Any], unobserve = js.Any.fromFunction1(unobserve))
    __obj.asInstanceOf[PressureObserverWrapper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PressureObserverWrapper] (val x: Self) extends AnyVal {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setObserve(value: PressureSource => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction1(value))
    
    inline def setOnPressureChanged(value: Observable[js.Array[PressureRecord]]): Self = StObject.set(x, "onPressureChanged", value.asInstanceOf[js.Any])
    
    inline def setUnobserve(value: PressureSource => Unit): Self = StObject.set(x, "unobserve", js.Any.fromFunction1(value))
    
    inline def set_currentState(value: Any): Self = StObject.set(x, "_currentState", value.asInstanceOf[js.Any])
    
    inline def set_observer(value: Any): Self = StObject.set(x, "_observer", value.asInstanceOf[js.Any])
  }
}
