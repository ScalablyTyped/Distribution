package typings.bezierJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ABC extends StObject {
  
  var A: Point
  
  var B: Point
  
  var C: Point
}
object ABC {
  
  inline def apply(A: Point, B: Point, C: Point): ABC = {
    val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], B = B.asInstanceOf[js.Any], C = C.asInstanceOf[js.Any])
    __obj.asInstanceOf[ABC]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ABC] (val x: Self) extends AnyVal {
    
    inline def setA(value: Point): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
    
    inline def setB(value: Point): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
    
    inline def setC(value: Point): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
  }
}
