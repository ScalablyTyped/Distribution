package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstTangent extends StObject {
  
  var firstTangent: js.UndefOr[Cartesian3] = js.native
  
  var lastTangent: js.UndefOr[Cartesian3] = js.native
  
  var points: js.Array[Cartesian3] = js.native
  
  var times: js.Array[Double] = js.native
}
object FirstTangent {
  
  @scala.inline
  def apply(points: js.Array[Cartesian3], times: js.Array[Double]): FirstTangent = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstTangent]
  }
  
  @scala.inline
  implicit class FirstTangentMutableBuilder[Self <: FirstTangent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstTangent(value: Cartesian3): Self = StObject.set(x, "firstTangent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstTangentUndefined: Self = StObject.set(x, "firstTangent", js.undefined)
    
    @scala.inline
    def setLastTangent(value: Cartesian3): Self = StObject.set(x, "lastTangent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTangentUndefined: Self = StObject.set(x, "lastTangent", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[Cartesian3]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: Cartesian3*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setTimes(value: js.Array[Double]): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimesVarargs(value: Double*): Self = StObject.set(x, "times", js.Array(value :_*))
  }
}
