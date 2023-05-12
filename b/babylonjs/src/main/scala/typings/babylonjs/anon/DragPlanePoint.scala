package typings.babylonjs.anon

import typings.babylonjs.eventsPointerEventsMod.PointerInfo
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragPlanePoint extends StObject {
  
  var dragPlanePoint: Vector3
  
  var pointerId: Double
  
  var pointerInfo: Nullable[PointerInfo]
}
object DragPlanePoint {
  
  inline def apply(dragPlanePoint: Vector3, pointerId: Double): DragPlanePoint = {
    val __obj = js.Dynamic.literal(dragPlanePoint = dragPlanePoint.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerInfo = null)
    __obj.asInstanceOf[DragPlanePoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragPlanePoint] (val x: Self) extends AnyVal {
    
    inline def setDragPlanePoint(value: Vector3): Self = StObject.set(x, "dragPlanePoint", value.asInstanceOf[js.Any])
    
    inline def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    
    inline def setPointerInfo(value: Nullable[PointerInfo]): Self = StObject.set(x, "pointerInfo", value.asInstanceOf[js.Any])
    
    inline def setPointerInfoNull: Self = StObject.set(x, "pointerInfo", null)
  }
}
