package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ConditionalExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ConditionalExpression_
  extends Conditional
     with BaseNode
     with Expression {
  
  var alternate: Expression = js.native
  
  var consequent: Expression = js.native
  
  var test: Expression = js.native
  
  @JSName("type")
  var type_ConditionalExpression_ : ConditionalExpression = js.native
}
object ConditionalExpression_ {
  
  @scala.inline
  def apply(alternate: Expression, consequent: Expression, test: Expression, `type`: ConditionalExpression): ConditionalExpression_ = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalExpression_]
  }
  
  @scala.inline
  implicit class ConditionalExpression_Ops[Self <: ConditionalExpression_] (val x: Self) extends AnyVal {
    
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
    def setAlternate(value: Expression): Self = this.set("alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsequent(value: Expression): Self = this.set("consequent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: Expression): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ConditionalExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
