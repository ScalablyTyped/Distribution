package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.AssignmentExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignmentExpression_
  extends StObject
     with BaseNode
     with Expression
     with Node
     with Standardized {
  
  var left: LVal
  
  var operator: String
  
  var right: Expression
  
  @JSName("type")
  var type_AssignmentExpression_ : AssignmentExpression
}
object AssignmentExpression_ {
  
  inline def apply(left: LVal, operator: String, right: Expression): AssignmentExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[AssignmentExpression_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssignmentExpression_] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: LVal): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: AssignmentExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
