package typings.d3OrgChart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Params extends StObject {
  
  var params: Animate
  
  var x0: Double
  
  var x1: Double
  
  var y0: Double
  
  var y1: Double
}
object Params {
  
  inline def apply(params: Animate, x0: Double, x1: Double, y0: Double, y1: Double): Params = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
  
  extension [Self <: Params](x: Self) {
    
    inline def setParams(value: Animate): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
  }
}
