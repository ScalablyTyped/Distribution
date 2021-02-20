package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeliverConfigSnapshotRequest extends StObject {
  
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
  implicit class DeliverConfigSnapshotRequestMutableBuilder[Self <: DeliverConfigSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryChannelName(value: ChannelName): Self = StObject.set(x, "deliveryChannelName", value.asInstanceOf[js.Any])
  }
}
