package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Times extends StObject {
  
  var points: js.Array[Cartesian3]
  
  var times: js.Array[Double]
}
object Times {
  
  inline def apply(points: js.Array[Cartesian3], times: js.Array[Double]): Times = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[Times]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Times] (val x: Self) extends AnyVal {
    
    inline def setPoints(value: js.Array[Cartesian3]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Cartesian3*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setTimes(value: js.Array[Double]): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesVarargs(value: Double*): Self = StObject.set(x, "times", js.Array(value*))
  }
}
