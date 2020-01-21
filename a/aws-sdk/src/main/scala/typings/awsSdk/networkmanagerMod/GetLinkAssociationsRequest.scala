package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLinkAssociationsRequest extends js.Object {
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[String] = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String = js.native
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[String] = js.native
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.networkmanagerMod.MaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object GetLinkAssociationsRequest {
  @scala.inline
  def apply(
    GlobalNetworkId: String,
    DeviceId: String = null,
    LinkId: String = null,
    MaxResults: Int | Double = null,
    NextToken: String = null
  ): GetLinkAssociationsRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    if (DeviceId != null) __obj.updateDynamic("DeviceId")(DeviceId.asInstanceOf[js.Any])
    if (LinkId != null) __obj.updateDynamic("LinkId")(LinkId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLinkAssociationsRequest]
  }
}

