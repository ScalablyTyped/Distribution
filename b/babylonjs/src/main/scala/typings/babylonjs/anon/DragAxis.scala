package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragAxis extends StObject {
  
  var dragAxis: js.UndefOr[Vector3] = js.undefined
  
  var dragPlaneNormal: js.UndefOr[Vector3] = js.undefined
}
object DragAxis {
  
  inline def apply(): DragAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragAxis]
  }
  
  extension [Self <: DragAxis](x: Self) {
    
    inline def setDragAxis(value: Vector3): Self = StObject.set(x, "dragAxis", value.asInstanceOf[js.Any])
    
    inline def setDragAxisUndefined: Self = StObject.set(x, "dragAxis", js.undefined)
    
    inline def setDragPlaneNormal(value: Vector3): Self = StObject.set(x, "dragPlaneNormal", value.asInstanceOf[js.Any])
    
    inline def setDragPlaneNormalUndefined: Self = StObject.set(x, "dragPlaneNormal", js.undefined)
  }
}
