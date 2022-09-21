package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DRAG extends StObject {
  
  var DRAG: Double
  
  var DRAG_WITH_CONTROLLER: Double
  
  var NEAR_DRAG: Double
  
  var NONE: Double
}
object DRAG {
  
  inline def apply(DRAG: Double, DRAG_WITH_CONTROLLER: Double, NEAR_DRAG: Double, NONE: Double): DRAG = {
    val __obj = js.Dynamic.literal(DRAG = DRAG.asInstanceOf[js.Any], DRAG_WITH_CONTROLLER = DRAG_WITH_CONTROLLER.asInstanceOf[js.Any], NEAR_DRAG = NEAR_DRAG.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any])
    __obj.asInstanceOf[DRAG]
  }
  
  extension [Self <: DRAG](x: Self) {
    
    inline def setDRAG(value: Double): Self = StObject.set(x, "DRAG", value.asInstanceOf[js.Any])
    
    inline def setDRAG_WITH_CONTROLLER(value: Double): Self = StObject.set(x, "DRAG_WITH_CONTROLLER", value.asInstanceOf[js.Any])
    
    inline def setNEAR_DRAG(value: Double): Self = StObject.set(x, "NEAR_DRAG", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
  }
}
