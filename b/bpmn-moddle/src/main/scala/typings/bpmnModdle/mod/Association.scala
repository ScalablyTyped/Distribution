package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Association
  extends StObject
     with BaseElement {
  
  var associationDirection: AssociationDirection
  
  var sourceRef: BaseElement
  
  var targetRef: BaseElement
}
object Association {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    associationDirection: AssociationDirection,
    id: String,
    sourceRef: BaseElement,
    targetRef: BaseElement
  ): Association = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], associationDirection = associationDirection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sourceRef = sourceRef.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Association]
  }
  
  extension [Self <: Association](x: Self) {
    
    inline def setAssociationDirection(value: AssociationDirection): Self = StObject.set(x, "associationDirection", value.asInstanceOf[js.Any])
    
    inline def setSourceRef(value: BaseElement): Self = StObject.set(x, "sourceRef", value.asInstanceOf[js.Any])
    
    inline def setTargetRef(value: BaseElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
  }
}
