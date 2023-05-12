package typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubMeasurement extends StObject {
  
  var name: PerformanceEvents
  
  var startTimeMs: Double
}
object SubMeasurement {
  
  inline def apply(name: PerformanceEvents, startTimeMs: Double): SubMeasurement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], startTimeMs = startTimeMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubMeasurement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubMeasurement] (val x: Self) extends AnyVal {
    
    inline def setName(value: PerformanceEvents): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStartTimeMs(value: Double): Self = StObject.set(x, "startTimeMs", value.asInstanceOf[js.Any])
  }
}
