package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointBatchRequestMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointBatchItemMod._UnmarshalledEndpointBatchItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledEndpointBatchRequest extends _EndpointBatchRequest {
  /**
    * List of items to update. Maximum 100 items
    */
  @JSName("Item")
  var Item__UnmarshalledEndpointBatchRequest: js.UndefOr[js.Array[_UnmarshalledEndpointBatchItem]] = js.undefined
}

object _UnmarshalledEndpointBatchRequest {
  @scala.inline
  def apply(Item: js.Array[_UnmarshalledEndpointBatchItem] = null): _UnmarshalledEndpointBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledEndpointBatchRequest]
  }
}

