package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstTangent extends StObject {
  
  var firstTangent: js.UndefOr[Cartesian3] = js.undefined
  
  var lastTangent: js.UndefOr[Cartesian3] = js.undefined
  
  var points: js.Array[Cartesian3]
  
  var times: js.Array[Double]
}
object FirstTangent {
  
  inline def apply(points: js.Array[Cartesian3], times: js.Array[Double]): FirstTangent = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstTangent]
  }
  
  extension [Self <: FirstTangent](x: Self) {
    
    inline def setFirstTangent(value: Cartesian3): Self = StObject.set(x, "firstTangent", value.asInstanceOf[js.Any])
    
    inline def setFirstTangentUndefined: Self = StObject.set(x, "firstTangent", js.undefined)
    
    inline def setLastTangent(value: Cartesian3): Self = StObject.set(x, "lastTangent", value.asInstanceOf[js.Any])
    
    inline def setLastTangentUndefined: Self = StObject.set(x, "lastTangent", js.undefined)
    
    inline def setPoints(value: js.Array[Cartesian3]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Cartesian3*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setTimes(value: js.Array[Double]): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesVarargs(value: Double*): Self = StObject.set(x, "times", js.Array(value*))
  }
}
