package typings.chartist.distCoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bounds extends StObject {
  
  var high: Double
  
  var low: Double
  
  var max: Double
  
  var min: Double
  
  var numberOfSteps: Double
  
  var oom: Double
  
  var range: Double
  
  var step: Double
  
  var valueRange: Double
  
  var values: js.Array[Double]
}
object Bounds {
  
  inline def apply(
    high: Double,
    low: Double,
    max: Double,
    min: Double,
    numberOfSteps: Double,
    oom: Double,
    range: Double,
    step: Double,
    valueRange: Double,
    values: js.Array[Double]
  ): Bounds = {
    val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], numberOfSteps = numberOfSteps.asInstanceOf[js.Any], oom = oom.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], valueRange = valueRange.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
    
    inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setNumberOfSteps(value: Double): Self = StObject.set(x, "numberOfSteps", value.asInstanceOf[js.Any])
    
    inline def setOom(value: Double): Self = StObject.set(x, "oom", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setValueRange(value: Double): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
