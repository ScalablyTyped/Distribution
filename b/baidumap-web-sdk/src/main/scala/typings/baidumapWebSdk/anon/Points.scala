package typings.baidumapWebSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Points extends StObject {
  
  var points: js.Array[typings.baidumapWebSdk.BMap.Point] = js.native
  
  var status: Double = js.native
}
object Points {
  
  @scala.inline
  def apply(points: js.Array[typings.baidumapWebSdk.BMap.Point], status: Double): Points = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Points]
  }
  
  @scala.inline
  implicit class PointsMutableBuilder[Self <: Points] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoints(value: js.Array[typings.baidumapWebSdk.BMap.Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: typings.baidumapWebSdk.BMap.Point*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
