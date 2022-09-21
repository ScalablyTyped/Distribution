package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InTangents extends StObject {
  
  var inTangents: js.Array[Cartesian3]
  
  var outTangents: js.Array[Cartesian3]
  
  var points: js.Array[Cartesian3]
  
  var times: js.Array[Double]
}
object InTangents {
  
  inline def apply(
    inTangents: js.Array[Cartesian3],
    outTangents: js.Array[Cartesian3],
    points: js.Array[Cartesian3],
    times: js.Array[Double]
  ): InTangents = {
    val __obj = js.Dynamic.literal(inTangents = inTangents.asInstanceOf[js.Any], outTangents = outTangents.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[InTangents]
  }
  
  extension [Self <: InTangents](x: Self) {
    
    inline def setInTangents(value: js.Array[Cartesian3]): Self = StObject.set(x, "inTangents", value.asInstanceOf[js.Any])
    
    inline def setInTangentsVarargs(value: Cartesian3*): Self = StObject.set(x, "inTangents", js.Array(value*))
    
    inline def setOutTangents(value: js.Array[Cartesian3]): Self = StObject.set(x, "outTangents", value.asInstanceOf[js.Any])
    
    inline def setOutTangentsVarargs(value: Cartesian3*): Self = StObject.set(x, "outTangents", js.Array(value*))
    
    inline def setPoints(value: js.Array[Cartesian3]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Cartesian3*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setTimes(value: js.Array[Double]): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesVarargs(value: Double*): Self = StObject.set(x, "times", js.Array(value*))
  }
}
