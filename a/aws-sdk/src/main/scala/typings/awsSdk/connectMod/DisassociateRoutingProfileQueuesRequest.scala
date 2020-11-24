package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateRoutingProfileQueuesRequest extends js.Object {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The queues to disassociate from this routing profile.
    */
  var QueueReferences: RoutingProfileQueueReferenceList = js.native
  
  /**
    * The identifier of the routing profile.
    */
  var RoutingProfileId: typings.awsSdk.connectMod.RoutingProfileId = js.native
}
object DisassociateRoutingProfileQueuesRequest {
  
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    QueueReferences: RoutingProfileQueueReferenceList,
    RoutingProfileId: RoutingProfileId
  ): DisassociateRoutingProfileQueuesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], QueueReferences = QueueReferences.asInstanceOf[js.Any], RoutingProfileId = RoutingProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateRoutingProfileQueuesRequest]
  }
  
  @scala.inline
  implicit class DisassociateRoutingProfileQueuesRequestOps[Self <: DisassociateRoutingProfileQueuesRequest] (val x: Self) extends AnyVal {
    
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
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueReferencesVarargs(value: RoutingProfileQueueReference*): Self = this.set("QueueReferences", js.Array(value :_*))
    
    @scala.inline
    def setQueueReferences(value: RoutingProfileQueueReferenceList): Self = this.set("QueueReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingProfileId(value: RoutingProfileId): Self = this.set("RoutingProfileId", value.asInstanceOf[js.Any])
  }
}
