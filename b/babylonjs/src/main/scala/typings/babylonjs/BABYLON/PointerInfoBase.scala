package typings.babylonjs.BABYLON

import typings.std.MouseWheelEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerInfoBase extends StObject {
  
  /**
    * Defines the related dom event
    */
  var event: PointerEvent | MouseWheelEvent
  
  /**
    * Defines the type of event (PointerEventTypes)
    */
  var `type`: Double
}
object PointerInfoBase {
  
  inline def apply(event: PointerEvent | MouseWheelEvent, `type`: Double): PointerInfoBase = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerInfoBase]
  }
  
  extension [Self <: PointerInfoBase](x: Self) {
    
    inline def setEvent(value: PointerEvent | MouseWheelEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
