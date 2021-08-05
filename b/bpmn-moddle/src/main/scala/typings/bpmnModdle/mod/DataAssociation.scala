package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataAssociation
  extends StObject
     with BaseElement {
  
  var assignment: Assignment
  
  var sourceRef: ItemAwareElement
  
  var targetRef: ItemAwareElement
  
  var transformation: FormalExpression
}
object DataAssociation {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    assignment: Assignment,
    id: String,
    sourceRef: ItemAwareElement,
    targetRef: ItemAwareElement,
    transformation: FormalExpression
  ): DataAssociation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], assignment = assignment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sourceRef = sourceRef.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any], transformation = transformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataAssociation]
  }
  
  extension [Self <: DataAssociation](x: Self) {
    
    inline def setAssignment(value: Assignment): Self = StObject.set(x, "assignment", value.asInstanceOf[js.Any])
    
    inline def setSourceRef(value: ItemAwareElement): Self = StObject.set(x, "sourceRef", value.asInstanceOf[js.Any])
    
    inline def setTargetRef(value: ItemAwareElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
    
    inline def setTransformation(value: FormalExpression): Self = StObject.set(x, "transformation", value.asInstanceOf[js.Any])
  }
}
