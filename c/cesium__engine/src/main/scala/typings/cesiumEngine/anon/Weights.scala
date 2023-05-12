package typings.cesiumEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Weights extends StObject {
  
  var times: js.Array[Double]
  
  var weights: js.Array[Double]
}
object Weights {
  
  inline def apply(times: js.Array[Double], weights: js.Array[Double]): Weights = {
    val __obj = js.Dynamic.literal(times = times.asInstanceOf[js.Any], weights = weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[Weights]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Weights] (val x: Self) extends AnyVal {
    
    inline def setTimes(value: js.Array[Double]): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesVarargs(value: Double*): Self = StObject.set(x, "times", js.Array(value*))
    
    inline def setWeights(value: js.Array[Double]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
    
    inline def setWeightsVarargs(value: Double*): Self = StObject.set(x, "weights", js.Array(value*))
  }
}
