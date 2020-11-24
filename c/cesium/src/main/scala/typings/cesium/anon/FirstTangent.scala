package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstTangent extends js.Object {
  
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
  implicit class FirstTangentOps[Self <: FirstTangent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPointsVarargs(value: Cartesian3*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[Cartesian3]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimesVarargs(value: Double*): Self = this.set("times", js.Array(value :_*))
    
    @scala.inline
    def setTimes(value: js.Array[Double]): Self = this.set("times", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstTangent(value: Cartesian3): Self = this.set("firstTangent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstTangent: Self = this.set("firstTangent", js.undefined)
    
    @scala.inline
    def setLastTangent(value: Cartesian3): Self = this.set("lastTangent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastTangent: Self = this.set("lastTangent", js.undefined)
  }
}
