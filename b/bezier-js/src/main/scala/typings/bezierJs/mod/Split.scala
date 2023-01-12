package typings.bezierJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Split
  extends StObject
     with Pair {
  
  var _t1: js.UndefOr[Double] = js.undefined
  
  var _t2: js.UndefOr[Double] = js.undefined
  
  var span: js.Array[Point]
}
object Split {
  
  inline def apply(left: Bezier, right: Bezier, span: js.Array[Point]): Split = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[Split]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Split] (val x: Self) extends AnyVal {
    
    inline def setSpan(value: js.Array[Point]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanVarargs(value: Point*): Self = StObject.set(x, "span", js.Array(value*))
    
    inline def set_t1(value: Double): Self = StObject.set(x, "_t1", value.asInstanceOf[js.Any])
    
    inline def set_t1Undefined: Self = StObject.set(x, "_t1", js.undefined)
    
    inline def set_t2(value: Double): Self = StObject.set(x, "_t2", value.asInstanceOf[js.Any])
    
    inline def set_t2Undefined: Self = StObject.set(x, "_t2", js.undefined)
  }
}
