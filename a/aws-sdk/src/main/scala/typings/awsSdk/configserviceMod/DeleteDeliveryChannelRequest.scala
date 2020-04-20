package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDeliveryChannelRequest extends js.Object {
  /**
    * The name of the delivery channel to delete.
    */
  var DeliveryChannelName: ChannelName = js.native
}

object DeleteDeliveryChannelRequest {
  @scala.inline
  def apply(DeliveryChannelName: ChannelName): DeleteDeliveryChannelRequest = {
    val __obj = js.Dynamic.literal(DeliveryChannelName = DeliveryChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeliveryChannelRequest]
  }
}

