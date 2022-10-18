package typings.azureMsalCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryPerformanceIperformancemeasurementMod {
  
  trait IPerformanceMeasurement extends StObject {
    
    def endMeasurement(): Unit
    
    def flushMeasurement(): Double | Null
    
    def startMeasurement(): Unit
  }
  object IPerformanceMeasurement {
    
    inline def apply(endMeasurement: () => Unit, flushMeasurement: () => Double | Null, startMeasurement: () => Unit): IPerformanceMeasurement = {
      val __obj = js.Dynamic.literal(endMeasurement = js.Any.fromFunction0(endMeasurement), flushMeasurement = js.Any.fromFunction0(flushMeasurement), startMeasurement = js.Any.fromFunction0(startMeasurement))
      __obj.asInstanceOf[IPerformanceMeasurement]
    }
    
    extension [Self <: IPerformanceMeasurement](x: Self) {
      
      inline def setEndMeasurement(value: () => Unit): Self = StObject.set(x, "endMeasurement", js.Any.fromFunction0(value))
      
      inline def setFlushMeasurement(value: () => Double | Null): Self = StObject.set(x, "flushMeasurement", js.Any.fromFunction0(value))
      
      inline def setStartMeasurement(value: () => Unit): Self = StObject.set(x, "startMeasurement", js.Any.fromFunction0(value))
    }
  }
}
