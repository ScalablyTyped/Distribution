package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutingProfileQueueReference extends js.Object {
  
  /**
    * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
    */
  var Channel: typings.awsSdk.connectMod.Channel = js.native
  
  /**
    * The identifier of the queue.
    */
  var QueueId: typings.awsSdk.connectMod.QueueId = js.native
}
object RoutingProfileQueueReference {
  
  @scala.inline
  def apply(Channel: Channel, QueueId: QueueId): RoutingProfileQueueReference = {
    val __obj = js.Dynamic.literal(Channel = Channel.asInstanceOf[js.Any], QueueId = QueueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingProfileQueueReference]
  }
  
  @scala.inline
  implicit class RoutingProfileQueueReferenceOps[Self <: RoutingProfileQueueReference] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: Channel): Self = this.set("Channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueId(value: QueueId): Self = this.set("QueueId", value.asInstanceOf[js.Any])
  }
}
