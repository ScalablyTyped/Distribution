package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ExpressionStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ExpressionStatement_
  extends ExpressionWrapper
     with BaseNode
     with Statement {
  
  var expression: Expression = js.native
  
  @JSName("type")
  var type_ExpressionStatement_ : ExpressionStatement = js.native
}
object ExpressionStatement_ {
  
  @scala.inline
  def apply(expression: Expression, `type`: ExpressionStatement): ExpressionStatement_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionStatement_]
  }
  
  @scala.inline
  implicit class ExpressionStatement_Ops[Self <: ExpressionStatement_] (val x: Self) extends AnyVal {
    
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
    def setExpression(value: Expression): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExpressionStatement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
