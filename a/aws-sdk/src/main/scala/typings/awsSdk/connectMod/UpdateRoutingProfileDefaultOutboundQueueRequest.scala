package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRoutingProfileDefaultOutboundQueueRequest extends StObject {
  
  /**
    * The identifier for the default outbound queue.
    */
  var DefaultOutboundQueueId: QueueId
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The identifier of the routing profile.
    */
  var RoutingProfileId: typings.awsSdk.connectMod.RoutingProfileId
}
object UpdateRoutingProfileDefaultOutboundQueueRequest {
  
  inline def apply(DefaultOutboundQueueId: QueueId, InstanceId: InstanceId, RoutingProfileId: RoutingProfileId): UpdateRoutingProfileDefaultOutboundQueueRequest = {
    val __obj = js.Dynamic.literal(DefaultOutboundQueueId = DefaultOutboundQueueId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], RoutingProfileId = RoutingProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoutingProfileDefaultOutboundQueueRequest]
  }
  
  extension [Self <: UpdateRoutingProfileDefaultOutboundQueueRequest](x: Self) {
    
    inline def setDefaultOutboundQueueId(value: QueueId): Self = StObject.set(x, "DefaultOutboundQueueId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setRoutingProfileId(value: RoutingProfileId): Self = StObject.set(x, "RoutingProfileId", value.asInstanceOf[js.Any])
  }
}
