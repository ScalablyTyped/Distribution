package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateCustomerGatewayRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the customer gateway. For more information, see Resources Defined by Amazon EC2.
    */
  var CustomerGatewayArn: String = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String = js.native
}

object DisassociateCustomerGatewayRequest {
  @scala.inline
  def apply(CustomerGatewayArn: String, GlobalNetworkId: String): DisassociateCustomerGatewayRequest = {
    val __obj = js.Dynamic.literal(CustomerGatewayArn = CustomerGatewayArn.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateCustomerGatewayRequest]
  }
}

