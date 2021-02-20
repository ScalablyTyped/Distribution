package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplexGateway extends Gateway {
  
  var default: SequenceFlow = js.native
  
  var activationCondition: Expression = js.native
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
    id: String,
    incoming: js.Array[SequenceFlow],
    lanes: js.Array[Lane],
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow]
  ): ComplexGateway = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], activationCondition = activationCondition.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], gatewayDirection = gatewayDirection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexGateway]
  }
  
  @scala.inline
  implicit class ComplexGatewayMutableBuilder[Self <: ComplexGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivationCondition(value: Expression): Self = StObject.set(x, "activationCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: SequenceFlow): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
