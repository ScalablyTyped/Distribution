package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.bpmnDashModdle.bpmnDashModdleMod.TypeDerived because Already inherited
- typings.bpmnDashModdle.bpmnDashModdleMod.BaseElement because var conflicts: $parent, $type. Inlined id, documentation, extensionDefinitions, extensionElements, $attrs */ trait Participant extends InteractionNode {
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
    processRef: Process,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): Participant = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, endPointRefs = endPointRefs, id = id, incomingConversationLinks = incomingConversationLinks, interfaceRef = interfaceRef, name = name, outgoingConversationLinks = outgoingConversationLinks, participantMultiplicity = participantMultiplicity, processRef = processRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[Participant]
  }
}

