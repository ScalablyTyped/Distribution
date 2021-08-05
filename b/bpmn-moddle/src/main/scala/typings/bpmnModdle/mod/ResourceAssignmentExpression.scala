package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceAssignmentExpression
  extends StObject
     with BaseElement {
  
  var expression: Expression
}
object ResourceAssignmentExpression {
  
  inline def apply($parent: TypeDerived, $type: ElementType, expression: Expression, id: String): ResourceAssignmentExpression = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceAssignmentExpression]
  }
  
  extension [Self <: ResourceAssignmentExpression](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
  }
}
