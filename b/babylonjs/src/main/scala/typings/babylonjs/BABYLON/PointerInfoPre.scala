package typings.babylonjs.BABYLON

import typings.std.MouseWheelEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerInfoPre
  extends StObject
     with PointerInfoBase {
  
  /**
    * Defines the local position of the pointer on the canvas.
    */
  var localPosition: Vector2
  
  /**
    * Ray from a pointer if availible (eg. 6dof controller)
    */
  var ray: Nullable[Ray]
  
  /**
    * Defines whether the engine should skip the next OnPointerObservable associated to this pre.
    */
  var skipOnPointerObservable: Boolean
}
object PointerInfoPre {
  
  inline def apply(
    event: PointerEvent | MouseWheelEvent,
    localPosition: Vector2,
    skipOnPointerObservable: Boolean,
    `type`: Double
  ): PointerInfoPre = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], localPosition = localPosition.asInstanceOf[js.Any], skipOnPointerObservable = skipOnPointerObservable.asInstanceOf[js.Any], ray = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerInfoPre]
  }
  
  extension [Self <: PointerInfoPre](x: Self) {
    
    inline def setLocalPosition(value: Vector2): Self = StObject.set(x, "localPosition", value.asInstanceOf[js.Any])
    
    inline def setRay(value: Nullable[Ray]): Self = StObject.set(x, "ray", value.asInstanceOf[js.Any])
    
    inline def setRayNull: Self = StObject.set(x, "ray", null)
    
    inline def setSkipOnPointerObservable(value: Boolean): Self = StObject.set(x, "skipOnPointerObservable", value.asInstanceOf[js.Any])
  }
}
