package typings.awsSdkClientPinpointBrowser.typesEndpointBatchRequestMod

import typings.awsSdkClientPinpointBrowser.typesEndpointBatchItemMod.UnmarshalledEndpointBatchItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledEndpointBatchRequest extends EndpointBatchRequest {
  /**
    * List of items to update. Maximum 100 items
    */
  @JSName("Item")
  var Item_UnmarshalledEndpointBatchRequest: js.UndefOr[js.Array[UnmarshalledEndpointBatchItem]] = js.undefined
}

object UnmarshalledEndpointBatchRequest {
  @scala.inline
  def apply(Item: js.Array[UnmarshalledEndpointBatchItem] = null): UnmarshalledEndpointBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledEndpointBatchRequest]
  }
}

