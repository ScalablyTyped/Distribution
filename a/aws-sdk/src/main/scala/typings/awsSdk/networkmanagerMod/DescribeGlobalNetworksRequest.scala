package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGlobalNetworksRequest extends js.Object {
  /**
    * The IDs of one or more global networks. The maximum is 10.
    */
  var GlobalNetworkIds: js.UndefOr[StringList] = js.native
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.networkmanagerMod.MaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeGlobalNetworksRequest {
  @scala.inline
  def apply(GlobalNetworkIds: StringList = null, MaxResults: Int | Double = null, NextToken: String = null): DescribeGlobalNetworksRequest = {
    val __obj = js.Dynamic.literal()
    if (GlobalNetworkIds != null) __obj.updateDynamic("GlobalNetworkIds")(GlobalNetworkIds.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGlobalNetworksRequest]
  }
}

