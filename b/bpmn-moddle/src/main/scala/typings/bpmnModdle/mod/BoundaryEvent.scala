package typings.bpmnModdle.mod

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
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], attachedToRef = attachedToRef.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], cancelActivity = cancelActivity.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], dataOutputAssociations = dataOutputAssociations.asInstanceOf[js.Any], dataOutputs = dataOutputs.asInstanceOf[js.Any], eventDefinitions = eventDefinitions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], outputSet = outputSet.asInstanceOf[js.Any], parallelMultiple = parallelMultiple.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundaryEvent]
  }
}

