package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.SequenceExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceExpression_
  extends StObject
     with Node
     with Expression {
  
  var expressions: js.Array[Expression]
  
  @JSName("type")
  var type_SequenceExpression_ : SequenceExpression
}
object SequenceExpression_ {
  
  inline def apply(end: Double, expressions: js.Array[Expression], loc: SourceLocation, start: Double): SequenceExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expressions = expressions.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[SequenceExpression_]
  }
  
  extension [Self <: SequenceExpression_](x: Self) {
    
    inline def setExpressions(value: js.Array[Expression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsVarargs(value: Expression*): Self = StObject.set(x, "expressions", js.Array(value*))
    
    inline def setType(value: SequenceExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
