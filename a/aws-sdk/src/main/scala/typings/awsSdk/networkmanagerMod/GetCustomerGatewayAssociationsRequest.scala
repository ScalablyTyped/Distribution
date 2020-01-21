package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCustomerGatewayAssociationsRequest extends js.Object {
  /**
    * One or more customer gateway Amazon Resource Names (ARNs). For more information, see Resources Defined by Amazon EC2. The maximum is 10.
    */
  var CustomerGatewayArns: js.UndefOr[StringList] = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String = js.native
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.networkmanagerMod.MaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object GetCustomerGatewayAssociationsRequest {
  @scala.inline
  def apply(
    GlobalNetworkId: String,
    CustomerGatewayArns: StringList = null,
    MaxResults: Int | Double = null,
    NextToken: String = null
  ): GetCustomerGatewayAssociationsRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    if (CustomerGatewayArns != null) __obj.updateDynamic("CustomerGatewayArns")(CustomerGatewayArns.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomerGatewayAssociationsRequest]
  }
}

