package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseEvent extends StObject {
  
  var mozMovementX: Double
  
  var mozMovementY: Double
  
  var msMovementX: Double
  
  var msMovementY: Double
  
  var webkitMovementX: Double
  
  var webkitMovementY: Double
}
object MouseEvent {
  
  inline def apply(
    mozMovementX: Double,
    mozMovementY: Double,
    msMovementX: Double,
    msMovementY: Double,
    webkitMovementX: Double,
    webkitMovementY: Double
  ): MouseEvent = {
    val __obj = js.Dynamic.literal(mozMovementX = mozMovementX.asInstanceOf[js.Any], mozMovementY = mozMovementY.asInstanceOf[js.Any], msMovementX = msMovementX.asInstanceOf[js.Any], msMovementY = msMovementY.asInstanceOf[js.Any], webkitMovementX = webkitMovementX.asInstanceOf[js.Any], webkitMovementY = webkitMovementY.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MouseEvent] (val x: Self) extends AnyVal {
    
    inline def setMozMovementX(value: Double): Self = StObject.set(x, "mozMovementX", value.asInstanceOf[js.Any])
    
    inline def setMozMovementY(value: Double): Self = StObject.set(x, "mozMovementY", value.asInstanceOf[js.Any])
    
    inline def setMsMovementX(value: Double): Self = StObject.set(x, "msMovementX", value.asInstanceOf[js.Any])
    
    inline def setMsMovementY(value: Double): Self = StObject.set(x, "msMovementY", value.asInstanceOf[js.Any])
    
    inline def setWebkitMovementX(value: Double): Self = StObject.set(x, "webkitMovementX", value.asInstanceOf[js.Any])
    
    inline def setWebkitMovementY(value: Double): Self = StObject.set(x, "webkitMovementY", value.asInstanceOf[js.Any])
  }
}
