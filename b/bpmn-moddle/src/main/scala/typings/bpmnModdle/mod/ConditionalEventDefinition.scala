package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalEventDefinition
  extends StObject
     with BaseElement {
  
  var condition: Expression
}
object ConditionalEventDefinition {
  
  inline def apply($parent: TypeDerived, $type: ElementType, condition: Expression, id: String): ConditionalEventDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalEventDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalEventDefinition] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: Expression): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
  }
}
