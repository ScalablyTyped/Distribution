package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs.BaseElement because var conflicts: $type. Inlined id, documentation, extensionDefinitions, extensionElements, $attrs */ trait Participant extends InteractionNode {
  /**
    * Attributes that aren't defined by the BPMN Spec such
    * as Camunda properties
    */
  @JSName("$attrs")
  var $attrs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
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
  var id: java.lang.String
  var interfaceRef: js.Array[Interface]
  var name: java.lang.String
  var participantMultiplicity: ParticipantMultiplicity
  var processRef: Process
}

object Participant {
  @scala.inline
  def apply(
    $type: ElementType,
    endPointRefs: js.Array[EndPoint],
    id: java.lang.String,
    incomingConversationLinks: js.Array[ConversationLink],
    interfaceRef: js.Array[Interface],
    name: java.lang.String,
    outgoingConversationLinks: js.Array[ConversationLink],
    participantMultiplicity: ParticipantMultiplicity,
    processRef: Process,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): Participant = {
    val __obj = js.Dynamic.literal($type = $type, endPointRefs = endPointRefs, id = id, incomingConversationLinks = incomingConversationLinks, interfaceRef = interfaceRef, name = name, outgoingConversationLinks = outgoingConversationLinks, participantMultiplicity = participantMultiplicity, processRef = processRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[Participant]
  }
}

