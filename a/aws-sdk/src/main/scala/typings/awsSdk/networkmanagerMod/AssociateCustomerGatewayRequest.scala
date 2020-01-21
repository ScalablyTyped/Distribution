package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateCustomerGatewayRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the customer gateway. For more information, see Resources Defined by Amazon EC2.
    */
  var CustomerGatewayArn: String = js.native
  /**
    * The ID of the device.
    */
  var DeviceId: String = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String = js.native
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[String] = js.native
}

object AssociateCustomerGatewayRequest {
  @scala.inline
  def apply(CustomerGatewayArn: String, DeviceId: String, GlobalNetworkId: String, LinkId: String = null): AssociateCustomerGatewayRequest = {
    val __obj = js.Dynamic.literal(CustomerGatewayArn = CustomerGatewayArn.asInstanceOf[js.Any], DeviceId = DeviceId.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    if (LinkId != null) __obj.updateDynamic("LinkId")(LinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateCustomerGatewayRequest]
  }
}

