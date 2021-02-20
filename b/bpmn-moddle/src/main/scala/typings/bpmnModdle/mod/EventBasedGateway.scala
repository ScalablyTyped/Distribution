package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventBasedGateway extends Gateway {
  
  /**
    * @default Exclusive
    */
  var eventGatewayType: EventBasedGatewayType = js.native
  
  var instantiate: Boolean = js.native
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
    outgoing: js.Array[SequenceFlow]
  ): EventBasedGateway = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], eventGatewayType = eventGatewayType.asInstanceOf[js.Any], gatewayDirection = gatewayDirection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], instantiate = instantiate.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBasedGateway]
  }
  
  @scala.inline
  implicit class EventBasedGatewayMutableBuilder[Self <: EventBasedGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventGatewayType(value: EventBasedGatewayType): Self = StObject.set(x, "eventGatewayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstantiate(value: Boolean): Self = StObject.set(x, "instantiate", value.asInstanceOf[js.Any])
  }
}
