package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerInfoBase extends StObject {
  
  /**
    * Defines the related dom event
    */
  var event: IMouseEvent
  
  /**
    * Defines the type of event (PointerEventTypes)
    */
  var `type`: Double
}
object PointerInfoBase {
  
  inline def apply(event: IMouseEvent, `type`: Double): PointerInfoBase = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerInfoBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointerInfoBase] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: IMouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
