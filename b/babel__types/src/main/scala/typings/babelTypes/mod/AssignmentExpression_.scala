package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.AssignmentExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait AssignmentExpression_
  extends Expression
     with BaseNode {
  
  var left: LVal = js.native
  
  var operator: String = js.native
  
  var right: Expression = js.native
  
  @JSName("type")
  var type_AssignmentExpression_ : AssignmentExpression = js.native
}
object AssignmentExpression_ {
  
  @scala.inline
  def apply(left: LVal, operator: String, right: Expression, `type`: AssignmentExpression): AssignmentExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentExpression_]
  }
  
  @scala.inline
  implicit class AssignmentExpression_MutableBuilder[Self <: AssignmentExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: LVal): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AssignmentExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
