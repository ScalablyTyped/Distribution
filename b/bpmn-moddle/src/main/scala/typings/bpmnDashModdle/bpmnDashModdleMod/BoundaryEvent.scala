package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundaryEvent extends CatchEvent {
  var attachedToRef: Activity
  /**
    * @default true
    */
  var cancelActivity: Boolean
}

object BoundaryEvent {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    attachedToRef: Activity,
    auditing: Auditing,
    cancelActivity: Boolean,
    categoryValueRef: js.Array[CategoryValue],
    dataOutputAssociations: js.Array[DataOutputAssociation],
    dataOutputs: js.Array[DataOutput],
    eventDefinitions: js.Array[EventDefinition],
    id: String,
    incoming: js.Array[SequenceFlow],
    incomingConversationLinks: js.Array[ConversationLink],
    lanes: js.Array[Lane],
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    outgoingConversationLinks: js.Array[ConversationLink],
    outputSet: OutputSet,
    parallelMultiple: Boolean,
    properties: js.Array[Property],
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null,
    name: String = null
  ): BoundaryEvent = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, attachedToRef = attachedToRef, auditing = auditing, cancelActivity = cancelActivity, categoryValueRef = categoryValueRef, dataOutputAssociations = dataOutputAssociations, dataOutputs = dataOutputs, eventDefinitions = eventDefinitions, id = id, incoming = incoming, incomingConversationLinks = incomingConversationLinks, lanes = lanes, monitoring = monitoring, outgoing = outgoing, outgoingConversationLinks = outgoingConversationLinks, outputSet = outputSet, parallelMultiple = parallelMultiple, properties = properties)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BoundaryEvent]
  }
}

