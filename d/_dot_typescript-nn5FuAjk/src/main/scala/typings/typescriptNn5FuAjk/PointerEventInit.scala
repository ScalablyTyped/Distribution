package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerEventInit
  extends StObject
     with MouseEventInit {
  
  var coalescedEvents: js.UndefOr[Array[PointerEvent]] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var isPrimary: js.UndefOr[scala.Boolean] = js.undefined
  
  var pointerId: js.UndefOr[Double] = js.undefined
  
  var pointerType: js.UndefOr[java.lang.String] = js.undefined
  
  var predictedEvents: js.UndefOr[Array[PointerEvent]] = js.undefined
  
  var pressure: js.UndefOr[Double] = js.undefined
  
  var tangentialPressure: js.UndefOr[Double] = js.undefined
  
  var tiltX: js.UndefOr[Double] = js.undefined
  
  var tiltY: js.UndefOr[Double] = js.undefined
  
  var twist: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PointerEventInit {
  
  inline def apply(): PointerEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointerEventInit]
  }
  
  extension [Self <: PointerEventInit](x: Self) {
    
    inline def setCoalescedEvents(value: Array[PointerEvent]): Self = StObject.set(x, "coalescedEvents", value.asInstanceOf[js.Any])
    
    inline def setCoalescedEventsUndefined: Self = StObject.set(x, "coalescedEvents", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIsPrimary(value: scala.Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    inline def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
    
    inline def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    
    inline def setPointerIdUndefined: Self = StObject.set(x, "pointerId", js.undefined)
    
    inline def setPointerType(value: java.lang.String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setPointerTypeUndefined: Self = StObject.set(x, "pointerType", js.undefined)
    
    inline def setPredictedEvents(value: Array[PointerEvent]): Self = StObject.set(x, "predictedEvents", value.asInstanceOf[js.Any])
    
    inline def setPredictedEventsUndefined: Self = StObject.set(x, "predictedEvents", js.undefined)
    
    inline def setPressure(value: Double): Self = StObject.set(x, "pressure", value.asInstanceOf[js.Any])
    
    inline def setPressureUndefined: Self = StObject.set(x, "pressure", js.undefined)
    
    inline def setTangentialPressure(value: Double): Self = StObject.set(x, "tangentialPressure", value.asInstanceOf[js.Any])
    
    inline def setTangentialPressureUndefined: Self = StObject.set(x, "tangentialPressure", js.undefined)
    
    inline def setTiltX(value: Double): Self = StObject.set(x, "tiltX", value.asInstanceOf[js.Any])
    
    inline def setTiltXUndefined: Self = StObject.set(x, "tiltX", js.undefined)
    
    inline def setTiltY(value: Double): Self = StObject.set(x, "tiltY", value.asInstanceOf[js.Any])
    
    inline def setTiltYUndefined: Self = StObject.set(x, "tiltY", js.undefined)
    
    inline def setTwist(value: Double): Self = StObject.set(x, "twist", value.asInstanceOf[js.Any])
    
    inline def setTwistUndefined: Self = StObject.set(x, "twist", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
