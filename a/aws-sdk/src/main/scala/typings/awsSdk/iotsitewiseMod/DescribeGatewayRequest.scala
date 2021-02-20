package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGatewayRequest extends StObject {
  
  /**
    * The ID of the gateway device.
    */
  var gatewayId: ID = js.native
}
object DescribeGatewayRequest {
  
  @scala.inline
  def apply(gatewayId: ID): DescribeGatewayRequest = {
    val __obj = js.Dynamic.literal(gatewayId = gatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGatewayRequest]
  }
  
  @scala.inline
  implicit class DescribeGatewayRequestMutableBuilder[Self <: DescribeGatewayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayId(value: ID): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
  }
}
