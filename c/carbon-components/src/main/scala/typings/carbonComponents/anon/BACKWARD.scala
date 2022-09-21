package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BACKWARD extends StObject {
  
  var BACKWARD: Double
  
  var FORWARD: Double
}
object BACKWARD {
  
  inline def apply(BACKWARD: Double, FORWARD: Double): BACKWARD = {
    val __obj = js.Dynamic.literal(BACKWARD = BACKWARD.asInstanceOf[js.Any], FORWARD = FORWARD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BACKWARD]
  }
  
  extension [Self <: BACKWARD](x: Self) {
    
    inline def setBACKWARD(value: Double): Self = StObject.set(x, "BACKWARD", value.asInstanceOf[js.Any])
    
    inline def setFORWARD(value: Double): Self = StObject.set(x, "FORWARD", value.asInstanceOf[js.Any])
  }
}
