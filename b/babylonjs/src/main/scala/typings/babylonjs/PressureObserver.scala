package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressureObserver extends StObject {
  
  def disconnect(): Unit
  
  def observe(source: PressureSource): Unit
  
  def takeRecords(): js.Array[PressureRecord]
  
  def unobserve(source: PressureSource): Unit
}
object PressureObserver {
  
  inline def apply(
    disconnect: () => Unit,
    observe: PressureSource => Unit,
    takeRecords: () => js.Array[PressureRecord],
    unobserve: PressureSource => Unit
  ): PressureObserver = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction1(observe), takeRecords = js.Any.fromFunction0(takeRecords), unobserve = js.Any.fromFunction1(unobserve))
    __obj.asInstanceOf[PressureObserver]
  }
  
  extension [Self <: PressureObserver](x: Self) {
    
    inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
    
    inline def setObserve(value: PressureSource => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction1(value))
    
    inline def setTakeRecords(value: () => js.Array[PressureRecord]): Self = StObject.set(x, "takeRecords", js.Any.fromFunction0(value))
    
    inline def setUnobserve(value: PressureSource => Unit): Self = StObject.set(x, "unobserve", js.Any.fromFunction1(value))
  }
}
