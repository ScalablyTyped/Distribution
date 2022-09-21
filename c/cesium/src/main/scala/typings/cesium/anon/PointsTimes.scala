package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointsTimes extends StObject {
  
  var points: js.Array[Cartesian3 | Double]
  
  var times: js.Array[Double]
}
object PointsTimes {
  
  inline def apply(points: js.Array[Cartesian3 | Double], times: js.Array[Double]): PointsTimes = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointsTimes]
  }
  
  extension [Self <: PointsTimes](x: Self) {
    
    inline def setPoints(value: js.Array[Cartesian3 | Double]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: (Cartesian3 | Double)*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setTimes(value: js.Array[Double]): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesVarargs(value: Double*): Self = StObject.set(x, "times", js.Array(value*))
  }
}
