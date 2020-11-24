package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TemplateLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
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
  implicit class TemplateLiteral_Ops[Self <: TemplateLiteral_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExpressionsVarargs(value: (Expression | TSType)*): Self = this.set("expressions", js.Array(value :_*))
    
    @scala.inline
    def setExpressions(value: js.Array[Expression | TSType]): Self = this.set("expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuasisVarargs(value: TemplateElement_ *): Self = this.set("quasis", js.Array(value :_*))
    
    @scala.inline
    def setQuasis(value: js.Array[TemplateElement_]): Self = this.set("quasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TemplateLiteral): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
