package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.AwaitExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait AwaitExpression_
  extends Expression
     with BaseNode
     with Terminatorless {
  
  var argument: Expression = js.native
  
  @JSName("type")
  var type_AwaitExpression_ : AwaitExpression = js.native
}
object AwaitExpression_ {
  
  @scala.inline
  def apply(argument: Expression, `type`: AwaitExpression): AwaitExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwaitExpression_]
  }
  
  @scala.inline
  implicit class AwaitExpression_Ops[Self <: AwaitExpression_] (val x: Self) extends AnyVal {
    
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
    def setArgument(value: Expression): Self = this.set("argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AwaitExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
