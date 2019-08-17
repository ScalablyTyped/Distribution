package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointsResponseMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointResponseMod._EndpointResponse
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _EndpointsResponse extends js.Object {
  /**
    * The list of endpoints.
    */
  var Item: js.UndefOr[js.Array[_EndpointResponse] | Iterable[_EndpointResponse]] = js.undefined
}

object _EndpointsResponse {
  @scala.inline
  def apply(Item: js.Array[_EndpointResponse] | Iterable[_EndpointResponse] = null): _EndpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EndpointsResponse]
  }
}

