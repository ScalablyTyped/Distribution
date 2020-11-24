package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class DeliverConfigSnapshotRequestOps[Self <: DeliverConfigSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeliveryChannelName(value: ChannelName): Self = this.set("deliveryChannelName", value.asInstanceOf[js.Any])
  }
}
