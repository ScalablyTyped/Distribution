package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardInfo extends StObject {
  
  /**
    * Defines the related dom event
    */
  var event: IKeyboardEvent
  
  /**
    * Defines the type of event (KeyboardEventTypes)
    */
  var `type`: Double
}
object KeyboardInfo {
  
  inline def apply(event: IKeyboardEvent, `type`: Double): KeyboardInfo = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyboardInfo] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: IKeyboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
