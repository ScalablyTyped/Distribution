package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGlobalNetworksResponse extends js.Object {
  /**
    * Information about the global networks.
    */
  var GlobalNetworks: js.UndefOr[GlobalNetworkList] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeGlobalNetworksResponse {
  @scala.inline
  def apply(GlobalNetworks: GlobalNetworkList = null, NextToken: String = null): DescribeGlobalNetworksResponse = {
    val __obj = js.Dynamic.literal()
    if (GlobalNetworks != null) __obj.updateDynamic("GlobalNetworks")(GlobalNetworks.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGlobalNetworksResponse]
  }
}

