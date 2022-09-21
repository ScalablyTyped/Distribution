package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastTangent extends StObject {
  
  var firstTangent: Cartesian3
  
  var lastTangent: Cartesian3
  
  var points: js.Array[Cartesian3 | Double]
  
  var times: js.Array[Double]
}
object LastTangent {
  
  inline def apply(
    firstTangent: Cartesian3,
    lastTangent: Cartesian3,
    points: js.Array[Cartesian3 | Double],
    times: js.Array[Double]
  ): LastTangent = {
    val __obj = js.Dynamic.literal(firstTangent = firstTangent.asInstanceOf[js.Any], lastTangent = lastTangent.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastTangent]
  }
  
  extension [Self <: LastTangent](x: Self) {
    
    inline def setFirstTangent(value: Cartesian3): Self = StObject.set(x, "firstTangent", value.asInstanceOf[js.Any])
    
    inline def setLastTangent(value: Cartesian3): Self = StObject.set(x, "lastTangent", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: js.Array[Cartesian3 | Double]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: (Cartesian3 | Double)*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setTimes(value: js.Array[Double]): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesVarargs(value: Double*): Self = StObject.set(x, "times", js.Array(value*))
  }
}
