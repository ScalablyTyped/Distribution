package typings.bmapgl.anon

import typings.bmapgl.BMapGL.Polyline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Distance extends StObject {
  
  var distance: Double
  
  var points: js.Array[typings.bmapgl.BMapGL.Point]
  
  var polylines: js.Array[Polyline]
  
  var target: Any
  
  var `type`: String
}
object Distance {
  
  inline def apply(
    distance: Double,
    points: js.Array[typings.bmapgl.BMapGL.Point],
    polylines: js.Array[Polyline],
    target: Any,
    `type`: String
  ): Distance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], polylines = polylines.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
  
  extension [Self <: Distance](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: js.Array[typings.bmapgl.BMapGL.Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: typings.bmapgl.BMapGL.Point*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setPolylines(value: js.Array[Polyline]): Self = StObject.set(x, "polylines", value.asInstanceOf[js.Any])
    
    inline def setPolylinesVarargs(value: Polyline*): Self = StObject.set(x, "polylines", js.Array(value*))
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
