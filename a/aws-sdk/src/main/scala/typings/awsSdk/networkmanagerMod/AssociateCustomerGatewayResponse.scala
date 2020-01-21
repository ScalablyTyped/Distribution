package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateCustomerGatewayResponse extends js.Object {
  /**
    * The customer gateway association.
    */
  var CustomerGatewayAssociation: js.UndefOr[typings.awsSdk.networkmanagerMod.CustomerGatewayAssociation] = js.native
}

object AssociateCustomerGatewayResponse {
  @scala.inline
  def apply(CustomerGatewayAssociation: CustomerGatewayAssociation = null): AssociateCustomerGatewayResponse = {
    val __obj = js.Dynamic.literal()
    if (CustomerGatewayAssociation != null) __obj.updateDynamic("CustomerGatewayAssociation")(CustomerGatewayAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateCustomerGatewayResponse]
  }
}

