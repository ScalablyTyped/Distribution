package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mag extends StObject {
  
  var mag: Double
  
  var min: Double
}
object Mag {
  
  inline def apply(mag: Double, min: Double): Mag = {
    val __obj = js.Dynamic.literal(mag = mag.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mag]
  }
  
  extension [Self <: Mag](x: Self) {
    
    inline def setMag(value: Double): Self = StObject.set(x, "mag", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
