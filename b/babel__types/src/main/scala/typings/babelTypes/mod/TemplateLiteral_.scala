package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TemplateLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TemplateLiteral_
  extends StObject
     with BaseNode
     with Expression
     with Literal
     with Standardized {
  
  var expressions: js.Array[Expression | TSType]
  
  var quasis: js.Array[TemplateElement_]
  
  @JSName("type")
  var type_TemplateLiteral_ : TemplateLiteral
}
object TemplateLiteral_ {
  
  inline def apply(expressions: js.Array[Expression | TSType], quasis: js.Array[TemplateElement_]): TemplateLiteral_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[TemplateLiteral_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateLiteral_] (val x: Self) extends AnyVal {
    
    inline def setExpressions(value: js.Array[Expression | TSType]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsVarargs(value: (Expression | TSType)*): Self = StObject.set(x, "expressions", js.Array(value*))
    
    inline def setQuasis(value: js.Array[TemplateElement_]): Self = StObject.set(x, "quasis", value.asInstanceOf[js.Any])
    
    inline def setQuasisVarargs(value: TemplateElement_ *): Self = StObject.set(x, "quasis", js.Array(value*))
    
    inline def setType(value: TemplateLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
