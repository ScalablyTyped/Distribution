package typings.baidumapWebSdk.anon

import typings.baidumapWebSdk.BMap.Polyline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Distance extends StObject {
  
  var distance: Double = js.native
  
  var points: js.Array[typings.baidumapWebSdk.BMap.Point] = js.native
  
  var polylines: js.Array[Polyline] = js.native
  
  var target: js.Any = js.native
  
  var `type`: String = js.native
}
object Distance {
  
  @scala.inline
  def apply(
    distance: Double,
    points: js.Array[typings.baidumapWebSdk.BMap.Point],
    polylines: js.Array[Polyline],
    target: js.Any,
    `type`: String
  ): Distance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], polylines = polylines.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
  
  @scala.inline
  implicit class DistanceMutableBuilder[Self <: Distance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: js.Array[typings.baidumapWebSdk.BMap.Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: typings.baidumapWebSdk.BMap.Point*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setPolylines(value: js.Array[Polyline]): Self = StObject.set(x, "polylines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylinesVarargs(value: Polyline*): Self = StObject.set(x, "polylines", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
