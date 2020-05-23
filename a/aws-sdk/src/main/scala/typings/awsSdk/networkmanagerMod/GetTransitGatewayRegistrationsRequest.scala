package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTransitGatewayRegistrationsRequest extends js.Object {
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
  /**
    * The Amazon Resource Names (ARNs) of one or more transit gateways. The maximum is 10.
    */
  var TransitGatewayArns: js.UndefOr[StringList] = js.native
}

object GetTransitGatewayRegistrationsRequest {
  @scala.inline
  def apply(
    GlobalNetworkId: String,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: String = null,
    TransitGatewayArns: StringList = null
  ): GetTransitGatewayRegistrationsRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TransitGatewayArns != null) __obj.updateDynamic("TransitGatewayArns")(TransitGatewayArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransitGatewayRegistrationsRequest]
  }
}

