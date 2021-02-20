package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerId extends StObject {
  
  var dragPlanePoint: Vector3 = js.native
  
  var pointerId: Double = js.native
}
object PointerId {
  
  @scala.inline
  def apply(dragPlanePoint: Vector3, pointerId: Double): PointerId = {
    val __obj = js.Dynamic.literal(dragPlanePoint = dragPlanePoint.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerId]
  }
  
  @scala.inline
  implicit class PointerIdMutableBuilder[Self <: PointerId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragPlanePoint(value: Vector3): Self = StObject.set(x, "dragPlanePoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
  }
}
