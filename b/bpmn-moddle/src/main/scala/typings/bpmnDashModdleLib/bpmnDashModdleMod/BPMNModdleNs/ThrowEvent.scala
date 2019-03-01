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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("auditing")(auditing)
    __obj.updateDynamic("categoryValueRef")(categoryValueRef)
    __obj.updateDynamic("dataInputAssociations")(dataInputAssociations)
    __obj.updateDynamic("dataInputs")(dataInputs)
    __obj.updateDynamic("eventDefinitionRef")(eventDefinitionRef)
    __obj.updateDynamic("eventDefinitions")(eventDefinitions)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("incoming")(incoming)
    __obj.updateDynamic("incomingConversationLinks")(incomingConversationLinks)
    __obj.updateDynamic("inputSet")(inputSet)
    __obj.updateDynamic("lanes")(lanes)
    __obj.updateDynamic("monitoring")(monitoring)
    __obj.updateDynamic("outgoing")(outgoing)
    __obj.updateDynamic("outgoingConversationLinks")(outgoingConversationLinks)
    __obj.updateDynamic("properties")(properties)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ThrowEvent]
  }
}

