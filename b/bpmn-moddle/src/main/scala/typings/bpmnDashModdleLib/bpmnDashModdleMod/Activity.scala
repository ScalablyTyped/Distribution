package typings
package bpmnDashModdleLib.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends FlowNode {
  var boundaryEventRefs: js.Array[BoundaryEvent]
  var completionQuantity: scala.Double
  var dataInputAssociations: js.Array[DataInputAssociation]
  var dataOutputAssociations: js.Array[DataOutputAssociation]
  var default: SequenceFlow
  var ioSpecification: InputOutputSpecification
  var isForCompensation: scala.Boolean
  var loopCharacteristics: LoopCharacteristics
  var properties: js.Array[Property]
  var resources: ResourceRole
  var startQuantity: scala.Double
}

object Activity {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    boundaryEventRefs: js.Array[BoundaryEvent],
    categoryValueRef: js.Array[CategoryValue],
    completionQuantity: scala.Double,
    dataInputAssociations: js.Array[DataInputAssociation],
    dataOutputAssociations: js.Array[DataOutputAssociation],
    default: SequenceFlow,
    id: java.lang.String,
    incoming: js.Array[SequenceFlow],
    ioSpecification: InputOutputSpecification,
    isForCompensation: scala.Boolean,
    lanes: js.Array[Lane],
    loopCharacteristics: LoopCharacteristics,
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    properties: js.Array[Property],
    resources: ResourceRole,
    startQuantity: scala.Double,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null,
    name: java.lang.String = null
  ): Activity = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, auditing = auditing, boundaryEventRefs = boundaryEventRefs, categoryValueRef = categoryValueRef, completionQuantity = completionQuantity, dataInputAssociations = dataInputAssociations, dataOutputAssociations = dataOutputAssociations, default = default, id = id, incoming = incoming, ioSpecification = ioSpecification, isForCompensation = isForCompensation, lanes = lanes, loopCharacteristics = loopCharacteristics, monitoring = monitoring, outgoing = outgoing, properties = properties, resources = resources, startQuantity = startQuantity)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Activity]
  }
}

