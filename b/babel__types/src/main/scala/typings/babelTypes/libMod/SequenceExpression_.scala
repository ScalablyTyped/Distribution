package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.SequenceExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceExpression_
  extends StObject
     with BaseNode
     with Expression
     with Node
     with Standardized {
  
  var expressions: js.Array[Expression]
  
  @JSName("type")
  var type_SequenceExpression_ : SequenceExpression
}
object SequenceExpression_ {
  
  inline def apply(expressions: js.Array[Expression]): SequenceExpression_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[SequenceExpression_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SequenceExpression_] (val x: Self) extends AnyVal {
    
    inline def setExpressions(value: js.Array[Expression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsVarargs(value: Expression*): Self = StObject.set(x, "expressions", js.Array(value*))
    
    inline def setType(value: SequenceExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
