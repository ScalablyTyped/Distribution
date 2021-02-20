package typings.bezierJs.BezierJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ABC extends StObject {
  
  var A: Point = js.native
  
  var B: Point = js.native
  
  var C: Point = js.native
}
object ABC {
  
  @scala.inline
  def apply(A: Point, B: Point, C: Point): ABC = {
    val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], B = B.asInstanceOf[js.Any], C = C.asInstanceOf[js.Any])
    __obj.asInstanceOf[ABC]
  }
  
  @scala.inline
  implicit class ABCMutableBuilder[Self <: ABC] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: Point): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: Point): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC(value: Point): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
  }
}
