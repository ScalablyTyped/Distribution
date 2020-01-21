package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDevicesRequest extends js.Object {
  /**
    * One or more device IDs. The maximum is 10.
    */
  var DeviceIds: js.UndefOr[StringList] = js.native
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
    * The ID of the site.
    */
  var SiteId: js.UndefOr[String] = js.native
}

object GetDevicesRequest {
  @scala.inline
  def apply(
    GlobalNetworkId: String,
    DeviceIds: StringList = null,
    MaxResults: Int | Double = null,
    NextToken: String = null,
    SiteId: String = null
  ): GetDevicesRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    if (DeviceIds != null) __obj.updateDynamic("DeviceIds")(DeviceIds.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SiteId != null) __obj.updateDynamic("SiteId")(SiteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevicesRequest]
  }
}

