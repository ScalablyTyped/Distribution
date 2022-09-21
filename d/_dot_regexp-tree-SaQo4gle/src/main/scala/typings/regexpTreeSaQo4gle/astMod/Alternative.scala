package typings.regexpTreeSaQo4gle.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alternative
  extends StObject
     with Base[typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.Alternative]
     with Expression {
  
  var expressions: js.Array[Expression]
}
object Alternative {
  
  inline def apply(expressions: js.Array[Expression]): Alternative = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Alternative")
    __obj.asInstanceOf[Alternative]
  }
  
  extension [Self <: Alternative](x: Self) {
    
    inline def setExpressions(value: js.Array[Expression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsVarargs(value: Expression*): Self = StObject.set(x, "expressions", js.Array(value*))
  }
}
