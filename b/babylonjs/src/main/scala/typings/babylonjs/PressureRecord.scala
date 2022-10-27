package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressureRecord extends StObject {
  
  var factors: js.Array[PressureFactor]
  
  var source: PressureSource
  
  var state: PressureState
  
  var time: Double
}
object PressureRecord {
  
  inline def apply(factors: js.Array[PressureFactor], source: PressureSource, state: PressureState, time: Double): PressureRecord = {
    val __obj = js.Dynamic.literal(factors = factors.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PressureRecord]
  }
  
  extension [Self <: PressureRecord](x: Self) {
    
    inline def setFactors(value: js.Array[PressureFactor]): Self = StObject.set(x, "factors", value.asInstanceOf[js.Any])
    
    inline def setFactorsVarargs(value: PressureFactor*): Self = StObject.set(x, "factors", js.Array(value*))
    
    inline def setSource(value: PressureSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setState(value: PressureState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
