package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRoutingProfileDefaultOutboundQueueRequest extends js.Object {
  
  /**
    * The identifier for the default outbound queue.
    */
  var DefaultOutboundQueueId: QueueId = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The identifier of the routing profile.
    */
  var RoutingProfileId: typings.awsSdk.connectMod.RoutingProfileId = js.native
}
object UpdateRoutingProfileDefaultOutboundQueueRequest {
  
  @scala.inline
  def apply(DefaultOutboundQueueId: QueueId, InstanceId: InstanceId, RoutingProfileId: RoutingProfileId): UpdateRoutingProfileDefaultOutboundQueueRequest = {
    val __obj = js.Dynamic.literal(DefaultOutboundQueueId = DefaultOutboundQueueId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], RoutingProfileId = RoutingProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoutingProfileDefaultOutboundQueueRequest]
  }
  
  @scala.inline
  implicit class UpdateRoutingProfileDefaultOutboundQueueRequestOps[Self <: UpdateRoutingProfileDefaultOutboundQueueRequest] (val x: Self) extends AnyVal {
    
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
    def setDefaultOutboundQueueId(value: QueueId): Self = this.set("DefaultOutboundQueueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingProfileId(value: RoutingProfileId): Self = this.set("RoutingProfileId", value.asInstanceOf[js.Any])
  }
}
