package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateRoutingProfileQueuesRequest extends StObject {
  
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
  implicit class DisassociateRoutingProfileQueuesRequestMutableBuilder[Self <: DisassociateRoutingProfileQueuesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueReferences(value: RoutingProfileQueueReferenceList): Self = StObject.set(x, "QueueReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueReferencesVarargs(value: RoutingProfileQueueReference*): Self = StObject.set(x, "QueueReferences", js.Array(value :_*))
    
    @scala.inline
    def setRoutingProfileId(value: RoutingProfileId): Self = StObject.set(x, "RoutingProfileId", value.asInstanceOf[js.Any])
  }
}
