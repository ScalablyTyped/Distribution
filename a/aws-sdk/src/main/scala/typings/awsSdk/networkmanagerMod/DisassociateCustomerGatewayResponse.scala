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
  def apply(CustomerGatewayAssociation: CustomerGatewayAssociation = null): DisassociateCustomerGatewayResponse = {
    val __obj = js.Dynamic.literal()
    if (CustomerGatewayAssociation != null) __obj.updateDynamic("CustomerGatewayAssociation")(CustomerGatewayAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateCustomerGatewayResponse]
  }
}

