package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXSpreadChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait JSXSpreadChild_
  extends Immutable
     with BaseNode
     with JSX {
  
  var expression: Expression = js.native
  
  @JSName("type")
  var type_JSXSpreadChild_ : JSXSpreadChild = js.native
}
object JSXSpreadChild_ {
  
  @scala.inline
  def apply(expression: Expression, `type`: JSXSpreadChild): JSXSpreadChild_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXSpreadChild_]
  }
  
  @scala.inline
  implicit class JSXSpreadChild_Ops[Self <: JSXSpreadChild_] (val x: Self) extends AnyVal {
    
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
    def setType(value: JSXSpreadChild): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
