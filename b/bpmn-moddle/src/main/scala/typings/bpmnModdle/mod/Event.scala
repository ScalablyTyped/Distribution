package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.InteractionNode because var conflicts: $parent, $type. Inlined incomingConversationLinks, outgoingConversationLinks */ @js.native
trait Event extends FlowNode {
  var incomingConversationLinks: js.Array[ConversationLink] = js.native
  var outgoingConversationLinks: js.Array[ConversationLink] = js.native
  var properties: js.Array[Property] = js.native
}

object Event {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    id: String,
    incoming: js.Array[SequenceFlow],
    incomingConversationLinks: js.Array[ConversationLink],
    lanes: js.Array[Lane],
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    outgoingConversationLinks: js.Array[ConversationLink],
    properties: js.Array[Property]
  ): Event = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIncomingConversationLinksVarargs(value: ConversationLink*): Self = this.set("incomingConversationLinks", js.Array(value :_*))
    @scala.inline
    def setIncomingConversationLinks(value: js.Array[ConversationLink]): Self = this.set("incomingConversationLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutgoingConversationLinksVarargs(value: ConversationLink*): Self = this.set("outgoingConversationLinks", js.Array(value :_*))
    @scala.inline
    def setOutgoingConversationLinks(value: js.Array[ConversationLink]): Self = this.set("outgoingConversationLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertiesVarargs(value: Property*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: js.Array[Property]): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
  
}

