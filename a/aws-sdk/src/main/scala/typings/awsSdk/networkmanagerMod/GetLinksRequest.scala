package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLinksRequest extends js.Object {
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String = js.native
  /**
    * One or more link IDs. The maximum is 10.
    */
  var LinkIds: js.UndefOr[StringList] = js.native
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.networkmanagerMod.MaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The link provider.
    */
  var Provider: js.UndefOr[String] = js.native
  /**
    * The ID of the site.
    */
  var SiteId: js.UndefOr[String] = js.native
  /**
    * The link type.
    */
  var Type: js.UndefOr[String] = js.native
}

object GetLinksRequest {
  @scala.inline
  def apply(
    GlobalNetworkId: String,
    LinkIds: StringList = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: String = null,
    Provider: String = null,
    SiteId: String = null,
    Type: String = null
  ): GetLinksRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    if (LinkIds != null) __obj.updateDynamic("LinkIds")(LinkIds.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Provider != null) __obj.updateDynamic("Provider")(Provider.asInstanceOf[js.Any])
    if (SiteId != null) __obj.updateDynamic("SiteId")(SiteId.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLinksRequest]
  }
}

