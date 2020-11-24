package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.BaseElement because var conflicts: $parent, $type. Inlined id, documentation, extensionDefinitions, extensionElements, $attrs */ @js.native
trait Participant extends InteractionNode {
  
  /**
    * Attributes that aren't defined by the BPMN Spec such
    * as Camunda properties
    */
  @JSName("$attrs")
  var $attrs: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Documentation for the element
    */
  var documentation: js.UndefOr[js.Array[Documentation]] = js.native
  
  var endPointRefs: js.Array[EndPoint] = js.native
  
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
  
  var interfaceRef: js.Array[Interface] = js.native
  
  var name: String = js.native
  
  var participantMultiplicity: ParticipantMultiplicity = js.native
  
  var processRef: Process = js.native
}
object Participant {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    endPointRefs: js.Array[EndPoint],
    id: String,
    incomingConversationLinks: js.Array[ConversationLink],
    interfaceRef: js.Array[Interface],
    name: String,
    outgoingConversationLinks: js.Array[ConversationLink],
    participantMultiplicity: ParticipantMultiplicity,
    processRef: Process
  ): Participant = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], endPointRefs = endPointRefs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], interfaceRef = interfaceRef.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], participantMultiplicity = participantMultiplicity.asInstanceOf[js.Any], processRef = processRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Participant]
  }
  
  @scala.inline
  implicit class ParticipantOps[Self <: Participant] (val x: Self) extends AnyVal {
    
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
    def setEndPointRefsVarargs(value: EndPoint*): Self = this.set("endPointRefs", js.Array(value :_*))
    
    @scala.inline
    def setEndPointRefs(value: js.Array[EndPoint]): Self = this.set("endPointRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceRefVarargs(value: Interface*): Self = this.set("interfaceRef", js.Array(value :_*))
    
    @scala.inline
    def setInterfaceRef(value: js.Array[Interface]): Self = this.set("interfaceRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantMultiplicity(value: ParticipantMultiplicity): Self = this.set("participantMultiplicity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessRef(value: Process): Self = this.set("processRef", value.asInstanceOf[js.Any])
    
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
