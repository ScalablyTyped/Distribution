package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.AssignmentExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait AssignmentExpression_
  extends StObject
     with BaseNode
     with Expression
     with Standardized {
  
  var left: LVal
  
  var operator: String
  
  var right: Expression
  
  @JSName("type")
  var type_AssignmentExpression_ : AssignmentExpression
}
object AssignmentExpression_ {
  
  inline def apply(left: LVal, operator: String, right: Expression): AssignmentExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[AssignmentExpression_]
  }
  
  extension [Self <: AssignmentExpression_](x: Self) {
    
    inline def setLeft(value: LVal): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: AssignmentExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
