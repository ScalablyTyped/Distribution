package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragAxisDragPlaneNormal extends js.Object {
  
  var dragAxis: js.UndefOr[Vector3] = js.native
  
  var dragPlaneNormal: js.UndefOr[Vector3] = js.native
}
object DragAxisDragPlaneNormal {
  
  @scala.inline
  def apply(): DragAxisDragPlaneNormal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragAxisDragPlaneNormal]
  }
  
  @scala.inline
  implicit class DragAxisDragPlaneNormalOps[Self <: DragAxisDragPlaneNormal] (val x: Self) extends AnyVal {
    
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
    def setDragAxis(value: Vector3): Self = this.set("dragAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragAxis: Self = this.set("dragAxis", js.undefined)
    
    @scala.inline
    def setDragPlaneNormal(value: Vector3): Self = this.set("dragPlaneNormal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragPlaneNormal: Self = this.set("dragPlaneNormal", js.undefined)
  }
}
