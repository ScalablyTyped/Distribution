package typings.bezierJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offset
  extends StObject
     with Point {
  
  var c: Point
  
  var n: Point
}
object Offset {
  
  inline def apply(c: Point, n: Point, x: Double, y: Double): Offset = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  extension [Self <: Offset](x: Self) {
    
    inline def setC(value: Point): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setN(value: Point): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
  }
}
