package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageFlowAssociation extends BaseElement {
  
  var innerMessageFlowRef: MessageFlow = js.native
  
  var outerMessageFlowRef: MessageFlow = js.native
}
object MessageFlowAssociation {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    innerMessageFlowRef: MessageFlow,
    outerMessageFlowRef: MessageFlow
  ): MessageFlowAssociation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerMessageFlowRef = innerMessageFlowRef.asInstanceOf[js.Any], outerMessageFlowRef = outerMessageFlowRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageFlowAssociation]
  }
  
  @scala.inline
  implicit class MessageFlowAssociationMutableBuilder[Self <: MessageFlowAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInnerMessageFlowRef(value: MessageFlow): Self = StObject.set(x, "innerMessageFlowRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterMessageFlowRef(value: MessageFlow): Self = StObject.set(x, "outerMessageFlowRef", value.asInstanceOf[js.Any])
  }
}
