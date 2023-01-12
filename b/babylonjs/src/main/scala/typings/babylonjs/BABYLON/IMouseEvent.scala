package typings.babylonjs.BABYLON

import typings.babylonjs.BABYLON.PointerInput.Horizontal
import typings.babylonjs.BABYLON.PointerInput.Vertical
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseEvent
  extends StObject
     with IUIEvent {
  
  /**
    * Status of Alt key being pressed
    */
  var altKey: Boolean
  
  /**
    * Value of single mouse button pressed
    */
  var button: Double
  
  /**
    * Value of all mouse buttons pressed
    */
  var buttons: Double
  
  /**
    * Current X coordinate
    */
  var clientX: Double
  
  /**
    * Current Y coordinate
    */
  var clientY: Double
  
  /**
    * Status of Ctrl key being pressed
    */
  var ctrlKey: Boolean
  
  /**
    * Provides current click count
    */
  var detail: js.UndefOr[Double] = js.undefined
  
  /**
    * Subset of possible PointerInput values for events, excluding ones that CANNOT be in events organically
    */
  @JSName("inputIndex")
  var inputIndex_IMouseEvent: Exclude[PointerInput, Horizontal | Vertical]
  
  /**
    * Status of Meta key (eg. Windows key) being pressed
    */
  var metaKey: Boolean
  
  /**
    * Delta of movement on X axis
    */
  var movementX: Double
  
  /**
    * Delta of movement on Y axis
    */
  var movementY: Double
  
  /**
    * Delta of movement on X axis
    * @deprecated Use 'movementX' instead
    */
  var mozMovementX: js.UndefOr[Double] = js.undefined
  
  /**
    * Delta of movement on Y axis
    * @deprecated Use 'movementY' instead
    */
  var mozMovementY: js.UndefOr[Double] = js.undefined
  
  /**
    * Delta of movement on X axis
    * @deprecated Use 'movementX' instead
    */
  var msMovementX: js.UndefOr[Double] = js.undefined
  
  /**
    * Delta of movement on Y axis
    * @deprecated Use 'movementY' instead
    */
  var msMovementY: js.UndefOr[Double] = js.undefined
  
  /**
    * Current coordinate of X within container
    */
  var offsetX: Double
  
  /**
    * Current coordinate of Y within container
    */
  var offsetY: Double
  
  /**
    * Horizontal coordinate of event
    */
  var pageX: Double
  
  /**
    * Vertical coordinate of event
    */
  var pageY: Double
  
  /**
    * Status of Shift key being pressed
    */
  var shiftKey: Boolean
  
  /**
    * Delta of movement on X axis
    * @deprecated Use 'movementX' instead
    */
  var webkitMovementX: js.UndefOr[Double] = js.undefined
  
  /**
    * Delta of movement on Y axis
    * @deprecated Use 'movementY' instead
    */
  var webkitMovementY: js.UndefOr[Double] = js.undefined
  
  /**
    * Alias of clientX
    */
  var x: Double
  
  /**
    * Alias of clientY
    */
  var y: Double
}
object IMouseEvent {
  
  inline def apply(
    altKey: Boolean,
    button: Double,
    buttons: Double,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    inputIndex: Exclude[PointerInput, Horizontal | Vertical],
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
  ): IMouseEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], inputIndex = inputIndex.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMouseEvent] (val x: Self) extends AnyVal {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
    
    inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setInputIndex(value: Exclude[PointerInput, Horizontal | Vertical]): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
    
    inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    inline def setMovementX(value: Double): Self = StObject.set(x, "movementX", value.asInstanceOf[js.Any])
    
    inline def setMovementY(value: Double): Self = StObject.set(x, "movementY", value.asInstanceOf[js.Any])
    
    inline def setMozMovementX(value: Double): Self = StObject.set(x, "mozMovementX", value.asInstanceOf[js.Any])
    
    inline def setMozMovementXUndefined: Self = StObject.set(x, "mozMovementX", js.undefined)
    
    inline def setMozMovementY(value: Double): Self = StObject.set(x, "mozMovementY", value.asInstanceOf[js.Any])
    
    inline def setMozMovementYUndefined: Self = StObject.set(x, "mozMovementY", js.undefined)
    
    inline def setMsMovementX(value: Double): Self = StObject.set(x, "msMovementX", value.asInstanceOf[js.Any])
    
    inline def setMsMovementXUndefined: Self = StObject.set(x, "msMovementX", js.undefined)
    
    inline def setMsMovementY(value: Double): Self = StObject.set(x, "msMovementY", value.asInstanceOf[js.Any])
    
    inline def setMsMovementYUndefined: Self = StObject.set(x, "msMovementY", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    inline def setWebkitMovementX(value: Double): Self = StObject.set(x, "webkitMovementX", value.asInstanceOf[js.Any])
    
    inline def setWebkitMovementXUndefined: Self = StObject.set(x, "webkitMovementX", js.undefined)
    
    inline def setWebkitMovementY(value: Double): Self = StObject.set(x, "webkitMovementY", value.asInstanceOf[js.Any])
    
    inline def setWebkitMovementYUndefined: Self = StObject.set(x, "webkitMovementY", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
