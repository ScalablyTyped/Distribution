package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActionEvent extends StObject {
  
  /** additional data for the event */
  var additionalData: js.UndefOr[js.Any] = js.undefined
  
  /** The mesh that is currently pointed at (can be null) */
  var meshUnderPointer: Nullable[AbstractMesh]
  
  /** The X mouse cursor position at the time of the event */
  var pointerX: Double
  
  /** The Y mouse cursor position at the time of the event */
  var pointerY: Double
  
  /** The mesh or sprite that triggered the action */
  var source: js.Any
  
  /** the original (browser) event that triggered the ActionEvent */
  var sourceEvent: js.UndefOr[js.Any] = js.undefined
}
object IActionEvent {
  
  inline def apply(pointerX: Double, pointerY: Double, source: js.Any): IActionEvent = {
    val __obj = js.Dynamic.literal(pointerX = pointerX.asInstanceOf[js.Any], pointerY = pointerY.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], meshUnderPointer = null)
    __obj.asInstanceOf[IActionEvent]
  }
  
  extension [Self <: IActionEvent](x: Self) {
    
    inline def setAdditionalData(value: js.Any): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDataUndefined: Self = StObject.set(x, "additionalData", js.undefined)
    
    inline def setMeshUnderPointer(value: Nullable[AbstractMesh]): Self = StObject.set(x, "meshUnderPointer", value.asInstanceOf[js.Any])
    
    inline def setMeshUnderPointerNull: Self = StObject.set(x, "meshUnderPointer", null)
    
    inline def setPointerX(value: Double): Self = StObject.set(x, "pointerX", value.asInstanceOf[js.Any])
    
    inline def setPointerY(value: Double): Self = StObject.set(x, "pointerY", value.asInstanceOf[js.Any])
    
    inline def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceEvent(value: js.Any): Self = StObject.set(x, "sourceEvent", value.asInstanceOf[js.Any])
    
    inline def setSourceEventUndefined: Self = StObject.set(x, "sourceEvent", js.undefined)
  }
}
