package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptTask extends Task {
  var script: String
  var scriptFormat: String
}

object ScriptTask {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    boundaryEventRefs: js.Array[BoundaryEvent],
    categoryValueRef: js.Array[CategoryValue],
    completionQuantity: Double,
    dataInputAssociations: js.Array[DataInputAssociation],
    dataOutputAssociations: js.Array[DataOutputAssociation],
    default: SequenceFlow,
    id: String,
    incoming: js.Array[SequenceFlow],
    incomingConversationLinks: js.Array[ConversationLink],
    ioSpecification: InputOutputSpecification,
    isForCompensation: Boolean,
    lanes: js.Array[Lane],
    loopCharacteristics: LoopCharacteristics,
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    outgoingConversationLinks: js.Array[ConversationLink],
    properties: js.Array[Property],
    resources: ResourceRole,
    script: String,
    scriptFormat: String,
    startQuantity: Double,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null,
    name: String = null
  ): ScriptTask = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, auditing = auditing, boundaryEventRefs = boundaryEventRefs, categoryValueRef = categoryValueRef, completionQuantity = completionQuantity, dataInputAssociations = dataInputAssociations, dataOutputAssociations = dataOutputAssociations, default = default, id = id, incoming = incoming, incomingConversationLinks = incomingConversationLinks, ioSpecification = ioSpecification, isForCompensation = isForCompensation, lanes = lanes, loopCharacteristics = loopCharacteristics, monitoring = monitoring, outgoing = outgoing, outgoingConversationLinks = outgoingConversationLinks, properties = properties, resources = resources, script = script, scriptFormat = scriptFormat, startQuantity = startQuantity)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ScriptTask]
  }
}

