package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragPlanePoint extends StObject {
  
  var dragPlanePoint: Vector3 = js.native
  
  var pointerId: Double = js.native
}
object DragPlanePoint {
  
  @scala.inline
  def apply(dragPlanePoint: Vector3, pointerId: Double): DragPlanePoint = {
    val __obj = js.Dynamic.literal(dragPlanePoint = dragPlanePoint.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragPlanePoint]
  }
  
  @scala.inline
  implicit class DragPlanePointMutableBuilder[Self <: DragPlanePoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragPlanePoint(value: Vector3): Self = StObject.set(x, "dragPlanePoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
  }
}
