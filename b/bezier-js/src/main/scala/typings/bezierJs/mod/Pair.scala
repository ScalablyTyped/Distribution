package typings.bezierJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pair extends StObject {
  
  var left: Bezier
  
  var right: Bezier
}
object Pair {
  
  inline def apply(left: Bezier, right: Bezier): Pair = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pair]
  }
  
  extension [Self <: Pair](x: Self) {
    
    inline def setLeft(value: Bezier): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Bezier): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
