package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGatewayResponse extends StObject {
  
  /**
    * The ARN of the gateway, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:gateway/${GatewayId} 
    */
  var gatewayArn: ARN = js.native
  
  /**
    * The ID of the gateway device. You can use this ID when you call other AWS IoT SiteWise APIs.
    */
  var gatewayId: ID = js.native
}
object CreateGatewayResponse {
  
  @scala.inline
  def apply(gatewayArn: ARN, gatewayId: ID): CreateGatewayResponse = {
    val __obj = js.Dynamic.literal(gatewayArn = gatewayArn.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGatewayResponse]
  }
  
  @scala.inline
  implicit class CreateGatewayResponseMutableBuilder[Self <: CreateGatewayResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayArn(value: ARN): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayId(value: ID): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
  }
}
