package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WheelDeltaX extends StObject {
  
  var wheelDeltaX: Double
  
  var wheelDeltaY: Double
  
  var wheelDeltaZ: Double
}
object WheelDeltaX {
  
  inline def apply(wheelDeltaX: Double, wheelDeltaY: Double, wheelDeltaZ: Double): WheelDeltaX = {
    val __obj = js.Dynamic.literal(wheelDeltaX = wheelDeltaX.asInstanceOf[js.Any], wheelDeltaY = wheelDeltaY.asInstanceOf[js.Any], wheelDeltaZ = wheelDeltaZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[WheelDeltaX]
  }
  
  extension [Self <: WheelDeltaX](x: Self) {
    
    inline def setWheelDeltaX(value: Double): Self = StObject.set(x, "wheelDeltaX", value.asInstanceOf[js.Any])
    
    inline def setWheelDeltaY(value: Double): Self = StObject.set(x, "wheelDeltaY", value.asInstanceOf[js.Any])
    
    inline def setWheelDeltaZ(value: Double): Self = StObject.set(x, "wheelDeltaZ", value.asInstanceOf[js.Any])
  }
}
