package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterTransitGatewayRequest extends js.Object {
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String = js.native
  /**
    * The Amazon Resource Name (ARN) of the transit gateway. For more information, see Resources Defined by Amazon EC2.
    */
  var TransitGatewayArn: String = js.native
}

object RegisterTransitGatewayRequest {
  @scala.inline
  def apply(GlobalNetworkId: String, TransitGatewayArn: String): RegisterTransitGatewayRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], TransitGatewayArn = TransitGatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTransitGatewayRequest]
  }
}

