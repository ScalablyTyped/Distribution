package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateRoutingProfileQueuesRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The queues to associate with this routing profile.
    */
  var QueueConfigs: RoutingProfileQueueConfigList
  
  /**
    * The identifier of the routing profile.
    */
  var RoutingProfileId: typings.awsSdk.connectMod.RoutingProfileId
}
object AssociateRoutingProfileQueuesRequest {
  
  inline def apply(
    InstanceId: InstanceId,
    QueueConfigs: RoutingProfileQueueConfigList,
    RoutingProfileId: RoutingProfileId
  ): AssociateRoutingProfileQueuesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], QueueConfigs = QueueConfigs.asInstanceOf[js.Any], RoutingProfileId = RoutingProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateRoutingProfileQueuesRequest]
  }
  
  extension [Self <: AssociateRoutingProfileQueuesRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setQueueConfigs(value: RoutingProfileQueueConfigList): Self = StObject.set(x, "QueueConfigs", value.asInstanceOf[js.Any])
    
    inline def setQueueConfigsVarargs(value: RoutingProfileQueueConfig*): Self = StObject.set(x, "QueueConfigs", js.Array(value :_*))
    
    inline def setRoutingProfileId(value: RoutingProfileId): Self = StObject.set(x, "RoutingProfileId", value.asInstanceOf[js.Any])
  }
}
