package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashNbDashSize extends js.Object {
  
  var dashNb: js.UndefOr[Double] = js.native
  
  var dashSize: js.UndefOr[Double] = js.native
  
  var gapSize: js.UndefOr[Double] = js.native
  
  var points: js.Array[Vector3] = js.native
}
object DashNbDashSize {
  
  @scala.inline
  def apply(points: js.Array[Vector3]): DashNbDashSize = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashNbDashSize]
  }
  
  @scala.inline
  implicit class DashNbDashSizeOps[Self <: DashNbDashSize] (val x: Self) extends AnyVal {
    
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
    def setPointsVarargs(value: Vector3*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[Vector3]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashNb(value: Double): Self = this.set("dashNb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashNb: Self = this.set("dashNb", js.undefined)
    
    @scala.inline
    def setDashSize(value: Double): Self = this.set("dashSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashSize: Self = this.set("dashSize", js.undefined)
    
    @scala.inline
    def setGapSize(value: Double): Self = this.set("gapSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGapSize: Self = this.set("gapSize", js.undefined)
  }
}
