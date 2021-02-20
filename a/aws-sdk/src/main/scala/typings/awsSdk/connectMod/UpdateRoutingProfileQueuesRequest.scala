package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRoutingProfileQueuesRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The queues to be updated for this routing profile.
    */
  var QueueConfigs: RoutingProfileQueueConfigList = js.native
  
  /**
    * The identifier of the routing profile.
    */
  var RoutingProfileId: typings.awsSdk.connectMod.RoutingProfileId = js.native
}
object UpdateRoutingProfileQueuesRequest {
  
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    QueueConfigs: RoutingProfileQueueConfigList,
    RoutingProfileId: RoutingProfileId
  ): UpdateRoutingProfileQueuesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], QueueConfigs = QueueConfigs.asInstanceOf[js.Any], RoutingProfileId = RoutingProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoutingProfileQueuesRequest]
  }
  
  @scala.inline
  implicit class UpdateRoutingProfileQueuesRequestMutableBuilder[Self <: UpdateRoutingProfileQueuesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueConfigs(value: RoutingProfileQueueConfigList): Self = StObject.set(x, "QueueConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueConfigsVarargs(value: RoutingProfileQueueConfig*): Self = StObject.set(x, "QueueConfigs", js.Array(value :_*))
    
    @scala.inline
    def setRoutingProfileId(value: RoutingProfileId): Self = StObject.set(x, "RoutingProfileId", value.asInstanceOf[js.Any])
  }
}
