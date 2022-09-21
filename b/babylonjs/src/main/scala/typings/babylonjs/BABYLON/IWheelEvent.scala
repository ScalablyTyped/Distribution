package typings.babylonjs.BABYLON

import typings.babylonjs.BABYLON.PointerInput.MouseWheelX
import typings.babylonjs.BABYLON.PointerInput.MouseWheelY
import typings.babylonjs.BABYLON.PointerInput.MouseWheelZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWheelEvent
  extends StObject
     with IMouseEvent
     with DeviceSourceEvent[Any] {
  
  /**
    * Units for delta value
    */
  var deltaMode: Double
  
  /**
    * Horizontal scroll delta
    */
  var deltaX: Double
  
  /**
    * Vertical scroll delta
    */
  var deltaY: Double
  
  /**
    * Z-Axis scroll delta
    */
  var deltaZ: Double
  
  /**
    * Subset of possible PointerInput values for events that can only be used with mouse wheel
    */
  @JSName("inputIndex")
  var inputIndex_IWheelEvent: MouseWheelX | MouseWheelY | MouseWheelZ
  
  /**
    * WheelDelta (From MouseWheel Event)
    * @deprecated
    */
  var wheelDelta: js.UndefOr[Double] = js.undefined
}
object IWheelEvent {
  
  inline def apply(
    altKey: Boolean,
    button: Double,
    buttons: Double,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    deltaMode: Double,
    deltaX: Double,
    deltaY: Double,
    deltaZ: Double,
    inputIndex: MouseWheelX | MouseWheelY | MouseWheelZ,
    metaKey: Boolean,
    movementX: Double,
    movementY: Double,
    offsetX: Double,
    offsetY: Double,
    pageX: Double,
    pageY: Double,
    preventDefault: () => Unit,
    shiftKey: Boolean,
    target: Any,
    `type`: String,
    x: Double,
    y: Double
  ): IWheelEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], deltaMode = deltaMode.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], deltaZ = deltaZ.asInstanceOf[js.Any], inputIndex = inputIndex.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWheelEvent]
  }
  
  extension [Self <: IWheelEvent](x: Self) {
    
    inline def setDeltaMode(value: Double): Self = StObject.set(x, "deltaMode", value.asInstanceOf[js.Any])
    
    inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    inline def setDeltaZ(value: Double): Self = StObject.set(x, "deltaZ", value.asInstanceOf[js.Any])
    
    inline def setInputIndex(value: MouseWheelX | MouseWheelY | MouseWheelZ): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
    
    inline def setWheelDelta(value: Double): Self = StObject.set(x, "wheelDelta", value.asInstanceOf[js.Any])
    
    inline def setWheelDeltaUndefined: Self = StObject.set(x, "wheelDelta", js.undefined)
  }
}
