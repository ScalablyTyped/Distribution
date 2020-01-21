package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointBatchRequest extends js.Object {
  /**
    * An array that defines the endpoints to create or update and, for each endpoint, the property values to set or change. An array can contain a maximum of 100 items.
    */
  var Item: ListOfEndpointBatchItem = js.native
}

object EndpointBatchRequest {
  @scala.inline
  def apply(Item: ListOfEndpointBatchItem): EndpointBatchRequest = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EndpointBatchRequest]
  }
}

