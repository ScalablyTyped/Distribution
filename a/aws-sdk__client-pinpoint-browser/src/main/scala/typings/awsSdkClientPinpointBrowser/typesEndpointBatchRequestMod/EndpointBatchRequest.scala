package typings.awsSdkClientPinpointBrowser.typesEndpointBatchRequestMod

import typings.awsSdkClientPinpointBrowser.typesEndpointBatchItemMod.EndpointBatchItem
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointBatchRequest extends js.Object {
  /**
    * List of items to update. Maximum 100 items
    */
  var Item: js.UndefOr[js.Array[EndpointBatchItem] | Iterable[EndpointBatchItem]] = js.undefined
}

object EndpointBatchRequest {
  @scala.inline
  def apply(Item: js.Array[EndpointBatchItem] | Iterable[EndpointBatchItem] = null): EndpointBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointBatchRequest]
  }
}

