package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointsResponseMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointResponseMod._UnmarshalledEndpointResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledEndpointsResponse extends _EndpointsResponse {
  /**
    * The list of endpoints.
    */
  @JSName("Item")
  var Item__UnmarshalledEndpointsResponse: js.UndefOr[js.Array[_UnmarshalledEndpointResponse]] = js.undefined
}

object _UnmarshalledEndpointsResponse {
  @scala.inline
  def apply(Item: js.Array[_UnmarshalledEndpointResponse] = null): _UnmarshalledEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledEndpointsResponse]
  }
}

