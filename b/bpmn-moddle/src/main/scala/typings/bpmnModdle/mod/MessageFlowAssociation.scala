package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageFlowAssociation
  extends StObject
     with BaseElement {
  
  var innerMessageFlowRef: MessageFlow
  
  var outerMessageFlowRef: MessageFlow
}
object MessageFlowAssociation {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    innerMessageFlowRef: MessageFlow,
    outerMessageFlowRef: MessageFlow
  ): MessageFlowAssociation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerMessageFlowRef = innerMessageFlowRef.asInstanceOf[js.Any], outerMessageFlowRef = outerMessageFlowRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageFlowAssociation]
  }
  
  extension [Self <: MessageFlowAssociation](x: Self) {
    
    inline def setInnerMessageFlowRef(value: MessageFlow): Self = StObject.set(x, "innerMessageFlowRef", value.asInstanceOf[js.Any])
    
    inline def setOuterMessageFlowRef(value: MessageFlow): Self = StObject.set(x, "outerMessageFlowRef", value.asInstanceOf[js.Any])
  }
}
