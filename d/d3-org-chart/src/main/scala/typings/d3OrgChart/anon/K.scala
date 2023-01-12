package typings.d3OrgChart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait K extends StObject {
  
  var k: Double
  
  var x: Double
  
  var y: Double
}
object K {
  
  inline def apply(k: Double, x: Double, y: Double): K = {
    val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[K]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: K] (val x: Self) extends AnyVal {
    
    inline def setK(value: Double): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
