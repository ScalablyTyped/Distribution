package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataAssociation extends BaseElement {
  
  var assignment: Assignment = js.native
  
  var sourceRef: ItemAwareElement = js.native
  
  var targetRef: ItemAwareElement = js.native
  
  var transformation: FormalExpression = js.native
}
object DataAssociation {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class DataAssociationMutableBuilder[Self <: DataAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignment(value: Assignment): Self = StObject.set(x, "assignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRef(value: ItemAwareElement): Self = StObject.set(x, "sourceRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRef(value: ItemAwareElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformation(value: FormalExpression): Self = StObject.set(x, "transformation", value.asInstanceOf[js.Any])
  }
}
