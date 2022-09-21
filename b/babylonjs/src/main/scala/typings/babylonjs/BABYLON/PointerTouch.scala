package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerTouch extends StObject {
  
  /**
    * Id of touch. Unique for each finger.
    */
  var pointerId: Double
  
  /**
    * Event type passed from DOM.
    */
  var `type`: Any
  
  /**
    * X coordinate of touch.
    */
  var x: Double
  
  /**
    * Y coordinate of touch.
    */
  var y: Double
}
object PointerTouch {
  
  inline def apply(pointerId: Double, `type`: Any, x: Double, y: Double): PointerTouch = {
    val __obj = js.Dynamic.literal(pointerId = pointerId.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerTouch]
  }
  
  extension [Self <: PointerTouch](x: Self) {
    
    inline def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
