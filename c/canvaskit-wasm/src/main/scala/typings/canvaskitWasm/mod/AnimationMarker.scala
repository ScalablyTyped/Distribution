package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationMarker extends StObject {
  
  var name: String
  
  var t0: Double
  
  // 0.0 to 1.0
  var t1: Double
}
object AnimationMarker {
  
  inline def apply(name: String, t0: Double, t1: Double): AnimationMarker = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], t0 = t0.asInstanceOf[js.Any], t1 = t1.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationMarker]
  }
  
  extension [Self <: AnimationMarker](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setT0(value: Double): Self = StObject.set(x, "t0", value.asInstanceOf[js.Any])
    
    inline def setT1(value: Double): Self = StObject.set(x, "t1", value.asInstanceOf[js.Any])
  }
}
