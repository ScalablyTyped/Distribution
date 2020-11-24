package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActionEvent extends js.Object {
  
  /** additional data for the event */
  var additionalData: js.UndefOr[js.Any] = js.native
  
  /** The mesh that is currently pointed at (can be null) */
  var meshUnderPointer: Nullable[AbstractMesh] = js.native
  
  /** The X mouse cursor position at the time of the event */
  var pointerX: Double = js.native
  
  /** The Y mouse cursor position at the time of the event */
  var pointerY: Double = js.native
  
  /** The mesh or sprite that triggered the action */
  var source: js.Any = js.native
  
  /** the original (browser) event that triggered the ActionEvent */
  var sourceEvent: js.UndefOr[js.Any] = js.native
}
object IActionEvent {
  
  @scala.inline
  def apply(pointerX: Double, pointerY: Double, source: js.Any): IActionEvent = {
    val __obj = js.Dynamic.literal(pointerX = pointerX.asInstanceOf[js.Any], pointerY = pointerY.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionEvent]
  }
  
  @scala.inline
  implicit class IActionEventOps[Self <: IActionEvent] (val x: Self) extends AnyVal {
    
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
    def setPointerX(value: Double): Self = this.set("pointerX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerY(value: Double): Self = this.set("pointerY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalData(value: js.Any): Self = this.set("additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalData: Self = this.set("additionalData", js.undefined)
    
    @scala.inline
    def setMeshUnderPointer(value: Nullable[AbstractMesh]): Self = this.set("meshUnderPointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshUnderPointerNull: Self = this.set("meshUnderPointer", null)
    
    @scala.inline
    def setSourceEvent(value: js.Any): Self = this.set("sourceEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceEvent: Self = this.set("sourceEvent", js.undefined)
  }
}
