package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSitesRequest extends js.Object {
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
    * One or more site IDs. The maximum is 10.
    */
  var SiteIds: js.UndefOr[StringList] = js.native
}

object GetSitesRequest {
  @scala.inline
  def apply(
    GlobalNetworkId: String,
    MaxResults: Int | Double = null,
    NextToken: String = null,
    SiteIds: StringList = null
  ): GetSitesRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SiteIds != null) __obj.updateDynamic("SiteIds")(SiteIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSitesRequest]
  }
}

