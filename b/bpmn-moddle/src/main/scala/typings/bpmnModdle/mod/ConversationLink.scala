package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversationLink extends BaseElement {
  
  var name: String = js.native
  
  var sourceRef: InteractionNode = js.native
  
  var targetRef: InteractionNode = js.native
}
object ConversationLink {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    name: String,
    sourceRef: InteractionNode,
    targetRef: InteractionNode
  ): ConversationLink = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sourceRef = sourceRef.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationLink]
  }
  
  @scala.inline
  implicit class ConversationLinkMutableBuilder[Self <: ConversationLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRef(value: InteractionNode): Self = StObject.set(x, "sourceRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRef(value: InteractionNode): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
  }
}
