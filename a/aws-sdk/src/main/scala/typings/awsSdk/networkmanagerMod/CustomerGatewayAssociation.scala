package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerGatewayAssociation extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the customer gateway.
    */
  var CustomerGatewayArn: js.UndefOr[String] = js.native
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[String] = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.native
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[String] = js.native
  /**
    * The association state.
    */
  var State: js.UndefOr[CustomerGatewayAssociationState] = js.native
}

object CustomerGatewayAssociation {
  @scala.inline
  def apply(): CustomerGatewayAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerGatewayAssociation]
  }
  @scala.inline
  implicit class CustomerGatewayAssociationOps[Self <: CustomerGatewayAssociation] (val x: Self) extends AnyVal {
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
    def setCustomerGatewayArn(value: String): Self = this.set("CustomerGatewayArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerGatewayArn: Self = this.set("CustomerGatewayArn", js.undefined)
    @scala.inline
    def setDeviceId(value: String): Self = this.set("DeviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("DeviceId", js.undefined)
    @scala.inline
    def setGlobalNetworkId(value: String): Self = this.set("GlobalNetworkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalNetworkId: Self = this.set("GlobalNetworkId", js.undefined)
    @scala.inline
    def setLinkId(value: String): Self = this.set("LinkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkId: Self = this.set("LinkId", js.undefined)
    @scala.inline
    def setState(value: CustomerGatewayAssociationState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

