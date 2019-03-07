package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplexGateway extends Gateway {
  var activationCondition: Expression
  var default: SequenceFlow
}

object ComplexGateway {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    activationCondition: Expression,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    default: SequenceFlow,
    gatewayDirection: GatewayDirection,
    id: java.lang.String,
    incoming: js.Array[SequenceFlow],
    lanes: js.Array[Lane],
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null,
    name: java.lang.String = null
  ): ComplexGateway = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, activationCondition = activationCondition, auditing = auditing, categoryValueRef = categoryValueRef, default = default, gatewayDirection = gatewayDirection, id = id, incoming = incoming, lanes = lanes, monitoring = monitoring, outgoing = outgoing)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ComplexGateway]
  }
}

