package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActionEvent extends StObject {
  
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
  implicit class IActionEventMutableBuilder[Self <: IActionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalData(value: js.Any): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDataUndefined: Self = StObject.set(x, "additionalData", js.undefined)
    
    @scala.inline
    def setMeshUnderPointer(value: Nullable[AbstractMesh]): Self = StObject.set(x, "meshUnderPointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshUnderPointerNull: Self = StObject.set(x, "meshUnderPointer", null)
    
    @scala.inline
    def setPointerX(value: Double): Self = StObject.set(x, "pointerX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerY(value: Double): Self = StObject.set(x, "pointerY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceEvent(value: js.Any): Self = StObject.set(x, "sourceEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceEventUndefined: Self = StObject.set(x, "sourceEvent", js.undefined)
  }
}
