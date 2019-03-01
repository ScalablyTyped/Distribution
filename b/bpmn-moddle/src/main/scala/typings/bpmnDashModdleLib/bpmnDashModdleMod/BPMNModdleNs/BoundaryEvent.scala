package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundaryEvent extends CatchEvent {
  var attachedToRef: Activity
  /**
    * @default true
    */
  var cancelActivity: scala.Boolean
}

object BoundaryEvent {
  @scala.inline
  def apply(
    $type: ElementType,
    attachedToRef: Activity,
    auditing: Auditing,
    cancelActivity: scala.Boolean,
    categoryValueRef: js.Array[CategoryValue],
    dataOutputAssociations: js.Array[DataOutputAssociation],
    dataOutputs: js.Array[DataOutput],
    eventDefinitions: js.Array[EventDefinition],
    id: java.lang.String,
    incoming: js.Array[SequenceFlow],
    incomingConversationLinks: js.Array[ConversationLink],
    lanes: js.Array[Lane],
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    outgoingConversationLinks: js.Array[ConversationLink],
    outputSet: OutputSet,
    parallelMultiple: scala.Boolean,
    properties: js.Array[Property],
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null,
    name: java.lang.String = null
  ): BoundaryEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("attachedToRef")(attachedToRef)
    __obj.updateDynamic("auditing")(auditing)
    __obj.updateDynamic("cancelActivity")(cancelActivity)
    __obj.updateDynamic("categoryValueRef")(categoryValueRef)
    __obj.updateDynamic("dataOutputAssociations")(dataOutputAssociations)
    __obj.updateDynamic("dataOutputs")(dataOutputs)
    __obj.updateDynamic("eventDefinitions")(eventDefinitions)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("incoming")(incoming)
    __obj.updateDynamic("incomingConversationLinks")(incomingConversationLinks)
    __obj.updateDynamic("lanes")(lanes)
    __obj.updateDynamic("monitoring")(monitoring)
    __obj.updateDynamic("outgoing")(outgoing)
    __obj.updateDynamic("outgoingConversationLinks")(outgoingConversationLinks)
    __obj.updateDynamic("outputSet")(outputSet)
    __obj.updateDynamic("parallelMultiple")(parallelMultiple)
    __obj.updateDynamic("properties")(properties)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BoundaryEvent]
  }
}

