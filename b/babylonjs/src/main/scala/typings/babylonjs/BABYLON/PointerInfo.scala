package typings.babylonjs.BABYLON

import typings.std.MouseWheelEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerInfo
  extends StObject
     with PointerInfoBase {
  
  /**
    * Defines the picking info associated to the info (if any)\
    */
  var pickInfo: Nullable[PickingInfo]
}
object PointerInfo {
  
  inline def apply(event: PointerEvent | MouseWheelEvent, `type`: Double): PointerInfo = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], pickInfo = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerInfo]
  }
  
  extension [Self <: PointerInfo](x: Self) {
    
    inline def setPickInfo(value: Nullable[PickingInfo]): Self = StObject.set(x, "pickInfo", value.asInstanceOf[js.Any])
    
    inline def setPickInfoNull: Self = StObject.set(x, "pickInfo", null)
  }
}
