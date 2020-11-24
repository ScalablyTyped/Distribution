package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.JSXExpressionContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait JSXExpressionContainer_
  extends Immutable
     with BaseNode
     with JSX {
  
  var expression: Expression | JSXEmptyExpression_ = js.native
  
  @JSName("type")
  var type_JSXExpressionContainer_ : JSXExpressionContainer = js.native
}
object JSXExpressionContainer_ {
  
  @scala.inline
  def apply(expression: Expression | JSXEmptyExpression_, `type`: JSXExpressionContainer): JSXExpressionContainer_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXExpressionContainer_]
  }
  
  @scala.inline
  implicit class JSXExpressionContainer_Ops[Self <: JSXExpressionContainer_] (val x: Self) extends AnyVal {
    
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
    def setExpression(value: Expression | JSXEmptyExpression_): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JSXExpressionContainer): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
