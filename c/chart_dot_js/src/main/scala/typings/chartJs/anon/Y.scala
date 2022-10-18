package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Y extends StObject {
  
  var angle: Double
  
  var x: Double
  
  var y: Double
}
object Y {
  
  inline def apply(angle: Double, x: Double, y: Double): Y = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y]
  }
  
  extension [Self <: Y](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
