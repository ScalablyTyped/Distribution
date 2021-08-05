package typings.babelPluginReactHtmlAttrs.mod

import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.mouse
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.pen
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.touch
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerEvent[T]
  extends StObject
     with MouseEvent[T, NativePointerEvent] {
  
  var height: Double
  
  var isPrimary: Boolean
  
  var pointerId: Double
  
  var pointerType: mouse | pen | touch
  
  var pressure: Double
  
  var tangentialPressure: Double
  
  var tiltX: Double
  
  var tiltY: Double
  
  var twist: Double
  
  var width: Double
}
object PointerEvent {
  
  inline def apply[T](
    altKey: Boolean,
    bubbles: Boolean,
    button: Double,
    buttons: Double,
    cancelable: Boolean,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    currentTarget: EventTarget & T,
    defaultPrevented: Boolean,
    detail: Double,
    eventPhase: Double,
    getModifierState: String => Boolean,
    height: Double,
    isDefaultPrevented: () => Boolean,
    isPrimary: Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    metaKey: Boolean,
    movementX: Double,
    movementY: Double,
    nativeEvent: NativePointerEvent,
    pageX: Double,
    pageY: Double,
    persist: () => Unit,
    pointerId: Double,
    pointerType: mouse | pen | touch,
    pressure: Double,
    preventDefault: () => Unit,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    tangentialPressure: Double,
    target: EventTarget,
    tiltX: Double,
    tiltY: Double,
    timeStamp: Double,
    twist: Double,
    `type`: String,
    view: AbstractView,
    width: Double
  ): PointerEvent[T] = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), height = height.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPrimary = isPrimary.asInstanceOf[js.Any], isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), tangentialPressure = tangentialPressure.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], tiltX = tiltX.asInstanceOf[js.Any], tiltY = tiltY.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], twist = twist.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], relatedTarget = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerEvent[T]]
  }
  
  extension [Self <: PointerEvent[?], T](x: Self & PointerEvent[T]) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    inline def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: mouse | pen | touch): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setPressure(value: Double): Self = StObject.set(x, "pressure", value.asInstanceOf[js.Any])
    
    inline def setTangentialPressure(value: Double): Self = StObject.set(x, "tangentialPressure", value.asInstanceOf[js.Any])
    
    inline def setTiltX(value: Double): Self = StObject.set(x, "tiltX", value.asInstanceOf[js.Any])
    
    inline def setTiltY(value: Double): Self = StObject.set(x, "tiltY", value.asInstanceOf[js.Any])
    
    inline def setTwist(value: Double): Self = StObject.set(x, "twist", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
