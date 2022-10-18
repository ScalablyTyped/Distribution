package typings.babylonjs.BABYLON

import typings.babylonjs.BABYLON.PointerInput.Horizontal
import typings.babylonjs.BABYLON.PointerInput.MouseWheelX
import typings.babylonjs.BABYLON.PointerInput.MouseWheelY
import typings.babylonjs.BABYLON.PointerInput.MouseWheelZ
import typings.babylonjs.BABYLON.PointerInput.Vertical
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPointerEvent
  extends StObject
     with IMouseEvent {
  
  /**
    * Subset of possible PointerInput values for events, excluding ones that CANNOT be in events organically and mouse wheel values
    */
  @JSName("inputIndex")
  var inputIndex_IPointerEvent: Exclude[PointerInput, Horizontal | Vertical | MouseWheelX | MouseWheelY | MouseWheelZ]
  
  /**
    * Pointer Event ID
    */
  var pointerId: Double
  
  /**
    * Type of pointer
    */
  var pointerType: String
}
object IPointerEvent {
  
  inline def apply(
    altKey: Boolean,
    button: Double,
    buttons: Double,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    inputIndex: Exclude[PointerInput, Horizontal | Vertical | MouseWheelX | MouseWheelY | MouseWheelZ],
    metaKey: Boolean,
    movementX: Double,
    movementY: Double,
    offsetX: Double,
    offsetY: Double,
    pageX: Double,
    pageY: Double,
    pointerId: Double,
    pointerType: String,
    preventDefault: () => Unit,
    shiftKey: Boolean,
    target: Any,
    `type`: String,
    x: Double,
    y: Double
  ): IPointerEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], inputIndex = inputIndex.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointerEvent]
  }
  
  extension [Self <: IPointerEvent](x: Self) {
    
    inline def setInputIndex(value: Exclude[PointerInput, Horizontal | Vertical | MouseWheelX | MouseWheelY | MouseWheelZ]): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
    
    inline def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
  }
}
