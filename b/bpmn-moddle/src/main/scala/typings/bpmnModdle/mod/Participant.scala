package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.BaseElement because var conflicts: $parent, $type. Inlined id, documentation, extensionDefinitions, extensionElements, $attrs */ trait Participant
  extends StObject
     with InteractionNode {
  
  /**
    * Attributes that aren't defined by the BPMN Spec such
    * as Camunda properties
    */
  @JSName("$attrs")
  var $attrs: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Documentation for the element
    */
  var documentation: js.UndefOr[js.Array[Documentation]] = js.undefined
  
  var endPointRefs: js.Array[EndPoint]
  
  /**
    * Reference to the extension definitions for this element
    */
  var extensionDefinitions: js.UndefOr[js.Array[ExtensionDefinition]] = js.undefined
  
  /**
    * Extension Elements
    */
  var extensionElements: js.UndefOr[ExtensionElements] = js.undefined
  
  /**
    * Is the primary Id of the element
    */
  var id: String
  
  var interfaceRef: js.Array[Interface]
  
  var name: String
  
  var participantMultiplicity: ParticipantMultiplicity
  
  var processRef: Process
}
object Participant {
  
  inline def apply(
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
  
  extension [Self <: Participant](x: Self) {
    
    inline def set$attrs(value: StringDictionary[js.Any]): Self = StObject.set(x, "$attrs", value.asInstanceOf[js.Any])
    
    inline def set$attrsUndefined: Self = StObject.set(x, "$attrs", js.undefined)
    
    inline def setDocumentation(value: js.Array[Documentation]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setDocumentationVarargs(value: Documentation*): Self = StObject.set(x, "documentation", js.Array(value :_*))
    
    inline def setEndPointRefs(value: js.Array[EndPoint]): Self = StObject.set(x, "endPointRefs", value.asInstanceOf[js.Any])
    
    inline def setEndPointRefsVarargs(value: EndPoint*): Self = StObject.set(x, "endPointRefs", js.Array(value :_*))
    
    inline def setExtensionDefinitions(value: js.Array[ExtensionDefinition]): Self = StObject.set(x, "extensionDefinitions", value.asInstanceOf[js.Any])
    
    inline def setExtensionDefinitionsUndefined: Self = StObject.set(x, "extensionDefinitions", js.undefined)
    
    inline def setExtensionDefinitionsVarargs(value: ExtensionDefinition*): Self = StObject.set(x, "extensionDefinitions", js.Array(value :_*))
    
    inline def setExtensionElements(value: ExtensionElements): Self = StObject.set(x, "extensionElements", value.asInstanceOf[js.Any])
    
    inline def setExtensionElementsUndefined: Self = StObject.set(x, "extensionElements", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInterfaceRef(value: js.Array[Interface]): Self = StObject.set(x, "interfaceRef", value.asInstanceOf[js.Any])
    
    inline def setInterfaceRefVarargs(value: Interface*): Self = StObject.set(x, "interfaceRef", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParticipantMultiplicity(value: ParticipantMultiplicity): Self = StObject.set(x, "participantMultiplicity", value.asInstanceOf[js.Any])
    
    inline def setProcessRef(value: Process): Self = StObject.set(x, "processRef", value.asInstanceOf[js.Any])
  }
}
