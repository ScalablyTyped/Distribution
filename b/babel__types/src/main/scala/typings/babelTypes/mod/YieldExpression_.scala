package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.YieldExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait YieldExpression_
  extends Expression
     with BaseNode
     with Terminatorless {
  
  var argument: Expression | Null = js.native
  
  var delegate: Boolean = js.native
  
  @JSName("type")
  var type_YieldExpression_ : YieldExpression = js.native
}
object YieldExpression_ {
  
  @scala.inline
  def apply(delegate: Boolean, `type`: YieldExpression): YieldExpression_ = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[YieldExpression_]
  }
  
  @scala.inline
  implicit class YieldExpression_Ops[Self <: YieldExpression_] (val x: Self) extends AnyVal {
    
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
    def setDelegate(value: Boolean): Self = this.set("delegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: YieldExpression): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgument(value: Expression): Self = this.set("argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentNull: Self = this.set("argument", null)
  }
}
