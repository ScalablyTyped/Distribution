package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.SequenceExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait SequenceExpression_
  extends Expression
     with BaseNode {
  
  var expressions: js.Array[Expression] = js.native
  
  @JSName("type")
  var type_SequenceExpression_ : SequenceExpression = js.native
}
object SequenceExpression_ {
  
  @scala.inline
  def apply(expressions: js.Array[Expression], `type`: SequenceExpression): SequenceExpression_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceExpression_]
  }
  
  @scala.inline
  implicit class SequenceExpression_Ops[Self <: SequenceExpression_] (val x: Self) extends AnyVal {
    
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
    def setExpressionsVarargs(value: Expression*): Self = this.set("expressions", js.Array(value :_*))
    
    @scala.inline
    def setExpressions(value: js.Array[Expression]): Self = this.set("expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: SequenceExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
