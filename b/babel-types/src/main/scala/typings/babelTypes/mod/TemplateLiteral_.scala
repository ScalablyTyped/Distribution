package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TemplateLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateLiteral_
  extends StObject
     with Node
     with Expression
     with Literal {
  
  var expressions: js.Array[Expression]
  
  var quasis: js.Array[TemplateElement_]
  
  @JSName("type")
  var type_TemplateLiteral_ : TemplateLiteral
}
object TemplateLiteral_ {
  
  inline def apply(
    end: Double,
    expressions: js.Array[Expression],
    loc: SourceLocation,
    quasis: js.Array[TemplateElement_],
    start: Double
  ): TemplateLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expressions = expressions.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[TemplateLiteral_]
  }
  
  extension [Self <: TemplateLiteral_](x: Self) {
    
    inline def setExpressions(value: js.Array[Expression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsVarargs(value: Expression*): Self = StObject.set(x, "expressions", js.Array(value*))
    
    inline def setQuasis(value: js.Array[TemplateElement_]): Self = StObject.set(x, "quasis", value.asInstanceOf[js.Any])
    
    inline def setQuasisVarargs(value: TemplateElement_ *): Self = StObject.set(x, "quasis", js.Array(value*))
    
    inline def setType(value: TemplateLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
