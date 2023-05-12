package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.PointerInfo
import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerId extends StObject {
  
  var dragPlanePoint: Vector3
  
  var pointerId: Double
  
  var pointerInfo: Nullable[PointerInfo]
}
object PointerId {
  
  inline def apply(dragPlanePoint: Vector3, pointerId: Double): PointerId = {
    val __obj = js.Dynamic.literal(dragPlanePoint = dragPlanePoint.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerInfo = null)
    __obj.asInstanceOf[PointerId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointerId] (val x: Self) extends AnyVal {
    
    inline def setDragPlanePoint(value: Vector3): Self = StObject.set(x, "dragPlanePoint", value.asInstanceOf[js.Any])
    
    inline def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    
    inline def setPointerInfo(value: Nullable[PointerInfo]): Self = StObject.set(x, "pointerInfo", value.asInstanceOf[js.Any])
    
    inline def setPointerInfoNull: Self = StObject.set(x, "pointerInfo", null)
  }
}
