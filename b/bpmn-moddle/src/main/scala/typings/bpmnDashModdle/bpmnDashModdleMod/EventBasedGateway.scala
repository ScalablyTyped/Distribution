package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventBasedGateway extends Gateway {
  /**
    * @default Exclusive
    */
  var eventGatewayType: EventBasedGatewayType
  var instantiate: Boolean
}

object EventBasedGateway {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    eventGatewayType: EventBasedGatewayType,
    gatewayDirection: GatewayDirection,
    id: String,
    incoming: js.Array[SequenceFlow],
    instantiate: Boolean,
    lanes: js.Array[Lane],
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null,
    name: String = null
  ): EventBasedGateway = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, auditing = auditing, categoryValueRef = categoryValueRef, eventGatewayType = eventGatewayType, gatewayDirection = gatewayDirection, id = id, incoming = incoming, instantiate = instantiate, lanes = lanes, monitoring = monitoring, outgoing = outgoing)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[EventBasedGateway]
  }
}

