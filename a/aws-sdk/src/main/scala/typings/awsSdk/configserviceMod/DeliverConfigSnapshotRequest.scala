package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliverConfigSnapshotRequest extends js.Object {
  /**
    * The name of the delivery channel through which the snapshot is delivered.
    */
  var deliveryChannelName: ChannelName = js.native
}

object DeliverConfigSnapshotRequest {
  @scala.inline
  def apply(deliveryChannelName: ChannelName): DeliverConfigSnapshotRequest = {
    val __obj = js.Dynamic.literal(deliveryChannelName = deliveryChannelName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeliverConfigSnapshotRequest]
  }
}

