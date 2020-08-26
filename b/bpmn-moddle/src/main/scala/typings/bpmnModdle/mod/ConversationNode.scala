package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.BaseElement because var conflicts: $parent, $type. Inlined id, documentation, extensionDefinitions, extensionElements, $attrs */ @js.native
trait ConversationNode extends InteractionNode {
  /**
    * Attributes that aren't defined by the BPMN Spec such
    * as Camunda properties
    */
  @JSName("$attrs")
  var $attrs: js.UndefOr[StringDictionary[js.Any]] = js.native
  var correlationKeys: js.Array[CorrelationKey] = js.native
  /**
    * Documentation for the element
    */
  var documentation: js.UndefOr[js.Array[Documentation]] = js.native
  /**
    * Reference to the extension definitions for this element
    */
  var extensionDefinitions: js.UndefOr[js.Array[ExtensionDefinition]] = js.native
  /**
    * Extension Elements
    */
  var extensionElements: js.UndefOr[ExtensionElements] = js.native
  /**
    * Is the primary Id of the element
    */
  var id: String = js.native
  var messageFlowRefs: js.Array[MessageFlow] = js.native
  var name: String = js.native
  var participantRefs: js.Array[Participant] = js.native
}

object ConversationNode {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    correlationKeys: js.Array[CorrelationKey],
    id: String,
    incomingConversationLinks: js.Array[ConversationLink],
    messageFlowRefs: js.Array[MessageFlow],
    name: String,
    outgoingConversationLinks: js.Array[ConversationLink],
    participantRefs: js.Array[Participant]
  ): ConversationNode = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], correlationKeys = correlationKeys.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], messageFlowRefs = messageFlowRefs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], participantRefs = participantRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationNode]
  }
  @scala.inline
  implicit class ConversationNodeOps[Self <: ConversationNode] (val x: Self) extends AnyVal {
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
    def setCorrelationKeysVarargs(value: CorrelationKey*): Self = this.set("correlationKeys", js.Array(value :_*))
    @scala.inline
    def setCorrelationKeys(value: js.Array[CorrelationKey]): Self = this.set("correlationKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageFlowRefsVarargs(value: MessageFlow*): Self = this.set("messageFlowRefs", js.Array(value :_*))
    @scala.inline
    def setMessageFlowRefs(value: js.Array[MessageFlow]): Self = this.set("messageFlowRefs", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParticipantRefsVarargs(value: Participant*): Self = this.set("participantRefs", js.Array(value :_*))
    @scala.inline
    def setParticipantRefs(value: js.Array[Participant]): Self = this.set("participantRefs", value.asInstanceOf[js.Any])
    @scala.inline
    def set$attrs(value: StringDictionary[js.Any]): Self = this.set("$attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$attrs: Self = this.set("$attrs", js.undefined)
    @scala.inline
    def setDocumentationVarargs(value: Documentation*): Self = this.set("documentation", js.Array(value :_*))
    @scala.inline
    def setDocumentation(value: js.Array[Documentation]): Self = this.set("documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    @scala.inline
    def setExtensionDefinitionsVarargs(value: ExtensionDefinition*): Self = this.set("extensionDefinitions", js.Array(value :_*))
    @scala.inline
    def setExtensionDefinitions(value: js.Array[ExtensionDefinition]): Self = this.set("extensionDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensionDefinitions: Self = this.set("extensionDefinitions", js.undefined)
    @scala.inline
    def setExtensionElements(value: ExtensionElements): Self = this.set("extensionElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensionElements: Self = this.set("extensionElements", js.undefined)
  }
  
}

