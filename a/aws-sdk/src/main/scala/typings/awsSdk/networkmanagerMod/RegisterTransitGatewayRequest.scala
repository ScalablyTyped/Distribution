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
  @scala.inline
  implicit class RegisterTransitGatewayRequestOps[Self <: RegisterTransitGatewayRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGlobalNetworkId(value: String): Self = this.set("GlobalNetworkId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitGatewayArn(value: String): Self = this.set("TransitGatewayArn", value.asInstanceOf[js.Any])
  }
  
}

