package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragDistance extends js.Object {
  
  var delta: Vector3 = js.native
  
  var dragDistance: Double = js.native
  
  var dragPlaneNormal: Vector3 = js.native
  
  var dragPlanePoint: Vector3 = js.native
  
  var pointerId: Double = js.native
}
object DragDistance {
  
  @scala.inline
  def apply(
    delta: Vector3,
    dragDistance: Double,
    dragPlaneNormal: Vector3,
    dragPlanePoint: Vector3,
    pointerId: Double
  ): DragDistance = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], dragDistance = dragDistance.asInstanceOf[js.Any], dragPlaneNormal = dragPlaneNormal.asInstanceOf[js.Any], dragPlanePoint = dragPlanePoint.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDistance]
  }
  
  @scala.inline
  implicit class DragDistanceOps[Self <: DragDistance] (val x: Self) extends AnyVal {
    
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
    def setDelta(value: Vector3): Self = this.set("delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragDistance(value: Double): Self = this.set("dragDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragPlaneNormal(value: Vector3): Self = this.set("dragPlaneNormal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragPlanePoint(value: Vector3): Self = this.set("dragPlanePoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerId(value: Double): Self = this.set("pointerId", value.asInstanceOf[js.Any])
  }
}
