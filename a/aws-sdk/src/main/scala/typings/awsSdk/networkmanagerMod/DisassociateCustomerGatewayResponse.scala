package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateCustomerGatewayResponse extends js.Object {
  /**
    * Information about the customer gateway association.
    */
  var CustomerGatewayAssociation: js.UndefOr[typings.awsSdk.networkmanagerMod.CustomerGatewayAssociation] = js.native
}

object DisassociateCustomerGatewayResponse {
  @scala.inline
  def apply(): DisassociateCustomerGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateCustomerGatewayResponse]
  }
  @scala.inline
  implicit class DisassociateCustomerGatewayResponseOps[Self <: DisassociateCustomerGatewayResponse] (val x: Self) extends AnyVal {
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
    def setCustomerGatewayAssociation(value: CustomerGatewayAssociation): Self = this.set("CustomerGatewayAssociation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerGatewayAssociation: Self = this.set("CustomerGatewayAssociation", js.undefined)
  }
  
}

