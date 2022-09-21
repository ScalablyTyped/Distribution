package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputePressureObserverWrapper extends StObject {
  
  /* private */ var _observer: Any
  
  /**
    * Method that must be called to begin observing changes, and triggering callbacks.
    * @param source defines the source to observe
    */
  def observe(source: IComputePressureSource): Unit
  
  /**
    * Method that must be called to stop observing changes and triggering callbacks (cleanup function).
    * @param source defines the source to unobserve
    */
  def unobserve(source: IComputePressureSource): Unit
}
object ComputePressureObserverWrapper {
  
  inline def apply(_observer: Any, observe: IComputePressureSource => Unit, unobserve: IComputePressureSource => Unit): ComputePressureObserverWrapper = {
    val __obj = js.Dynamic.literal(_observer = _observer.asInstanceOf[js.Any], observe = js.Any.fromFunction1(observe), unobserve = js.Any.fromFunction1(unobserve))
    __obj.asInstanceOf[ComputePressureObserverWrapper]
  }
  
  extension [Self <: ComputePressureObserverWrapper](x: Self) {
    
    inline def setObserve(value: IComputePressureSource => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction1(value))
    
    inline def setUnobserve(value: IComputePressureSource => Unit): Self = StObject.set(x, "unobserve", js.Any.fromFunction1(value))
    
    inline def set_observer(value: Any): Self = StObject.set(x, "_observer", value.asInstanceOf[js.Any])
  }
}
