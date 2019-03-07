package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThrowEvent extends Event {
  var dataInputAssociations: js.Array[DataInputAssociation]
  var dataInputs: js.Array[DataInput]
  var eventDefinitionRef: js.Array[EventDefinition]
  var eventDefinitions: js.Array[EventDefinition]
  var inputSet: InputSet
}

object ThrowEvent {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    dataInputAssociations: js.Array[DataInputAssociation],
    dataInputs: js.Array[DataInput],
    eventDefinitionRef: js.Array[EventDefinition],
    eventDefinitions: js.Array[EventDefinition],
    id: java.lang.String,
    incoming: js.Array[SequenceFlow],
    incomingConversationLinks: js.Array[ConversationLink],
    inputSet: InputSet,
    lanes: js.Array[Lane],
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    outgoingConversationLinks: js.Array[ConversationLink],
    properties: js.Array[Property],
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null,
    name: java.lang.String = null
  ): ThrowEvent = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, auditing = auditing, categoryValueRef = categoryValueRef, dataInputAssociations = dataInputAssociations, dataInputs = dataInputs, eventDefinitionRef = eventDefinitionRef, eventDefinitions = eventDefinitions, id = id, incoming = incoming, incomingConversationLinks = incomingConversationLinks, inputSet = inputSet, lanes = lanes, monitoring = monitoring, outgoing = outgoing, outgoingConversationLinks = outgoingConversationLinks, properties = properties)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ThrowEvent]
  }
}

