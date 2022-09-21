package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutingProfileQueueConfigSummary extends StObject {
  
  /**
    * The channels this queue supports.
    */
  var Channel: typings.awsSdk.connectMod.Channel
  
  /**
    * The delay, in seconds, that a contact should be in the queue before they are routed to an available agent. For more information, see Queues: priority and delay in the Amazon Connect Administrator Guide.
    */
  var Delay: typings.awsSdk.connectMod.Delay
  
  /**
    * The order in which contacts are to be handled for the queue. For more information, see Queues: priority and delay.
    */
  var Priority: typings.awsSdk.connectMod.Priority
  
  /**
    * The Amazon Resource Name (ARN) of the queue.
    */
  var QueueArn: ARN
  
  /**
    * The identifier for the queue.
    */
  var QueueId: typings.awsSdk.connectMod.QueueId
  
  /**
    * The name of the queue.
    */
  var QueueName: typings.awsSdk.connectMod.QueueName
}
object RoutingProfileQueueConfigSummary {
  
  inline def apply(
    Channel: Channel,
    Delay: Delay,
    Priority: Priority,
    QueueArn: ARN,
    QueueId: QueueId,
    QueueName: QueueName
  ): RoutingProfileQueueConfigSummary = {
    val __obj = js.Dynamic.literal(Channel = Channel.asInstanceOf[js.Any], Delay = Delay.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], QueueArn = QueueArn.asInstanceOf[js.Any], QueueId = QueueId.asInstanceOf[js.Any], QueueName = QueueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingProfileQueueConfigSummary]
  }
  
  extension [Self <: RoutingProfileQueueConfigSummary](x: Self) {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: Delay): Self = StObject.set(x, "Delay", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Priority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setQueueArn(value: ARN): Self = StObject.set(x, "QueueArn", value.asInstanceOf[js.Any])
    
    inline def setQueueId(value: QueueId): Self = StObject.set(x, "QueueId", value.asInstanceOf[js.Any])
    
    inline def setQueueName(value: QueueName): Self = StObject.set(x, "QueueName", value.asInstanceOf[js.Any])
  }
}
