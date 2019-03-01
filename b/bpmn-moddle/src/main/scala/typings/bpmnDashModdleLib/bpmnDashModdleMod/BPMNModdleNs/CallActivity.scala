package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallActivity extends Activity {
  var calledElement: java.lang.String
}

object CallActivity {
  @scala.inline
  def apply(
    $type: ElementType,
    auditing: Auditing,
    boundaryEventRefs: js.Array[BoundaryEvent],
    calledElement: java.lang.String,
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
  ): CallActivity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("auditing")(auditing)
    __obj.updateDynamic("boundaryEventRefs")(boundaryEventRefs)
    __obj.updateDynamic("calledElement")(calledElement)
    __obj.updateDynamic("categoryValueRef")(categoryValueRef)
    __obj.updateDynamic("completionQuantity")(completionQuantity)
    __obj.updateDynamic("dataInputAssociations")(dataInputAssociations)
    __obj.updateDynamic("dataOutputAssociations")(dataOutputAssociations)
    __obj.updateDynamic("default")(default)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("incoming")(incoming)
    __obj.updateDynamic("ioSpecification")(ioSpecification)
    __obj.updateDynamic("isForCompensation")(isForCompensation)
    __obj.updateDynamic("lanes")(lanes)
    __obj.updateDynamic("loopCharacteristics")(loopCharacteristics)
    __obj.updateDynamic("monitoring")(monitoring)
    __obj.updateDynamic("outgoing")(outgoing)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("resources")(resources)
    __obj.updateDynamic("startQuantity")(startQuantity)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CallActivity]
  }
}

