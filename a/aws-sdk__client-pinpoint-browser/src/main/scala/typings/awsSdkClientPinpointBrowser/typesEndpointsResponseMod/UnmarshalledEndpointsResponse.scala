package typings.awsSdkClientPinpointBrowser.typesEndpointsResponseMod

import typings.awsSdkClientPinpointBrowser.typesEndpointResponseMod.UnmarshalledEndpointResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledEndpointsResponse extends EndpointsResponse {
  /**
    * The list of endpoints.
    */
  @JSName("Item")
  var Item_UnmarshalledEndpointsResponse: js.UndefOr[js.Array[UnmarshalledEndpointResponse]] = js.undefined
}

object UnmarshalledEndpointsResponse {
  @scala.inline
  def apply(Item: js.Array[UnmarshalledEndpointResponse] = null): UnmarshalledEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledEndpointsResponse]
  }
}

