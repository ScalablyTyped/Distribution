package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TemplateLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TemplateLiteral_
  extends Expression
     with BaseNode
     with Literal {
  
  var expressions: js.Array[Expression | TSType] = js.native
  
  var quasis: js.Array[TemplateElement_] = js.native
  
  @JSName("type")
  var type_TemplateLiteral_ : TemplateLiteral = js.native
}
object TemplateLiteral_ {
  
  @scala.inline
  def apply(
    expressions: js.Array[Expression | TSType],
    quasis: js.Array[TemplateElement_],
    `type`: TemplateLiteral
  ): TemplateLiteral_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateLiteral_]
  }
  
  @scala.inline
  implicit class TemplateLiteral_MutableBuilder[Self <: TemplateLiteral_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpressions(value: js.Array[Expression | TSType]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionsVarargs(value: (Expression | TSType)*): Self = StObject.set(x, "expressions", js.Array(value :_*))
    
    @scala.inline
    def setQuasis(value: js.Array[TemplateElement_]): Self = StObject.set(x, "quasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuasisVarargs(value: TemplateElement_ *): Self = StObject.set(x, "quasis", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TemplateLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
