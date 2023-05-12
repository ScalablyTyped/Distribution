package typings.cesiumEngine.anon

import typings.cesiumEngine.mod.Quaternion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointsArray extends StObject {
  
  var points: js.Array[Quaternion]
  
  var times: js.Array[Double]
}
object PointsArray {
  
  inline def apply(points: js.Array[Quaternion], times: js.Array[Double]): PointsArray = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointsArray] (val x: Self) extends AnyVal {
    
    inline def setPoints(value: js.Array[Quaternion]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Quaternion*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setTimes(value: js.Array[Double]): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesVarargs(value: Double*): Self = StObject.set(x, "times", js.Array(value*))
  }
}
