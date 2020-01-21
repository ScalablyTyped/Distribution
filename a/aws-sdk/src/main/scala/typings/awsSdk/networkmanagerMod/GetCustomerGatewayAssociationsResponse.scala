package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCustomerGatewayAssociationsResponse extends js.Object {
  /**
    * The customer gateway associations.
    */
  var CustomerGatewayAssociations: js.UndefOr[CustomerGatewayAssociationList] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object GetCustomerGatewayAssociationsResponse {
  @scala.inline
  def apply(CustomerGatewayAssociations: CustomerGatewayAssociationList = null, NextToken: String = null): GetCustomerGatewayAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    if (CustomerGatewayAssociations != null) __obj.updateDynamic("CustomerGatewayAssociations")(CustomerGatewayAssociations.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomerGatewayAssociationsResponse]
  }
}

